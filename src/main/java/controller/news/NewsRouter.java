package controller.news;

import com.jfinal.config.Routes;

public class NewsRouter extends Routes{
	
	/**
	  * @Discription:路由配置
	  * @Author: zhouhezhen
	  * @ModifyDate: 2015年11月19日 下午4:25:36
	  * @see com.jfinal.config.Routes#config()
	 */
	@Override
	public void config() {
		add("/news",NewsController.class);
	}
	
}
