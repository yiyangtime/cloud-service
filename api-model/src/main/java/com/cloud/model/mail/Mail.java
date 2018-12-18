package com.cloud.model.mail;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 邮件
 * 
 * @author LS
 * @date 2018年12月18日下午3:01:19
 */
@Data
public class Mail implements Serializable {

	private static final long serialVersionUID = 4885093464493499448L;

	/**
	 * id
	 */
	private Long id;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 发送人用户名
	 */
	private String username;
	/**
	 * 收件人邮件地址
	 */
	private String toEmail;
	/**
	 * 标题
	 */
	private String subject;
	/**
	 * 正文
	 */
	private String content;
	/**
	 * 发送状态
	 *
	 * @see com.cloud.model.mail.constants.MailStatus
	 */
	private Integer status;
	/**
	 * 发送时间
	 */
	private Date sendTime;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
