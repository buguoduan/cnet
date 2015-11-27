package business.news.service;


import java.util.List;


import entity.news.NewsInfo;

public interface NewService {
	
	/**
	  * @Discription:查询新闻详情
	  * @param id
	  * @return
	  * @throws Exception
	  * @return newsInfo
	  * @ModifyUser：zhouhezhen
	  * @ModifyDate: 2015年11月19日 下午2:44:36
	 */
	NewsInfo findNewInfo(String id) throws Exception;
	/**
	  * @Discription:查询新闻列表
	  * @param id
	  * @return
	  * @throws Exception
	  * @return newsInfo
	  * @ModifyUser：zhouhezhen
	  * @ModifyDate: 2015年11月19日 下午2:44:36
	 */
	List<NewsInfo> findNewList() throws Exception;
	/**
	  * @Discription:发布新闻
	  * @param title
	  * @param author
	  * @param status
	  * @param description
	  * @param date
	  * @return
	  * @throws Exception
	  * @return Void
	  * @Author: zhouhezhen
	  * @Date: 2015年11月26日 下午5:05:22
	  * @ModifyUser：zhouhezhen
	  * @ModifyDate: 2015年11月26日 下午5:05:22
	 */
	void publishNew(String title, String author,String status,String description,String date) throws Exception; 
}
