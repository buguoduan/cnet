package entity.news;
import com.jfinal.plugin.activerecord.Model;

public class NewsInfo extends Model<NewsInfo>{
	/**
	 * @Field: serialVersionUID:
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @Field: dao：
	 */
	public static NewsInfo dao =new NewsInfo();
}
