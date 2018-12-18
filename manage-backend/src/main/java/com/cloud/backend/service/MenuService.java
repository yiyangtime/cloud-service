package com.cloud.backend.service;

import java.util.List;
import java.util.Set;

import com.cloud.backend.model.Menu;

/**
 * 菜单管理服务接口
 * 
 * @author LS
 * @date 2018年12月18日下午4:09:16
 */
public interface MenuService {

	void save(Menu menu);

	void update(Menu menu);

	void delete(Long id);

	void setMenuToRole(Long roleId, Set<Long> menuIds);

	List<Menu> findByRoles(Set<Long> roleIds);

	List<Menu> findAll();

	Menu findById(Long id);

	Set<Long> findMenuIdsByRoleId(Long roleId);
}
