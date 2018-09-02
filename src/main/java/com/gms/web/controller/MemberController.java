package com.gms.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gms.web.domain.MemberDTO;
import com.gms.web.service.MemberService;
@Controller
@RequestMapping("/member")
public class MemberController {
	static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired MemberDTO member;
	@Autowired MemberService memberService;
	@RequestMapping(value="/add", method={RequestMethod.GET, RequestMethod.POST})
	public String add(@ModelAttribute("member") MemberDTO member) {
		System.out.println("MemberController_add");
		System.out.println("name is "+member.getName());
		memberService.add(member);
		System.out.println("MemberController_add_complete");
		return "redirect:/move/login/member/login";
	}
	@RequestMapping("/list")
	public void list() {}
	@RequestMapping("/search")
	public void search() {}
	@RequestMapping("/retrieve")
	public void retrieve() {}
	@RequestMapping("/count")
	public void count() {}
	@RequestMapping(value="/modify/{id}", method={RequestMethod.GET, RequestMethod.POST})
	public String modify(@PathVariable String id) {
		System.out.println("MemberController_modify");
		System.out.println("Id is "+id);
		return "modify:member/modify.tiles";
	}
	@RequestMapping(value="/remove/{id}", method={RequestMethod.GET, RequestMethod.POST})
	public String remove(@PathVariable String id, @ModelAttribute("member") MemberDTO member, Model model) {
		System.out.println("MemberController_remove");
		System.out.println("Pass is "+member.getPass());
		System.out.println("Id is "+id);
		member.setMemberId(id);
		memberService.remove(member);
		return "redirect:/";
	}
	@RequestMapping("/login/{id}/{pass}")
	public String login(Model model, @PathVariable String id, @PathVariable String pass) {
		System.out.println("MemberControll_login");
		System.out.println("id : " +id);
		System.out.println("pass : " +pass);
		logger.info("MembeController login");
		Map<String, String> p = new HashMap<>();
		p.put("memberId", id);
		p.put("pass", pass);
		MemberDTO m = memberService.retrieve(p);
		model.addAttribute("user", m);
		System.out.println("getName(): "+m.getName());
		return "retrieve:member/retrieve.tiles";
	}
	@RequestMapping("/logout")
	public String logout() {
		logger.info("MembeController logout");
		return "redirect:/";
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}