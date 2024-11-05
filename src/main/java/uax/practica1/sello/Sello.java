package uax.practica1.sello;

import uax.practica1.elementocoleccionable.ElementoColeccionable;
import uax.practica1.Estado.EstadoConservacionSello;

public class Sello extends ElementoColeccionable {
    private double altura;
    private double anchura;
    private String imagen;
    private EstadoConservacionSello estadoConservacion;

    public Sello(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio, double altura, double anchura, String imagen, EstadoConservacionSello estadoConservacion) {
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.altura = altura;
        this.anchura = anchura;
        this.imagen = imagen;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public EstadoConservacionSello getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(EstadoConservacionSello estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }
}