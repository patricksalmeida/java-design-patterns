package br.com.patrickalmeida.factory.apple;

import br.com.patrickalmeida.factory.apple.factory.IPhoneFactory;
import br.com.patrickalmeida.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphoneX = IPhoneFactory.orderIphone("X", "standard");

		iphoneX.assemble();
		iphoneX.certificates();
		iphoneX.getHardware();

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone11 = IPhoneFactory.orderIphone("11", "highend");

		iphone11.assemble();
		iphone11.certificates();
		iphone11.getHardware();
	}
}
