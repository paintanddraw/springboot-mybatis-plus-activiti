package com.jizhang.activiti.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jizhang.activiti.entity.UserInfo;
import com.jizhang.activiti.service.UserInfoService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author aaron
 * @since 2019-09-09
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@GetMapping("/user")
	public Integer listUsers(){
		return userInfoService.count();
	}
}

