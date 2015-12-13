package business.news.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import entity.news.NewsInfo;
import Exception.BusinessException;
import base.APIMessage;
import business.news.service.NewService;


public class NewServiceImpl implements NewService{
	
	/**
	  * @Discription:查询新闻详情
	  * @Author: zhouhezhen
	  * @ModifyDate: 2015年11月19日 下午2:46:30
	  * @see business.news.service.newService#findNewInfo(java.lang.String)
	 */
	public NewsInfo findNewInfo(String newId) throws Exception {
		//根据新闻ID查询新闻详情
		NewsInfo newsInfo = NewsInfo.dao.findById(newId);
		return newsInfo;
	}
	
	/**
	  * @Discription:查询新闻列表
	  * @Author: zhouhezhen
	  * @Date: 2015年11月24日 下午5:03:46
	  * @ModifyUser：zhouhezhen
	  * @ModifyDate: 2015年11月24日 下午5:03:46
	  * @see business.news.service.NewService#findNewList()
	 */
	public List<NewsInfo> findNewList() throws Exception {
		List<NewsInfo> news = NewsInfo.dao.find("select * from news_info where delete_flag='N'");
 		return news;
	}
	/**
	  * @Discription:发布新闻
	  * @Author: zhouhezhen
	  * @Date: 2015年11月26日 下午5:06:27
	  * @ModifyUser：zhouhezhen
	  * @ModifyDate: 2015年11月26日 下午5:06:27
	  * @see business.news.service.NewService#publishNew(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public void publishNew(String title, String author, String status,
			String description, String date,String cover) throws Exception {
		/**生成主键id*/
		String id = UUID.randomUUID().toString();
		try{
			NewsInfo newsInfo = new NewsInfo();
			newsInfo.set("ID", id);
			newsInfo.set("TITLE", title);
			newsInfo.set("AUTHOR", author);
			newsInfo.set("DESCRIPTION", description);
			newsInfo.set("cover",cover);
			if(date!=null){
				SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
				Date create_time = format.parse(date);
				format = new SimpleDateFormat("yyyy-MM-dd");
				newsInfo.set("CREATE_DATE", format.format(create_time));
			}
			newsInfo.set("STATUS", status);
			newsInfo.set("DELETE_FLAG","N");
			newsInfo.set("VIEW_COUNT",0);
			newsInfo.set("NEWTYPE_ID","0");
			newsInfo.save();
		} catch (Exception e) {
			e.printStackTrace();
			//新闻发布失败
			throw new BusinessException(APIMessage.NEW_PUBLISH_ERROR);
		}
	}
	
	/**
	  * @Discription:状态修改：发布新闻
	  * @Author: zhouhezhen
	  * @Date: 2015年11月27日 下午5:22:07
	  * @ModifyUser：zhouhezhen
	  * @ModifyDate: 2015年11月27日 下午5:22:07
	  * @see business.news.service.NewService#publish(java.lang.String)
	 */
	public void publish(String newId) throws Exception {
		try{
			//根据新闻ID查询新闻详情
			NewsInfo newsInfo = NewsInfo.dao.findById(newId);
			newsInfo.set("STATUS","1");
			newsInfo.set("ID", newId);
			newsInfo.update();
		}catch (Exception e) {
			e.printStackTrace();
			//新闻状态修改失败
			throw new BusinessException(APIMessage.NEW_STATUS_EDIT_ERROR);
		}
	}
	
	/**
	  * @Discription:状态修改：新闻草稿
	  * @Author: zhouhezhen
	  * @Date: 2015年11月27日 下午7:00:50
	  * @ModifyUser：zhouhezhen
	  * @ModifyDate: 2015年11月27日 下午7:00:50
	  * @see business.news.service.NewService#draft(java.lang.String)
	 */
	public void draft(String newId) throws Exception {
		try{
			//根据新闻ID查询新闻详情
			NewsInfo newsInfo = NewsInfo.dao.findById(newId);
			newsInfo.set("STATUS","0");
			newsInfo.set("ID", newId);
			newsInfo.update();
		}catch (Exception e) {
			e.printStackTrace();
			//新闻状态修改失败
			throw new BusinessException(APIMessage.NEW_STATUS_EDIT_ERROR);
		}
	}
	
	/**
	  * @Discription:删除新闻
	  * @Author: zhouhezhen
	  * @Date: 2015年11月27日 下午7:09:05
	  * @ModifyUser：zhouhezhen
	  * @ModifyDate: 2015年11月27日 下午7:09:05
	  * @see business.news.service.NewService#delete(java.lang.String)
	 */
	public void delete(String newId) throws Exception {
		try{
			//根据新闻ID查询新闻详情
			NewsInfo newsInfo = NewsInfo.dao.findById(newId);
			newsInfo.set("DELETE_FLAG","Y");
			newsInfo.set("ID", newId);
			newsInfo.update();
		}catch (Exception e) {
			e.printStackTrace();
			//新闻状态修改失败
			throw new BusinessException(APIMessage.NEW_DELETE_ERROR);
		}
	}
	
	/**
	  * @Discription:查看新闻详情
	  * @Author: zhouhezhen
	  * @Date: 2015年11月30日 上午10:03:23
	  * @ModifyUser：zhouhezhen
	  * @ModifyDate: 2015年11月30日 上午10:03:23
	  * @see business.news.service.NewService#findDetail(java.lang.String)
	 */
	public NewsInfo findDetail(String id) throws Exception {
		NewsInfo newsInfo = null;
		try{
			//根据新闻ID查询新闻详情
			newsInfo = NewsInfo.dao.findById(id);
		}catch (Exception e) {
			e.printStackTrace();
			//新闻查询失败
			throw new BusinessException(APIMessage.NEW_FINDDETAIL_ERROR);
		}
		return newsInfo;
	}
	
}
