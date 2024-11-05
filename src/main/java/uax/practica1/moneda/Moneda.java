package uax.practica1.moneda;

import uax.practica1.Estado.EstadoConservacionMoneda;
import uax.practica1.elementocoleccionable.ElementoColeccionable;

// Clase que representa una moneda coleccionable
public class Moneda extends ElementoColeccionable {
    private String composicion; // Composición de la moneda
    private double peso; // Peso de la moneda
    private double diametro; // Diámetro de la moneda
    private double grosor; // Grosor de la moneda
    private EstadoConservacionMoneda estadoConservacion; // Estado de conservación de la moneda

    // Constructor de la clase Moneda
    public Moneda(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio, String composicion, double peso, double diametro, double grosor, EstadoConservacionMoneda estadoConservacion) {
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.composicion = composicion;
        this.peso = peso;
        this.diametro = diametro;
        this.grosor = grosor;
        this.estadoConservacion = estadoConservacion;
    }

    // Getter para la composición de la moneda
    public String getComposicion() {
        return composicion;
    }

    // Setter para la composición de la moneda
    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    // Getter para el peso de la moneda
    public double getPeso() {
        return peso;
    }

    // Setter para el peso de la moneda
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Getter para el diámetro de la moneda
    public double getDiametro() {
        return diametro;
    }

    // Setter para el diámetro de la moneda
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    // Getter para el grosor de la moneda
    public double getGrosor() {
        return grosor;
    }

    // Setter para el grosor de la moneda
    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    // Getter para el estado de conservación de la moneda
    public EstadoConservacionMoneda getEstadoConservacion() {
        return estadoConservacion;
    }

    // Setter para el estado de conservación de la moneda
    public void setEstadoConservacion(EstadoConservacionMoneda estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    // Método toString para representar la moneda como una cadena de texto
    @Override
    public String toString() {
        return "Moneda{" +
                "pais='" + getPais() + '\'' +
                ", autoridadGobernante='" + getAutoridadGobernante() + '\'' +
                ", annus=" + getAnnus() +
                ", valor=" + getValor() +
                ", unidadMonetaria='" + getUnidadMonetaria() + '\'' +
                ", rareza=" + getRareza() +
                ", precio=" + getPrecio() +
                ", composicion='" + composicion + '\'' +
                ", peso=" + peso +
                ", diametro=" + diametro +
                ", grosor=" + grosor +
                ", estadoConservacion=" + estadoConservacion +
                '}';
    }
}