package principal;

import conexiones.AccesoSQliteyPostgres;
import menuConexion.MenuConexiones;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccesoSQliteyPostgres acces= new AccesoSQliteyPostgres();
		
		
		//acces.conexionSqlite("localhost", "tienda", "root", "");
		
		acces.conexionPostgres();
		
		MenuConexiones men = new MenuConexiones();
		//men.menu();
		
		System.out.println("fin");
		
	}

}
