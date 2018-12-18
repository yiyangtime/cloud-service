package com.cloud.file.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aliyun.oss.OSSClient;

/**
 * 阿里云配置
 * 
 * @author LS
 * @date 2018年12月18日下午3:32:49
 */
@Configuration
public class AliyunConfig {

	@Value("${file.aliyun.endpoint}")
	private String endpoint;
	@Value("${file.aliyun.accessKeyId}")
	private String accessKeyId;
	@Value("${file.aliyun.accessKeySecret}")
	private String accessKeySecret;

	/**
	 * 阿里云文件存储client
	 * 
	 */
	@Bean
	public OSSClient ossClient() {
		OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		return ossClient;
	}

}
