package com.cloud.backend.service;

import java.util.Map;

import com.cloud.backend.model.BlackIP;
import com.cloud.model.common.Page;

/**
 * IP黑名单服务接口
 * 
 * @author LS
 * @date 2018年12月18日下午4:08:30
 */
public interface BlackIPService {

	void save(BlackIP blackIP);

	void delete(String ip);

	Page<BlackIP> findBlackIPs(Map<String, Object> params);

}
