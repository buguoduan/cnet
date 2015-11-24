package entity.news;

import com.jfinal.plugin.activerecord.Model;

public class NewsMenu extends Model<NewsMenu>{
	
	/**
	 * @Field: serialVersionUID:
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @Field: dao：
	 */
	public static NewsMenu dao =new NewsMenu();
}
