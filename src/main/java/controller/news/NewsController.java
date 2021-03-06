package controller.news;

import java.io.File;
import java.util.List;

import Util.StringUtil;
import base.APIMessage;
import business.news.impl.NewServiceImpl;
import business.news.service.NewService;

import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;

import entity.news.NewsInfo;



public class NewsController extends Controller {
	
	private NewService newService = new NewServiceImpl();
	
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
	
	/**
	  * @Discription:跳转到添加新闻页面
	  * @return void
	  * @Author: zhouhezhen
	  * @Date: 2015年11月26日 下午2:03:01
	  * @ModifyUser：zhouhezhen
	  * @ModifyDate: 2015年11月26日 下午2:03:01
	 */
	 public void addNew(){
		render("../WEB-INF/news/add_new.jsp");
	 }
	 
	 /**
	   * @Discription:添加新闻
	   * @return void
	   * @Author: zhouhezhen
	   * @Date: 2015年12月2日 上午9:25:33
	   * @ModifyUser：zhouhezhen
	   * @ModifyDate: 2015年12月2日 上午9:25:33
	  */
	 public void publishNew(){
		 try{
			 /** 获取参数 */
			 String title = null;
			 String author = null;
			 String date = null;
			 String status = null;
			 String description = null;
			 String cover = null;
			 try{
				  title =this.getPara("title");
				  author =this.getPara("author");
				  date =this.getPara("date");
				  status = this.getPara("status");
				  description = this.getPara("description");
				  UploadFile uf =getFile("file","D:/Users");
				  String Title = uf.getFileName();
				  Long length = uf.getFile().length();
				  System.out.println(uf.getSaveDirectory() +File.separator + uf.getFileName());
				  System.out.println( uf.getOriginalFileName() );
			 }catch(Exception e){
				 e.printStackTrace();
				 renderJson(APIMessage.SYS_PARSE_PARAM_ERROR.warpper());
				 return;
			 }
			 /**参数校验*/
			 if(StringUtil.isBlank(title)){
				 renderJson(APIMessage.NEW_TITLE_ERROR.warpper());
					return; 
			 }
			 this.newService.publishNew(title, author, status, description, date, cover);
			 redirect("/news/findNewList");//重定向
		 }catch(Exception e){
			 e.printStackTrace();
			 renderJson("code",APIMessage.SYS_UNKNOW_ERROR.warpper());
		 }
	 }
	 
	 /**
	   * @Discription:状态修改：发布新闻
	   * @return void
	   * @Author: zhouhezhen
	   * @Date: 2015年11月27日 下午5:21:36
	   * @ModifyUser：zhouhezhen
	   * @ModifyDate: 2015年11月27日 下午5:21:36
	  */
	 public void publish(){
		 try {
				/** 获取参数 */
				String newId = null;
				try{
					newId = (String) this.getPara("newId");
				}catch(Exception e){
					 e.printStackTrace();
					 renderJson(APIMessage.SYS_PARSE_PARAM_ERROR.warpper());
					 return;
				}
				 /**参数校验*/
				 if(StringUtil.isBlank(newId)){
					renderJson(APIMessage.NEW_ID_ERROR.warpper());
					return; 
				 }
				/**状态修改：发布新闻*/
				this.newService.publish(newId);
				redirect("/news/findNewList");
			}catch(Exception e){
				e.printStackTrace();
				renderJson("code",APIMessage.SYS_UNKNOW_ERROR.warpper());
			}
	 }
	 
	 /**
	   * @Discription:状态修改：新闻草稿
	   * @return void
	   * @Author: zhouhezhen
	   * @Date: 2015年11月27日 下午7:05:17
	   * @ModifyUser：zhouhezhen
	   * @ModifyDate: 2015年11月27日 下午7:05:17
	  */
	 public void draft(){
		 try {
				/** 获取参数 */
				String newId = null;
				try{
					newId = (String) this.getPara("newId");
				}catch(Exception e){
					 e.printStackTrace();
					 renderJson(APIMessage.SYS_PARSE_PARAM_ERROR.warpper());
					 return;
				}
				 /**参数校验*/
				 if(StringUtil.isBlank(newId)){
					renderJson(APIMessage.NEW_ID_ERROR.warpper());
					return; 
				 }
				/**状态修改：新闻草稿*/
				this.newService.draft(newId);
				redirect("/news/findNewList");
			}catch(Exception e){
				e.printStackTrace();
				renderJson("code",APIMessage.SYS_UNKNOW_ERROR.warpper());
			}
	 }
	 
	 /**
	   * @Discription:删除新闻
	   * @return void
	   * @Author: zhouhezhen
	   * @Date: 2015年11月27日 下午7:06:40
	   * @ModifyUser：zhouhezhen
	   * @ModifyDate: 2015年11月27日 下午7:06:40
	  */
	 public void delete(){
		 try {
				/** 获取参数 */
				String newId = null;
				try{
					newId = (String) this.getPara("newId");
				}catch(Exception e){
					 e.printStackTrace();
					 renderJson(APIMessage.SYS_PARSE_PARAM_ERROR.warpper());
					 return;
				}
				 /**参数校验*/
				 if(StringUtil.isBlank(newId)){
					renderJson(APIMessage.NEW_ID_ERROR.warpper());
					return; 
				 }
				/**删除新闻*/
				this.newService.delete(newId);
				redirect("/news/findNewList");
			}catch(Exception e){
				e.printStackTrace();
				renderJson("code",APIMessage.SYS_UNKNOW_ERROR.warpper());
			}
	 }
	 
	 /**
	   * @Discription:新闻详情
	   * @return void
	   * @Author: zhouhezhen
	   * @Date: 2015年11月30日 上午10:00:46
	   * @ModifyUser：zhouhezhen
	   * @ModifyDate: 2015年11月30日 上午10:00:46
	  */
	 public void findDetail(){
		 try {
				/** 获取参数 */
				String newId = null;
				try{
					newId = (String) this.getPara("newId");
				}catch(Exception e){
					 e.printStackTrace();
					 renderJson(APIMessage.SYS_PARSE_PARAM_ERROR.warpper());
					 return;
				}
				 /**参数校验*/
				 if(StringUtil.isBlank(newId)){
					renderJson(APIMessage.NEW_ID_ERROR.warpper());
					return; 
				 }
				/**删除新闻*/
				NewsInfo NewsInfo = this.newService.findDetail(newId);
				this.setAttr("new" , NewsInfo );
				render("../WEB-INF/news/new_info.jsp");
			}catch(Exception e){
				e.printStackTrace();
				renderJson("code",APIMessage.SYS_UNKNOW_ERROR.warpper());
			}
	 }
	 
}
