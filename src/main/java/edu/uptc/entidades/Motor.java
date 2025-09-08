package edu.uptc.entidades;

public class Motor {
    private String id;
    private String cilindraje;
    private int cantidadTiempos;
    public Motor(String id, String cilindraje, int cantidadTiempos) {
        this.id = id;
        this.cilindraje = cilindraje;
        this.cantidadTiempos = cantidadTiempos;
    }
    public Motor() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    public int getCantidadTiempos() {
        return cantidadTiempos;
    }
    public void setCantidadTiempos(int cantidadTiempos) {
        this.cantidadTiempos = cantidadTiempos;
    }
    @Override
    public String toString() {
        return "Motor [id=" + id + ", cilindraje=" + cilindraje + ", cantidadTiempos=" + cantidadTiempos + "]";
    }
    
    
}
