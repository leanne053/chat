package com.scit.chat.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.chat.vo.Chat;

@Repository
public class chatDAO {
	@Autowired
	SqlSession session;
	
	public int insertChat(Chat chat) {
		int result=0;
		chatMapper mapper=session.getMapper(chatMapper.class);
		try {
			result=mapper.insertChat(chat);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<Chat> selectChat(String roomseq) {
		ArrayList<Chat> result=null;
		chatMapper mapper=session.getMapper(chatMapper.class);
		try {
			result=mapper.selectChat(roomseq);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
