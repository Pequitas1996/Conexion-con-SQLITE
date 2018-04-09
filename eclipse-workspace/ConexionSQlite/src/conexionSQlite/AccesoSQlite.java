package conexionSQlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoSQlite {
	private String usuario;
	private String clave;
	private String host;
	private String bd;

	public AccesoSQlite() {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.host = host;
		this.bd = bd;
	}

	public Connection conexion(String dominio, String bd, String usr, String clave) {
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

		} catch (SQLException ex) {
			System.out.println("No has conectado con la base de datos");	
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;

	}

}
