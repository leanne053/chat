package com.scit.chat;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.chat.dao.userDAO;
import com.scit.chat.vo.User;

@Controller
public class userController {
	@Autowired
	userDAO dao;
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(User user,Model model,String id, HttpSession session) {
		String result=dao.checkUser(user);
		if(result==null) {
			model.addAttribute("warning","잘못된 정보입니다.");
			return "home";
		}
		session.setAttribute("id",id);
		return "login";
	}
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register() {
		
		return "register";
	}
	@RequestMapping(value="/registerInfo", method=RequestMethod.POST)
	public String registerInfo(User user) {
		dao.insertUser(user);
		return "home";
	}
}
