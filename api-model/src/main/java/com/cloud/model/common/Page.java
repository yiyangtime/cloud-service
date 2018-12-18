package com.cloud.model.common;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分页对象
 * 
 * @author LS
 * @date 2018年12月18日下午2:58:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Page<T> implements Serializable {

	private static final long serialVersionUID = -275582248840137389L;
	private int total;
	private List<T> data;
}
