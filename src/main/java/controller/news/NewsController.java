package controller.news;

import business.news.impl.NewServiceImpl;
import business.news.service.NewService;

import com.jfinal.core.Controller;

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
}
