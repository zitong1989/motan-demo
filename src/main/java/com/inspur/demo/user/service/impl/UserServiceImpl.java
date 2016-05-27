package com.inspur.demo.user.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.uuid.UUIDGenerator;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.inspur.demo.user.dao.UserMapper;
import com.inspur.demo.user.data.User;
import com.inspur.demo.user.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;

	public String insert(User user) {
		String userId = UUIDGenerator.getUUID();
		user.setId(userId);
		userMapper.insert(user);
		return userId;
	}

	public void update(User user) {
		userMapper.update(user);
	}

	public void delete(String userId) {
		userMapper.delete(userId);
	}

	public User getUserById(String userId) {
		User user = userMapper.getUserById(userId);
		return user;
	}

	public List<User> getAllUser() {
		List<User> list = userMapper.getAll();
		return list;
	}

	public List<User> getUserList(Map<String, Object> param) {
		List<User> list = userMapper.queryUserByParam(param);
		return list;
	}

	public Map<String, Object> getUserPage(Map<String, Object> param) {
		int start = Integer.valueOf(String.valueOf(param.get("start")));
		int limit = Integer.valueOf(String.valueOf(param.get("limit")));
		PageHelper.startPage(start, limit);
		Page<User> page = (Page<User>) userMapper.queryUserByParam(param);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", new ArrayList<User>(page.getResult()));
		result.put("total", page.getTotal());

		return result;
	}
}
