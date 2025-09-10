package edu.uptc.entidades;

public class Vehiculo {
    protected String placa;
    protected String modelo;
    protected Motor motor;
    protected int numeroLlantas;
    public Vehiculo(String placa, String modelo, Motor motor, int numeroLlantas) {
        this.placa = placa;
        this.modelo = modelo;
        this.motor = motor;
        this.numeroLlantas = numeroLlantas;
    }
    public Vehiculo() {
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    

    @Override
    public String toString() {
        return "Vehiculo [placa=" + placa + ", modelo=" + modelo + ", motor=" + motor + ", numeroLlantas="
                + numeroLlantas + "]";
    }
    public int getNumeroLlantas() {
        return numeroLlantas;
    }
    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }


    
}
