package com.inspur.demo.user.service;

import java.util.List;
import java.util.Map;

import com.inspur.demo.user.data.User;

public interface IUserService {
	String insert(User user);

	void update(User user);

	void delete(String userId);

	User getUserById(String userId);

	List<User> getAllUser();

	List<User> getUserList(Map<String, Object> param);

	Map<String, Object> getUserPage(Map<String, Object> param);
}
