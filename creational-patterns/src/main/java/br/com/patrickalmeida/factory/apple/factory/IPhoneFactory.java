package br.com.patrickalmeida.factory.apple.factory;

import br.com.patrickalmeida.factory.apple.model.*;

public abstract class IPhoneFactory {

    public static IPhone orderIphone(String generation, String level) {
        if(generation.equals("X")) {
            if(level.equals("highend")) {
                System.out.println("Iphone X Highend");
                return new IPhoneXSMax();
            } else {
                System.out.println("Iphone X Standard");
                return new IPhoneX();
            }
        } else if(generation.equals("11")) {
            if(level.equals("highend")) {
                System.out.println("Iphone 11 Highend");
                return new IPhone11Pro();
            } else {
                System.out.println("Iphone 11 Standard");
                return new IPhone11();
            }
        } else {
            return null;
        }
    }
	
}
