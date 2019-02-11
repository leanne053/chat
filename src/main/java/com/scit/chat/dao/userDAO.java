package com.scit.chat.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.chat.vo.User;

@Repository
public class userDAO {
	@Autowired
	SqlSession session;
	
	public int insertUser(User user) {
		int result=0;
		userMapper mapper=session.getMapper(userMapper.class);
		try {
			result=mapper.insertUser(user);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public String checkUser(User user) {
		String result=null;
		userMapper mapper=session.getMapper(userMapper.class);
		try {
		result=mapper.checkUser(user);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public String checkId(String id) {
		String result=null;
		userMapper mapper=session.getMapper(userMapper.class);
		try {
			result=mapper.checkId(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public String checkName(String id) {
		String result=null;
		userMapper mapper=session.getMapper(userMapper.class);
		try {
			result=mapper.checkName(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
