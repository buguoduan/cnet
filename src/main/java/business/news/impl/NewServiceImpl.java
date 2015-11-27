package business.news.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.jfinal.plugin.activerecord.Page;

import entity.news.NewsInfo;
import Exception.BusinessException;
import Util.StringUtil;
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
		System.out.println(1);
		List<NewsInfo> news = NewsInfo.dao.find("select * from news_info");
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
			String description, String date) throws Exception {
		/**生成主键id*/
		String id = UUID.randomUUID().toString();
		try{
			NewsInfo newsInfo = new NewsInfo();
			newsInfo.set("ID", id);
			newsInfo.set("TITLE", title);
			newsInfo.set("AUTHOR", author);
			newsInfo.set("DESCRIPTION", description);
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
			//说说评论失败
			throw new BusinessException(APIMessage.NEW_PUBLISH_ERROR);
		}
	}

}
