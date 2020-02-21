package com.yousuf.study;

import com.yousuf.study.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p> ClassName: Application
 * <p> Description: 项目启动类
 *
 * @author yousuf 2020/2/21
 */
public class Application {
	public static void main(String[] args) {
		//AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		// 设置不支持循环依赖
		//ac.setAllowCircularReferences(false);
		//ac.register(AppConfig.class);
		//ac.refresh();
		// 1实例化一个ApplicationContext的对象
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		//System.out.println(ac.getBean(IndexService.class));



	}
}
