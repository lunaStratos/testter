package com.testter.myapp.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.testter.myapp.DAO.accountDAO;
import com.testter.myapp.vo.loginVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LinkController {

	private static final Logger logger = LoggerFactory.getLogger(LinkController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@Autowired
	accountDAO dao;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		/*
		 * login/login.jsp를 지정하고 싶다면 다음과 같이 한다.
		 */
		// 블록주석은 컨트롤 시프트 / 이다.

		return "./login/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(loginVO login) {
		logger.debug("Here is some DEBUG");
		logger.info("Here is some INFO");
		logger.warn("Here is some WARN");
		logger.error("Here is some ERROR");
		logger.debug("login: {}", login.getId());
		System.out.println(login);
		 
		loginVO result = dao.login(login);
		
		System.out.println(result);

		return "./login/login";
	}

}
