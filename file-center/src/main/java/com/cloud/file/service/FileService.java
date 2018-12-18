package com.cloud.file.service;

import org.springframework.web.multipart.MultipartFile;

import com.cloud.file.model.FileInfo;

/**
 * 文件管理服务接口
 * 
 * @author LS
 * @date 2018年12月18日下午3:38:13
 */
public interface FileService {

	/**
	 * 上传文件
	 *
	 * @param file
	 * @return
	 * @throws Exception
	 */
	FileInfo upload(MultipartFile file) throws Exception;

	/**
	 * 删除文件
	 *
	 * @param fileInfo
	 */
	void delete(FileInfo fileInfo);

}
