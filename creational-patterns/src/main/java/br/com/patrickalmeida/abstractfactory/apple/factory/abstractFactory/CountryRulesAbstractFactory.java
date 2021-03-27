package br.com.patrickalmeida.abstractfactory.apple.factory.abstractFactory;

import br.com.patrickalmeida.abstractfactory.apple.model.certificate.Certificate;
import br.com.patrickalmeida.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {

	Certificate getCertificates();
	
	Packing getPacking();

}
