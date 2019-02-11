package com.scit.chat;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scit.chat.dao.roomDAO;
import com.scit.chat.dao.userDAO;
import com.scit.chat.vo.Chat;
import com.scit.chat.vo.Room;

@Controller
public class roomController {
	@Autowired
	userDAO adao;
	
	@Autowired
	roomDAO dao;
	
	
	@RequestMapping(value="/re", method=RequestMethod.GET)
	public String re() {
		return "home";
	}
	@RequestMapping(value="/chatroom", method=RequestMethod.GET)
	public String chatroom() {
		return "redirect:/rList";
	}
	@RequestMapping(value="/makeRoom", method=RequestMethod.GET)
	public String makeroom() {
		return "makingRoom";
	}
	@RequestMapping(value="/writeRoom", method=RequestMethod.POST)
	public String writeRoom(Room room, HttpSession session,Model model) {
	
		String id=(String) session.getAttribute("id");
		room.setId(id);
		dao.insertRoom(room);
		return "redirect:/rList";
	}
	@RequestMapping(value="/chattingList", method=RequestMethod.GET)
	public String chattingList() {
		return "redirect:/rList";
	}
	@RequestMapping(value="/rList",method=RequestMethod.GET)
	public String rList(Room room, Model model, HttpSession session) {
		ArrayList<Room>rList=dao.selectAllRoom(room);
		model.addAttribute("rList",rList);
		return "chattingList";
	}
}
