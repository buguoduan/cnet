package base;

import java.util.HashMap;
import java.util.Map;



/**
 * 接口返回消息常量定义
 * @Author: zhouhezhen
 * @Date: 2015年11月26日 下午4:26:57 
 * @ModifyUser: zhouhezhen
 * @ModifyDate: 2015年11月26日 下午4:26:57 
 * @Version:V6.0
 */
public enum APIMessage {
	/*************************** 项目级别消息 用户验证问题 *****************************************/
	/**************************** 以sys_或user_为前缀 ********************************************/
	/**
	 * @Field: SYS_PARSE_PARAM_ERROR:参数格式异常
	 */
	SYS_PARSE_PARAM_ERROR("0001"),
	/**
	 * @Field: SYS_UNKNOW_ERROR:系统未知异常
	 */
	SYS_UNKNOW_ERROR("0002"),
	/************************************新闻模块***********************************/
	/************************************以new_为前缀***********************************/
	/**
	 * @Field: NEW_TITLE_ERROR:新闻标题不能为空
	 */
	NEW_TITLE_ERROR("1000"),
	/**
	 * @Field: NEW_PUBLISH_ERROR:新闻新增异常
	 */
	NEW_PUBLISH_ERROR("1001"),
	/**
	 * @Field: NEW_ID_ERROR:新闻ID不能为空
	 */
	NEW_ID_ERROR("1002"),
	/**
	 * @Field: NEW_STATUS_EDIT_ERROR:新闻状态修改失败
	 */
	NEW_STATUS_EDIT_ERROR("1003"),
	/**
	 * @Field: NEW_DELETE_ERROR:新闻删除失败
	 */
	NEW_DELETE_ERROR("1004");
	
	/**
	 * 常量对应code
	 */
	String code;
	/**
	 * 日志打印消息格式
	 */
	static final String PRINT_T = "%s : %s";

	APIMessage(String c) {
		this.code = c;
	}
	
	/**
	 * 返回数据消息包装
	 * 
	 * @param data
	 * @return
	 * @Retrun Map<String,Object>
	 * @Author: liping.wang
	 * @Date: 2014年4月23日 下午6:32:23
	 * @ModifyUser：liping.wang
	 * @ModifyDate: 2014年4月23日 下午6:32:23
	 */
	public Map<String, Object> warpper(Object data) {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("code", this.code);
		res.put("data", data);
		return res;
	}

	/**
	 * 返回数据消息包装
	 * 
	 * @return
	 * @Retrun Map<String,Object>
	 * @Author: liping.wang
	 * @Date: 2014年4月23日 下午6:32:11
	 * @ModifyUser：liping.wang
	 * @ModifyDate: 2014年4月23日 下午6:32:11
	 */
	public Map<String, Object> warpper() {
		return warpper(null);
	}

}
