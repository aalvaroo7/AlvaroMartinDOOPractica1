package uax.practica1.sello;

import uax.practica1.elementocoleccionable.ElementoColeccionable;
import uax.practica1.Estado.EstadoConservacionSello;

// Clase que representa un sello coleccionable
public class Sello extends ElementoColeccionable {
    private double altura; // Altura del sello
    private double anchura; // Anchura del sello
    private double tamanoImagen; // Tamaño de la imagen del sello
    private EstadoConservacionSello estadoConservacion; // Estado de conservación del sello

    // Constructor de la clase Sello
    public Sello(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio, double altura, double anchura, double tamanoImagen, EstadoConservacionSello estadoConservacion) {
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.altura = altura;
        this.anchura = anchura;
        this.tamanoImagen = tamanoImagen;
        this.estadoConservacion = estadoConservacion;
    }

    // Getter para la altura del sello
    public double getAltura() {
        return altura;
    }

    // Setter para la altura del sello
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Getter para la anchura del sello
    public double getAnchura() {
        return anchura;
    }

    // Setter para la anchura del sello
    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    // Getter para el tamaño de la imagen del sello
    public double getTamanoImagen() {
        return tamanoImagen;
    }

    // Setter para el tamaño de la imagen del sello
    public void setTamanoImagen(double tamanoImagen) {
        this.tamanoImagen = tamanoImagen;
    }

    // Getter para el estado de conservación del sello
    public EstadoConservacionSello getEstadoConservacion() {
        return estadoConservacion;
    }

    // Setter para el estado de conservación del sello
    public void setEstadoConservacion(EstadoConservacionSello estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    // Método toString para representar el sello como una cadena de texto
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