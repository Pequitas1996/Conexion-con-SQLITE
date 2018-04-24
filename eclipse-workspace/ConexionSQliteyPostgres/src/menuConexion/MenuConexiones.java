package menuConexion;

import java.util.Scanner;

public class MenuConexiones {
	
	public void menu() {
		String tecleado ="XYZ";
		while (tecleado.compareToIgnoreCase("q") !=0) {
				System.out.println("\t\t MENU PRINCIPAL");
				System.out.println("\t\t 1.conectarse a SQLite");
				System.out.println("\t\t 2.conectate a PostgresQL");
				System.out.println("\t\t q,Q SALIR");
				
				Scanner	teclado = new Scanner(System.in);
				tecleado = teclado.nextLine();
				System.out.println("Has tecleado..." + tecleado);
		}
		System.out.println("Hasta la proxima guapetones");
		
	}

}
