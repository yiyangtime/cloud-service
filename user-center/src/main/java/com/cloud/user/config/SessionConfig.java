package com.cloud.user.config;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 开启session共享
 * 
 * @author LS
 * @date 2018年12月18日下午4:24:30
 */
@EnableRedisHttpSession
public class SessionConfig {

}
