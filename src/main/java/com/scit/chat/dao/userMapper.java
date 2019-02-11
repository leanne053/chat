package com.scit.chat.dao;

import com.scit.chat.vo.User;

public interface userMapper {
	public int insertUser(User user);
	public String checkUser(User user);
	public String checkId(String id);
	public String checkName(String id);
}
