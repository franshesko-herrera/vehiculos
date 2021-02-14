package interfaces;

import modelos.Auto;
import modelos.Autorizado;
import modelos.Moto;
import modelos.Propietario;

import java.util.ArrayList;
import java.util.List;

public class ImplPoblar implements IPoblar{
    @Override
    public List<Propietario> crearPropietarios() {
        List<Propietario> propietarios = new ArrayList<>();

        Propietario propietario1 = new Propietario("Lina Casallas", 34567, "kr 12 33 22");
        Propietario propietario2 = new Propietario("Andrea Casallas", 9876, "Calle 12 33 22");
        Propietario propietario3 = new Propietario("Vivi Casallas", 5678, "Vereda 12 33 22");

        propietarios.add(propietario1);
        propietarios.add(propietario2);
        propietarios.add(propietario3);


        return propietarios;
    }

    @Override
    public List<Autorizado> crearListaAutorizados() {
        return null;
    }

    @Override
    public List<Auto> crearListaAutomoviles() {

        List<Auto> autos = new ArrayList<>();

        Propietario propietario1 = new Propietario("Lina Casallas", 34567, "kr 12 33 22");
        Propietario propietario2 = new Propietario("Andrea Casallas", 9876, "Calle 12 33 22");
        Propietario propietario3 = new Propietario("Vivi Casallas", 5678, "Vereda 12 33 22");

        Autorizado autorizado3 = new Autorizado("Vivi Casallas", 5678, "Vereda 12 33 22");

        Auto auto1 = new Auto("ABC123", 5, "CHEVROLET", "verde", 2011, "electrico", autorizado3, propietario2);
        Auto auto2 = new Auto("RTY765", 5, "HONDA", "azul", 2016, "combustion", autorizado3, propietario1);
        Auto auto3 = new Auto("JNH998", 5, "MAZDA", "amarillo", 2014, "electrico", null, null);
        Auto auto4 = new Auto("VCD345", 5, "RENAULT", "verde", 20199111, "combustion", null, null);

        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);


        return autos;
    }

    @Override
    public List<Moto> crearMotos() {
        return null;
    }
}
