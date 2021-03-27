package br.com.patrickalmeida.abstractfactory.app.service;

import br.com.patrickalmeida.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.patrickalmeida.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.patrickalmeida.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.patrickalmeida.abstractfactory.app.service.services.CarService;
import br.com.patrickalmeida.abstractfactory.app.service.services.UserService;

public class Client {

    public static void main(String[] args) {

//        ServicesAbstractFactory factory = new RestAbstractFactory();
		ServicesAbstractFactory factory = new EJBAbstractFactory();

        CarService carService = factory.getCarService();
        UserService userService = factory.getUserService();

        carService.save("Palio");
        carService.update("Tesla");

        userService.save("Patrick");
        userService.delete(1);

    }
}
