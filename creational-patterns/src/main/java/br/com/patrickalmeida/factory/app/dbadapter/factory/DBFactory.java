package br.com.patrickalmeida.factory.app.dbadapter.factory;

import br.com.patrickalmeida.factory.app.dbadapter.db.DB;

public interface DBFactory {
	DB getDatabase();
}
