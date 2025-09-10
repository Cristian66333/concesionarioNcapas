package edu.uptc.gui;

import javax.swing.JOptionPane;

import edu.uptc.controlador.ControladorConcesionario;

public class Gui {

    private ControladorConcesionario controlador;

    public Gui(ControladorConcesionario controlador) {
        this.controlador = controlador;
    }

    public void iniciar() {
        String menu = """
                Ingrese la opcion
                1. crear vehiculo
                2. listar vehiculos
                3.salir
                """;
        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    vistaCrearVehiculo();
                    break;
                case 2:
                    vistaListarVehiculos();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;

                default:
                    break;
            }
        } while (opcion != 3);
    }

    public void vistaCrearVehiculo(){
        String placa=JOptionPane.showInputDialog("Ingrese la placa");
        String modelo=JOptionPane.showInputDialog("Ingrese la modelo");
        String idMotor=JOptionPane.showInputDialog("Ingrese la id del motor");
        String cilindrajeMotor=JOptionPane.showInputDialog("Ingrese cilindraje del motor");
        int numeroLlantas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de llantas"));
        int numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas"));
        int cantTiempos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tiempos"));
        String infoVehiculo=this.controlador.crearCarro(placa, modelo, idMotor, cilindrajeMotor, cantTiempos, numeroLlantas,numeroPuertas);
        JOptionPane.showMessageDialog(null, "Info vehiculo creado:\n"+infoVehiculo);
    }

    public void vistaListarVehiculos(){
        JOptionPane.showMessageDialog(null, this.controlador.listarVehiculos());
    }

}
