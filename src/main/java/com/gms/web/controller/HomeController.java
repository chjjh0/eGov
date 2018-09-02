package com.gms.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("context")
public class HomeController {
	
	static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpSession session, HttpServletRequest request) {
		String context = request.getContextPath();
		logger.info("Welcome home! The Context Path is {}.", context);
		session.setAttribute("context", context);
		
		return "public:common/content.tiles";
	}
	@RequestMapping(value = "/move/{prefix}/{dir}/{page}", method = {RequestMethod.GET, RequestMethod.POST})
	public String move(@PathVariable String prefix, @PathVariable String dir, @PathVariable String page) {
		logger.info("HomeController ::: move() {}.", "ENTER");
		logger.info("HomeController ::: prefix {}", prefix);
		logger.info("HomeController ::: dir {}", dir);
		logger.info("HomeController ::: page {}", page);
		String ret = "";
		return ret = (prefix.equals("public")) ? 
				"public:"+dir+"/"+page+".tiles" :
					 prefix +":"+dir+"/"+page+".tiles";
	}
}
