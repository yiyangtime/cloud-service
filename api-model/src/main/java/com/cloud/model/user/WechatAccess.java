package com.cloud.model.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 微信网页授权access_token信息
 * 
 * @author LS
 * @date 2018年12月18日下午3:09:27
 */
@Getter
@Setter
@ToString
public class WechatAccess implements Serializable {

	private static final long serialVersionUID = 6571363417369764704L;
	/**
	 * 访问凭证
	 */
	private String access_token;
	/**
	 * 过期时间
	 */
	private int expires_in;
	/**
	 * 刷新凭证
	 */
	private String refresh_token;
	/**
	 * 开放Id
	 */
	private String openid;
	private String scope;
}
