package com.smart.ioc;

/**
 * 接口注入方式，实现接口
 */
public class MoAttack implements ActorArrangable {
	/**
	 * 接口注入方式
	 */
	private GeLi geli;

	public void injectGeli(GeLi geli) {
		this.geli = geli;		
	}
	
	public void cityGateAsk() {
		geli.responseAsk("墨者革离");
	}
}