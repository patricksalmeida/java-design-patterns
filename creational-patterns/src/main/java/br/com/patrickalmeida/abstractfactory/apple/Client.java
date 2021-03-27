package br.com.patrickalmeida.abstractfactory.apple;

import br.com.patrickalmeida.abstractfactory.apple.factory.IPhone11Factory;
import br.com.patrickalmeida.abstractfactory.apple.factory.IPhoneFactory;
import br.com.patrickalmeida.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.patrickalmeida.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.patrickalmeida.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {

		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory iPhone11Factory = new IPhone11Factory(rules);
		IPhone iphone11 = iPhone11Factory.orderIPhone("standard");
		System.out.println(iphone11);

	}
}
