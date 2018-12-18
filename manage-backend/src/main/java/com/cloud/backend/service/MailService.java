package com.cloud.backend.service;

import com.cloud.model.common.Page;
import com.cloud.model.mail.Mail;

import java.util.Map;

/**
 * 邮件管理服务接口
 * 
 * @author LS
 * @date 2018年12月18日下午4:08:56
 */
public interface MailService {

	void saveMail(Mail mail);

	void updateMail(Mail mail);

	void sendMail(Mail mail);

	Mail findById(Long id);

	Page<Mail> findMails(Map<String, Object> params);
}
