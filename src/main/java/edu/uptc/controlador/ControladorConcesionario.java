package edu.uptc.controlador;

import edu.uptc.servicios.VehiculoServicio;

public class ControladorConcesionario {
    private VehiculoServicio vehiculoServicio;

    public ControladorConcesionario(){
        this.vehiculoServicio = new VehiculoServicio();
    }

    public String crearCarro(String placa, String modelo, String idMotor, String cilindrajeMotor,
            int cantidadTiemposMotor, int numeroLlantas, int numeroPuertas){
        String infoVehiculoCreado = vehiculoServicio.crearCarro(placa, modelo, idMotor, cilindrajeMotor, cantidadTiemposMotor, numeroLlantas, numeroPuertas);
        return infoVehiculoCreado;
    }

    public String listarVehiculos(){
        return this.vehiculoServicio.mostrarVehiculos();
    }

    public String listarVehiculos(int numeroPuertas){
        return this.vehiculoServicio.mostrarVehiculos(numeroPuertas);
    }
}
