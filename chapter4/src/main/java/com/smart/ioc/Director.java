package com.smart.ioc;

public class Director {
	public static void main(String[] args){
		new Director().direct();
	}

	/**
	 * 模拟了依赖注入的实现，最终是将实现类 LiuDeHua()注入到了MoAttack()了，
	 * 后者实现了某个接口，允许被调用injectGeli()注入
	 */
   public void direct(){
	   GeLi geli = new LiuDeHua();
	   MoAttack moAttack = new MoAttack();
	   moAttack.injectGeli(geli);
	   moAttack.cityGateAsk();
   }
}
