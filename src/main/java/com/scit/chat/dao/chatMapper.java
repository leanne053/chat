package com.scit.chat.dao;

import java.util.ArrayList;

import com.scit.chat.vo.Chat;

public interface chatMapper {
	public int insertChat(Chat chat);
	public ArrayList<Chat> selectChat(String roomseq);
	
}
