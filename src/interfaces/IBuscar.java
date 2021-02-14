package interfaces;

import modelos.Auto;

import java.util.List;

public interface IBuscar {
    List<Auto> buscarAutoPorTipoMotor(List<Auto> autos, String tipoMotor);
}
