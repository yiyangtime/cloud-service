package com.cloud.log.service;

import java.util.Map;

import com.cloud.model.common.Page;
import com.cloud.model.log.Log;

/**
 * 日志服务接口
 * 
 * @author LS
 * @date 2018年12月18日下午3:59:20
 */
public interface LogService {

	/**
	 * 保存日志
	 *
	 * @param log
	 */
	void save(Log log);

	Page<Log> findLogs(Map<String, Object> params);

}
