package br.com.patrickalmeida.factory.app.dbadapter;

import br.com.patrickalmeida.factory.app.dbadapter.db.DB;
import br.com.patrickalmeida.factory.app.dbadapter.factory.DatabaseFactory;

public class Client {

	public static void main(String[] args) {

		DB database = new DatabaseFactory("oracle").getDatabase();
		database.query("select * from users");

	}
}
