package modelos;

public class Vehiculo {
    private String placa;
    private int numPasajeros;
    private String marca;
    private String color;
    private int modelo;
    private String tipoMotor;
    private Autorizado autorizado;
    private Propietario propietario;


    public Vehiculo(String placa, int numPasajeros, String marca, String color, int modelo, String tipoMotor, Autorizado autorizado, Propietario propietario) {
        this.placa = placa;
        this.numPasajeros = numPasajeros;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.tipoMotor = tipoMotor;
        this.autorizado = autorizado;
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Autorizado getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(Autorizado autorizado) {
        this.autorizado = autorizado;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", numPasajeros=" + numPasajeros +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", modelo=" + modelo +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", autorizado=" + autorizado +
                ", propietario=" + propietario +
                '}';
    }
}
