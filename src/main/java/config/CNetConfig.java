package config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

import controller.news.NewsRouter;
import entity.news.NewsInfo;
import entity.news.NewsMenu;

public class CNetConfig extends JFinalConfig{
	
	/**
	  * @Discription:配置jfinal常量
	  * @Author: zhouhezhen
	  * @Date: 2015年11月16日 下午3:26:07
	  * @see com.jfinal.config.JFinalConfig#configConstant(com.jfinal.config.Constants)
	 */
	@Override
	public void configConstant(Constants arg0) {
		//devMode==true时ActionReporter打印action信息，freemarker模板会及时刷新
		PropKit.use("DB.txt");
		arg0.setDevMode(PropKit.getBoolean("devMode", false));
		arg0.setViewType(ViewType.JSP);
		arg0.setEncoding("utf-8");
	}

	/**
	  * @Discription:Handler可以接管所有 web 请求，并对应用拥有完的控制权
	  * @Author: zhouhezhen
	  * @Date: 2015年11月16日 下午3:38:55
	  * @see com.jfinal.config.JFinalConfig#configHandler(com.jfinal.config.Handlers)
	 */
	public void configHandler(Handlers arg0) {
	}

	/**
	  * @Discription:在此处配置的拦截器将会对所有的请求进行拦截
	  * @Author: zhouhezhen
	  * @see com.jfinal.config.JFinalConfig#configInterceptor(com.jfinal.config.Interceptors)
	 */
	public void configInterceptor(Interceptors arg0) {

	}
	
	/**
	  * @Discription:如下代码配置了 C3p0 数据库连接池插件与 ActiveRecord数据库访问插件
	  * @Author: zhouhezhen
	  * @Date: 2015年11月16日 下午3:41:46
	  * @see com.jfinal.config.JFinalConfig#configPlugin(com.jfinal.config.Plugins)
	 */
	@Override
	public void configPlugin(Plugins arg0) {
		C3p0Plugin cp = new C3p0Plugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
		arg0.add(cp);
		ActiveRecordPlugin arp=new ActiveRecordPlugin(cp);
		arp.setShowSql(true);
		arp.addMapping("NEWS_INFO","ID",NewsInfo.class);
		arg0.add(arp);
	}
	
	/**
	  * @Discription:配置 JFinal 访问路由
	  * @Author: zhouhezhen
	  * @Date: 2015年11月16日 下午3:43:04
	  * @see com.jfinal.config.JFinalConfig#configRoute(com.jfinal.config.Routes)
	 */
	@Override
	public void configRoute(Routes arg0) {
		arg0.add(new NewsRouter());
	}
	
}
