package com.cloud.model.user;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 角色
 * 
 * @author LS
 * @date 2018年12月18日下午3:06:09
 */
@Data
public class SysRole implements Serializable {
	private static final long serialVersionUID = -2054359538140713354L;

	private Long id;
	/**
	 * 角色code
	 */
	private String code;
	/**
	 * 角色名
	 */
	private String name;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
}
