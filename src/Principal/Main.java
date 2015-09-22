package Principal;

import Facade.Facade;

public class Main {

	public static void main(String[] args) {

		Facade fachada = new Facade();
        fachada.arrancarCoche();

        System.out.println("\nProceso finalizado.");
	}

}
