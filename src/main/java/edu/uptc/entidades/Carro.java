package edu.uptc.entidades;

public class Carro extends Vehiculo{
    private int numeroPuertas;

    public Carro(){

    }

    public Carro(String placa, String modelo, Motor motor,
    int numeroLlantas, int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
        this.placa = placa;
        this.modelo = modelo;
        this.motor = motor;
        this.numeroLlantas = numeroLlantas;

    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    


    
}
