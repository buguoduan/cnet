package Exception;

import base.APIMessage;

/**
 * 业务异常
 * @Author: zhouhezhen
 * @Date: 2015年11月27日 下午1:15:38 
 * @ModifyUser: zhouhezhen
 * @ModifyDate: 2015年11月27日 下午1:15:38 
 * @Version:V6.0
 */
public class BusinessException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private APIMessage msg;
	
	public BusinessException(String frdMessage){
		super(frdMessage);
	}
	
    public BusinessException(Throwable throwable) {
        super(throwable);
    }
    
    public BusinessException(Throwable throwable, String frdMessage) {
        super(throwable);
    }

    public BusinessException(APIMessage msg) {
    	this(msg.toString());
    	this.msg = msg;
    }

    public APIMessage getMsg() {
    	return msg;
    }
}
