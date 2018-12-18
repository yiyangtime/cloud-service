package com.cloud.model.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 微信appid和secret对象
 * 
 * @author LS
 * @date 2018年12月18日下午3:10:32
 */
@Getter
@Setter
@ToString
public class WechatInfo implements Serializable {

	private static final long serialVersionUID = 3511834512371404079L;
	/**
	 * AppId
	 */
	private String appid;
	/**
	 * AppSecret
	 */
	private String secret;
}
