package com.yousuf.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p> ClassName: IndexService
 * <p> Description: 首页servie
 *
 * @author yousuf 2020/2/21
 */
@Service
public class IndexService {
	@Autowired
	private UserService userService;

	public IndexService() {
		System.out.println("init index service");
	}

}
