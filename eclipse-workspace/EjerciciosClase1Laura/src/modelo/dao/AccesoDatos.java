package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager; //se puede conectar con cualquier base de datos.
import java.sql.SQLException;

public class AccesoDatos {
	private String usuario;
	private String clave;
	private String host;
	private String bd;
	
	
	public AccesoDatos(String usuario, String clave, String host, String bd) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.host = host;
		this.bd = bd;
	}

	public Connection conexion() {
		
		try {
			//new AccesoDatos(usuario, clave, host, bd);
			String url = "jdbc:mysql://"+ host + "/" + bd;
			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
			Connection con = DriverManager.getConnection (url, "Laura ", "Chachan4567");
			System.out.println("¡¡Has conectato con la base de datos!!");
			return con;
		} catch (InstantiationException e) {
			System.out.println(e.getMessage());
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e.getMessage());	
		}
		System.out.println("¡¡ No has conectato con la base de datos!!");
		return null;
		
	}

}

