package com.scit.chat;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scit.chat.dao.chatDAO;
import com.scit.chat.vo.Chat;

@Controller
public class chatController {
	@Autowired
	chatDAO dao;	

	@RequestMapping(value="/selectChat", method=RequestMethod.GET)
	public @ResponseBody ArrayList<Chat> selectChat(String roomseq) {
		ArrayList<Chat> chatList=dao.selectChat(roomseq);
		System.out.println(roomseq);
		return chatList;
	}
	
	@RequestMapping(value="/enterRoom", method=RequestMethod.GET)
	public String enterRoom(String roomseq, Model model) {
		//목록가져오기
		
		model.addAttribute("roomseq", roomseq);
		
		return "enterRoom";
	}
	
	@RequestMapping(value="/insertChat", method=RequestMethod.POST)
	public String insertChat(Chat chat, HttpSession session, Model model) {
		//목록가져오기
		System.out.println("!!");//
		String visitorId= (String)session.getAttribute("visitorId");
		chat.setVisitorId(visitorId);
		
		dao.insertChat(chat);
		return "redirect:/enterRoom?roomseq="+chat.getRoomseq();
	}
}
