package uax.practica1.sello;

import uax.practica1.elementocoleccionable.ElementoColeccionable;
import uax.practica1.Estado.EstadoConservacionSello;

public class Sello extends ElementoColeccionable {
    private double altura;
    private double anchura;
    private double tamanoImagen;
    private EstadoConservacionSello estadoConservacion;

    public Sello(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio, double altura, double anchura, double tamanoImagen, EstadoConservacionSello estadoConservacion) {
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.altura = altura;
        this.anchura = anchura;
        this.tamanoImagen = tamanoImagen;
        this.estadoConservacion = estadoConservacion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double getTamanoImagen() {
        return tamanoImagen;
    }

    public void setTamanoImagen(double tamanoImagen) {
        this.tamanoImagen = tamanoImagen;
    }

    public EstadoConservacionSello getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(EstadoConservacionSello estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    @Override
    public String toString() {
        return "Sello{" +
                "pais='" + getPais() + '\'' +
                ", autoridadGobernante='" + getAutoridadGobernante() + '\'' +
                ", annus=" + getAnnus() +
                ", valor=" + getValor() +
                ", unidadMonetaria='" + getUnidadMonetaria() + '\'' +
                ", rareza=" + getRareza() +
                ", precio=" + getPrecio() +
                ", altura=" + altura +
                ", anchura=" + anchura +
                ", tamanoImagen=" + tamanoImagen +
                ", estadoConservacion=" + estadoConservacion +
                '}';
    }
}