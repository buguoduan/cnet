package business.news.impl;

import java.util.List;

import com.jfinal.plugin.activerecord.Page;

import entity.news.NewsInfo;
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

}
