package interfaces;

import modelos.Auto;

import java.util.ArrayList;
import java.util.List;

public class ImplBuscaar implements IBuscar{
    @Override
    public List<Auto> buscarAutoPorTipoMotor(List<Auto> autos, String tipoMotor) {

        List<Auto> autosEncontrados = new ArrayList<>();

        for (Auto auto : autos) {
            if(auto.getTipoMotor().equals(tipoMotor)) {
                autosEncontrados.add(auto);
            }
        }

        return autosEncontrados;
    }
}
