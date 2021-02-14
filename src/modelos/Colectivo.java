package modelos;

public class Colectivo extends Vehiculo{
    public Colectivo(String placa, int numPasajeros, String marca, String color, int modelo, String tipoMotor, Autorizado autorizado, Propietario propietario) {
        super(placa, numPasajeros, marca, color, modelo, tipoMotor, autorizado, propietario);
    }
}
