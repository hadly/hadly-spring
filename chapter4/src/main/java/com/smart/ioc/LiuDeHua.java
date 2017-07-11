package com.smart.ioc;

/**
 * 实现被注入的对象
 */
public class LiuDeHua implements GeLi {

	public void responseAsk(String saying) {
		System.out.println("actor liudehua says: " + saying);
	}
}
