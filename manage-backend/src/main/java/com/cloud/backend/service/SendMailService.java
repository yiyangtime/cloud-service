package com.cloud.backend.service;

/**
 * 邮件发送服务接口
 * 
 * @author LS
 * @date 2018年12月18日下午4:09:39
 */
public interface SendMailService {

	/**
	 * 发送邮件
	 * 
	 * @param toUser
	 * @param subject
	 *            标题
	 * @param text
	 *            内容（支持html格式）
	 */
	boolean sendMail(String toUser, String subject, String text);
}
