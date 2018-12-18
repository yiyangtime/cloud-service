package com.cloud.model.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 微信个人用户信息
 * 
 * @author LS
 * @date 2018年12月18日下午3:10:45
 */
@Getter
@Setter
@ToString
public class WechatUserInfo implements Serializable {

	private static final long serialVersionUID = 6750304307961875043L;

	private Long id;
	/**
	 * 微信openid
	 */
	private String openid;
	/**
	 * 微信unionid
	 */
	private String unionid;
	/**
	 * 绑定用户的id
	 */
	private Long userId;
	/**
	 * 公众号标识
	 */
	private String app;
	/**
	 * 微信昵称
	 */
	private String nickname;
	/**
	 * 微信返回的性别
	 */
	private String sex;
	/**
	 * 微信返回的省
	 */
	private String province;
	/**
	 * 微信返回的城市
	 */
	private String city;
	/**
	 * 微信返回的国家
	 */
	private String country;
	/**
	 * 微信头像
	 */
	private String headimgurl;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
}
