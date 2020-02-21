package com.yousuf.study.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * <p> ClassName: TestContext
 * <p> Description: // TODO
 *
 * @author yousuf 2020/2/21
 */
@Component
public class TestContext implements ApplicationContextAware {
	public TestContext() {
		System.out.println("init text context");
	}
	@PostConstruct
	public void init() {
		System.out.println("post construct callback");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("context aware callback");
	}
}
