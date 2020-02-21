package com.yousuf.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p> ClassName: UserService
 * <p> Description: 用户service
 *
 * @author yousuf 2020/2/21
 */
@Service
public class UserService {
	@Autowired
	private IndexService indexService;
	public UserService() {
		System.out.println("init user service");
	}
}
