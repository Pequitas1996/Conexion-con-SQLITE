package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoSQliteyPostgres {
	private String usuario;
	private String clave;
	private String host;
	private String bd;

	public AccesoSQliteyPostgres() {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.host = host;
		this.bd = bd;
	}

	public Connection conexionSqlite(String dominio, String bd, String usr, String clave) {
		// empezamos con la conexion de SQLite..
		try {
			String url = "jdbc:sqlite://" + dominio + "/" + bd;
			Class.forName("org.sqlite.JDBC");
			Connection conexion = DriverManager.getConnection("jdbc:sqlite:tienda.db");
			// ruta necesaria para poder conectar con cualquier base de datos exterior con
			// la configuracion del driver manager.
			if (conexion != null) {
				System.out.println("has conectado con la base de Datos SQLite");
			}
			return conexion;

		} catch (SQLException e) {
			System.out.println("No has conectado con la base de datos SQLite");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;

	}

	public Connection conexionPostgres() {
		//empezamos con la conexión de postgresSQL.
	     
			try {
	        	Class.forName("org.postgresql.Driver");
	        	Connection  conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tienda", "postgres", "123456");
	            //ruta para conectar postgres con eclipse
	            if (conn!= null) {
					System.out.println("has conectado con la base de Datos PostgresQl");
				}
	            return conn;
	        }catch (SQLException e) {
	        	System.out.println("No has conectado con la base de datos de PostgresQL");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
			return null;
	}

}
