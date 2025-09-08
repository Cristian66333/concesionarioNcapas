package edu.uptc.servicios;

import java.util.ArrayList;

import edu.uptc.entidades.Motor;
import edu.uptc.entidades.Vehiculo;

public class VehiculoServicio {
    private ArrayList<Vehiculo> vehiculos;

    public VehiculoServicio() {
        this.vehiculos = new ArrayList<>();
    }

    public String crearVehiculo(String placa, String modelo, String idMotor, String cilindrajeMotor,
            int cantidadTiemposMotor) {
                Vehiculo nuevoVehiculo = new Vehiculo();
                Motor motorNuevoVehiculo = new Motor();
                motorNuevoVehiculo.setId(idMotor);
                motorNuevoVehiculo.setCilindraje(cilindrajeMotor);
                motorNuevoVehiculo.setCantidadTiempos(cantidadTiemposMotor);

                nuevoVehiculo.setPlaca(placa);
                nuevoVehiculo.setModelo(modelo);
                nuevoVehiculo.setMotor(motorNuevoVehiculo);

                vehiculos.add(nuevoVehiculo);

                return nuevoVehiculo.toString();

    }

    public String mostrarVehiculos(){
        String listaVehiculos = "";

        for (Vehiculo vehiculoAux : vehiculos) {
            listaVehiculos += vehiculoAux.toString() + "\n";
        }

        return listaVehiculos;
    }
}
