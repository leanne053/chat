package com.scit.chat.dao;

import java.util.ArrayList;

import com.scit.chat.vo.Room;

public interface roomMapper {
	public int insertRoom(Room room);
	public ArrayList<Room> selectAllRoom(Room room);
}
