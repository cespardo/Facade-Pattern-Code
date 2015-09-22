package Facade;

import Subsistema.Arrancar;
import Subsistema.ComprobarAsiento;
import Subsistema.ComprobarEspejos;
import Subsistema.ComprobarFrenos;
import Subsistema.ComprobarLiquidos;

public class Facade {
	private ComprobarLiquidos liquidos;
    private ComprobarAsiento asiento;
    private ComprobarEspejos espejos;
    private ComprobarFrenos frenos;
    private Arrancar arrancar;

    // --------------------------------

    public Facade()
    {
        this.liquidos = new ComprobarLiquidos();
        this.asiento  = new ComprobarAsiento();
        this.espejos  = new ComprobarEspejos();
        this.frenos   = new ComprobarFrenos();
        this.arrancar = new Arrancar();
    }

    // --------------------------------

    public void arrancarCoche()
    {
        liquidos.comprobar();
        asiento.comprobar();
        espejos.comprobar();
        frenos.comprobar();
        arrancar.encenderContacto();
    }

}
