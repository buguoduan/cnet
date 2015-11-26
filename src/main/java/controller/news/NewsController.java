package controller.news;

import java.sql.Timestamp;
import java.util.List;

import business.news.impl.NewServiceImpl;
import business.news.service.NewService;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

import entity.news.NewsInfo;



public class NewsController extends Controller {
	
	private static NewService newService = new NewServiceImpl();
	
	/**
	  * @Discription:查询新闻详情
	  * @return void
	  * @ModifyUser：zhouhezhen
	  * @ModifyDate: 2015年11月19日 下午2:49:19
	 */
	public void findNewInfo(){
		try {
			/** 获取参数 */
			String newId = null;
			try{
				newId = (String) this.getPara("newId");
			}catch(Exception e){
				e.printStackTrace();
				renderJson("code", "新闻id为空");
				return;
			}
			/**查询新闻详情*/
			NewsInfo newsInfo = this.newService.findNewInfo(newId);
			render("../new/news_info.jsp");
		}catch(Exception e){
			e.printStackTrace();
			renderJson("code", "查询异常");
		}
	}
	
	/**
	  * @Discription:查询新闻列表
	  * @return void
	  * @ModifyUser：zhouhezhen
	  * @ModifyDate: 2015年11月19日 下午2:49:19
	 */
	public void findNewList(){
		try {
			/**查询新闻详情*/
			List<NewsInfo> newsInfo = this.newService.findNewList();
			this.setAttr("news", newsInfo);
			render("../WEB-INF/news/news_list.jsp");
		}catch(Exception e){
			e.printStackTrace();
			renderJson("code", "查询异常");
		}
	}
	
	 public void addNew(){
		render("../WEB-INF/news/add_new.jsp");
	 }
}
