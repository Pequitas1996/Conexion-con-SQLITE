package principal;

import conexionSQlite.AccesoSQlite;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccesoSQlite acces= new AccesoSQlite();
		acces.conexion("localhost", "tienda", "root", "");
	}

}
