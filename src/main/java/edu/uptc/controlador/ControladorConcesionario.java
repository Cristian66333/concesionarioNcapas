package edu.uptc.controlador;

import edu.uptc.servicios.VehiculoServicio;

public class ControladorConcesionario {
    private VehiculoServicio vehiculoServicio;

    public ControladorConcesionario(){
        this.vehiculoServicio = new VehiculoServicio();
    }

    public String crearVehiculo(String placa, String modelo, String idMotor, String cilindrajeMotor,
            int cantidadTiemposMotor){
        String infoVehiculoCreado = vehiculoServicio.crearVehiculo(placa, modelo, idMotor, cilindrajeMotor, cantidadTiemposMotor);
        return infoVehiculoCreado;
    }

    public String listarVehiculos(){
        return this.vehiculoServicio.mostrarVehiculos();
    }
}
