package edu.uptc.servicios;

import java.util.ArrayList;

import edu.uptc.entidades.Carro;
import edu.uptc.entidades.Motor;
import edu.uptc.entidades.Vehiculo;

public class VehiculoServicio {
    private ArrayList<Carro> vehiculos;

    public VehiculoServicio() {
        this.vehiculos = new ArrayList<>();
    }

    public String crearCarro(String placa, String modelo, String idMotor, String cilindrajeMotor,
            int cantidadTiemposMotor, int numeroLlantas, int numeroPuertas) {
                Carro carroNuevo = new Carro();
                Motor motorNuevoVehiculo = new Motor();
                motorNuevoVehiculo.setId(idMotor);
                motorNuevoVehiculo.setCilindraje(cilindrajeMotor);
                motorNuevoVehiculo.setCantidadTiempos(cantidadTiemposMotor);

                carroNuevo.setPlaca(placa);
                carroNuevo.setModelo(modelo);
                carroNuevo.setMotor(motorNuevoVehiculo);
                carroNuevo.setNumeroPuertas(numeroPuertas);
                carroNuevo.setNumeroLlantas(numeroLlantas);

                vehiculos.add(carroNuevo);

                return carroNuevo.toString();

    }

    public String mostrarVehiculos(){
        String listaVehiculos = "";

        for (Carro carroAux : vehiculos) {
            listaVehiculos += carroAux.toString() + "\n";
        }

        return listaVehiculos;
    }

    public String mostrarVehiculos(int numeroPuertas){
        StringBuilder listaVehiculos = new StringBuilder();
        
        for (Carro carroAux : vehiculos) {
            if (carroAux.getNumeroPuertas()>= numeroPuertas) {
                listaVehiculos.append(carroAux.toString()).append("\n");
            }
            
        }
        /*vehiculos.stream().forEach(n->{
            if (n.getNumeroPuertas()>=numeroPuertas) {
                listaVehiculos.append(n.toString()).append("\n");
                
            }
        });*/

        return listaVehiculos.toString();
    }
}
