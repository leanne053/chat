package com.scit.chat.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.chat.vo.Room;
@Repository
public class roomDAO {
	@Autowired
	SqlSession session;
	
	public int insertRoom(Room room) {
		int result=0;
		roomMapper mapper=session.getMapper(roomMapper.class);
		try {
 			result=mapper.insertRoom(room);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<Room> selectAllRoom(Room room) {
		ArrayList<Room> result=null;
		roomMapper mapper=session.getMapper(roomMapper.class);
		try {
			result=mapper.selectAllRoom(room);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
