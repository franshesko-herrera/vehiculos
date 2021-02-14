package main;

import interfaces.IBuscar;
import interfaces.IPoblar;
import interfaces.ImplBuscaar;
import interfaces.ImplPoblar;
import modelos.Auto;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IPoblar poblar = new ImplPoblar();
        IBuscar buscar = new ImplBuscaar();

        System.out.println(poblar.crearPropietarios());


        // crear lista de autos
        List<Auto> autos = poblar.crearListaAutomoviles();

        // imprima esa lista de autos
        System.out.println(autos);

        // dentro de esa lista, busque los que tienen motor de combustion
        System.out.println(buscar.buscarAutoPorTipoMotor(autos, "electrico"));
    }
}
