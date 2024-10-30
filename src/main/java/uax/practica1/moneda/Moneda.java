package uax.practica1.moneda;

import uax.practica1.elementocoleccionable.ElementoColeccionable;
import uax.practica1.enums.EstadoConservacionMoneda;

public class Moneda extends ElementoColeccionable {
    private String composicion;
    private double peso;
    private double diametro;
    private double grosor;
    private EstadoConservacionMoneda estadoConservacion;

    public Moneda(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio, String composicion, double peso, double diametro, double grosor, EstadoConservacionMoneda estadoConservacion) {
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.composicion = composicion;
        this.peso = peso;
        this.diametro = diametro;
        this.grosor = grosor;
        this.estadoConservacion = estadoConservacion;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    public EstadoConservacionMoneda getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(EstadoConservacionMoneda estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }
}