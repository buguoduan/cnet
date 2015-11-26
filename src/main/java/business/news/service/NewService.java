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
}
