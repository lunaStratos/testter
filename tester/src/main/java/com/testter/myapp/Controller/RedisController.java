package com.testter.myapp.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.testter.myapp.vo.loginVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class RedisController {

	private static final Logger logger = LoggerFactory.getLogger(RedisController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */

	private final static String KEY_NAME = "user:info";

	@Autowired
	private RedisTemplate<String, String> strTemplate;

	@RequestMapping(value = "/redis", method = RequestMethod.GET)
	public String redis() {

		/*
		 * login/login.jsp를 지정하고 싶다면 다음과 같이 한다.
		 */
		// 블록주석은 컨트롤 시프트 / 이다.

		return "./redis/redis";
	}

	@RequestMapping(value = "/redis", method = RequestMethod.POST)
	public String redisSubmit(loginVO login) {

		strTemplate.setKeySerializer(new StringRedisSerializer());
		strTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());

		System.out.println(login);
		strTemplate.opsForValue().set(login.getId(), login.getPw());

		return "./redis/redis";
	}

	@RequestMapping(value = "/redisListPush", method = RequestMethod.GET)
	public String redisListPush() {
		
		strTemplate.setKeySerializer(new StringRedisSerializer());
		strTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());

		ListOperations<String, String> lipsOps = strTemplate.opsForList();
		
		lipsOps.leftPush(KEY_NAME, "orion");
		lipsOps.leftPush(KEY_NAME, "dream");
		lipsOps.leftPush(KEY_NAME, "maria");

		return "./redis/redis";
	}

	@RequestMapping(value = "/redisConfirm", method = RequestMethod.POST)
	public String redisconfirm(loginVO login, Model model) {
 
		System.out.println(login);
		String result = (String) strTemplate.opsForValue().get(login.getId());
		model.addAttribute("result", result);

		return "./redis/redis";
	}

}
