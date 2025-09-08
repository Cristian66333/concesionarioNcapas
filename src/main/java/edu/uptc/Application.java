package edu.uptc;

import java.util.ResourceBundle.Control;

import edu.uptc.controlador.ControladorConcesionario;
import edu.uptc.gui.Gui;

public class Application {

    public static void main(String[] args) {
        ControladorConcesionario control = new ControladorConcesionario();
        Gui gui = new Gui(control);

        gui.iniciar();
    }
}
