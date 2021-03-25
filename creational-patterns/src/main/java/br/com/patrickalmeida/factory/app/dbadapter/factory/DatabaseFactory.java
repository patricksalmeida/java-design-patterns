package br.com.patrickalmeida.factory.app.dbadapter.factory;

import br.com.patrickalmeida.factory.app.dbadapter.db.DB;
import br.com.patrickalmeida.factory.app.dbadapter.db.OracleDB;
import br.com.patrickalmeida.factory.app.dbadapter.db.PostgresDB;

public class DatabaseFactory implements DBFactory {

    private String dialect;

    public DatabaseFactory(String dialect) {
        this.dialect = dialect;
    }

    @Override
    public DB getDatabase() {
        if(dialect.equals("postgres")) {
            return new PostgresDB();
        } else if(dialect.equals("oracle")) {
            return new OracleDB();
        } else {
            return null;
        }
    }
}
