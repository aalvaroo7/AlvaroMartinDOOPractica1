package uax.practica1.sello;

import uax.practica1.elementocoleccionable.ElementoColeccionable;
import uax.practica1.Estado.EstadoConservacionSello;

public class Sello extends ElementoColeccionable {
    private double altura;
    private double anchura;
    private double imagenAltura;
    private double imagenAnchura;
    private EstadoConservacionSello estadoConservacion;

    public Sello(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio, double altura, double anchura, double imagenAltura, double imagenAnchura, EstadoConservacionSello estadoConservacion) {
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.altura = altura;
        this.anchura = anchura;
        this.imagenAltura = imagenAltura;
        this.imagenAnchura = imagenAnchura;
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

    public double getImagenAltura() {
        return imagenAltura;
    }

    public void setImagenAltura(double imagenAltura) {
        this.imagenAltura = imagenAltura;
    }

    public double getImagenAnchura() {
        return imagenAnchura;
    }

    public void setImagenAnchura(double imagenAnchura) {
        this.imagenAnchura = imagenAnchura;
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
                ", imagenAltura=" + imagenAltura +
                ", imagenAnchura=" + imagenAnchura +
                ", estadoConservacion=" + estadoConservacion +
                '}';
    }
}