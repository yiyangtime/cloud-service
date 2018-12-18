package com.cloud.backend.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * IP黑名单
 * 
 * @author LS
 * @date 2018年12月18日下午4:07:53
 */
@Data
public class BlackIP implements Serializable {

	private static final long serialVersionUID = -2064187103535072261L;
	/**
	 * IP
	 */
	private String ip;
	/**
	 * 创建时间
	 */
	private Date createTime;
}
