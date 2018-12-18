package com.cloud.model.user;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 权限标识
 * 
 * @author LS
 * @date 2018年12月18日下午3:04:58
 */
@Data
public class SysPermission implements Serializable {
	private static final long serialVersionUID = 280565233032255804L;
	/**
	 * id
	 */
	private Long id;
	/**
	 * 权限标识
	 */
	private String permission;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
