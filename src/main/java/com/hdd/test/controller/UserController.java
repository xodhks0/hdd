package com.hdd.test.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.hdd.test.dao.UserDAO;
import com.hdd.test.vo.UserVO;

@Controller
public class UserController {

	@Resource
	UserDAO udao;
	
	@GetMapping("/users")
	public String getUserList(Model m,@ModelAttribute UserVO user) {
		m.addAttribute("users",udao.getUserList(user));
		return "user/list";
	}
}
