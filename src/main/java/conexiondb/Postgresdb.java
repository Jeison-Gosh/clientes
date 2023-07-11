package conexiondb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Postgresdb {
    
    private static Connection con = null;
    private static String host;
    private static String port;
    private static String databasename;
    private static String user;
    private static String pass;
    private static String url;
    
    public static Connection crateConection(String host, String port, String database, String user, String pass) throws SQLException {
       Postgresdb.databasename  = database;
       Postgresdb.host = host;
       Postgresdb.port = port;
       Postgresdb.user = user;
       Postgresdb.pass = pass;
       if(host != null && port != null && database != null && user != null && pass != null){
           url = "jdbc:postgresql//"+host+":"+port+"/"+databasename;
           con = DriverManager.getConnection(url, user, pass);
           return con;
       }
       throw new SQLException("Sin conexion a BD");
    }
    
    public static Connection createConection(String url, String user, String pass) throws SQLException{
        Postgresdb.url = url;
        Postgresdb.user = user;
        Postgresdb.pass = pass;
        
        if(url != null&& user != null && pass != null){
           
           con = DriverManager.getConnection(url, user, pass);
           return con;
       }
       throw new SQLException("Sin conexion a BD");
    }
}
