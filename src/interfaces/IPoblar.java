package interfaces;

import modelos.Auto;
import modelos.Autorizado;
import modelos.Moto;
import modelos.Propietario;

import java.util.List;

public interface IPoblar {
    List<Propietario> crearPropietarios();

    List<Autorizado> crearListaAutorizados();

    List<Auto> crearListaAutomoviles();

    List<Moto> crearMotos();
}
