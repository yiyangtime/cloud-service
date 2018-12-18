package com.cloud.model.user;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户账号类型
 * 
 * @author LS
 * @date 2018年12月18日下午3:08:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCredential implements Serializable {

	private static final long serialVersionUID = -958701617717204974L;
	/**
	 * 用户名或手机号等
	 */
	private String username;
	/**
	 * 账号类型（用户名、手机号）
	 * 
	 * @see com.cloud.model.user.constants.CredentialType
	 */
	private String type;
	/**
	 * 用户id
	 */
	private Long userId;

}
