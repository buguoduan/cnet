package business.news.impl;

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

}
