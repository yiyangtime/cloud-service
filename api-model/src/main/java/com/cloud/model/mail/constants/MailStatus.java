package com.cloud.model.mail.constants;

/**
 * 邮件状态
 * 
 * @author LS
 * @date 2018年12月18日下午3:01:06
 */
public interface MailStatus {
	/**
	 * 草稿
	 */
	int DRAFT = 0;
	/**
	 * 发送成功
	 */
	int SUCCESS = 1;
	/**
	 * 发送失败
	 */
	int ERROR = 2;
}
