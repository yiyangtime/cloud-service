package com.cloud.model.user.constants;

/**
 * rabbitmq的exchange和routing key定义
 * 
 * @author LS
 * @date 2018年12月18日下午3:03:26
 */
public interface UserCenterMq {

	/**
	 * 用户系统exchange名
	 */
	String MQ_EXCHANGE_USER = "user.topic.exchange";

	/**
	 * 角色删除routing key
	 */
	String ROUTING_KEY_ROLE_DELETE = "role.delete";
}
