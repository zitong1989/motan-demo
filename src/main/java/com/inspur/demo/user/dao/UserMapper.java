package com.inspur.demo.user.dao;

import java.util.List;
import java.util.Map;

import com.inspur.demo.user.data.User;

public interface UserMapper {

	void insert(User user);

	void update(User user);

	void delete(String userId);

	void batchDelete(String[] userIds);

	User getUserById(String userId);

	List<User> getAll();

	List<User> queryUserByParam(Map<String, Object> param);
}
