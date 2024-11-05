package uax.practica1.coleccion;

import uax.practica1.elementocoleccionable.ElementoColeccionable;
import uax.practica1.moneda.Moneda;
import uax.practica1.sello.Sello;

import java.util.ArrayList;
import java.util.List;

// Clase que representa una colección de elementos coleccionables
public class Coleccion {
    private List<ElementoColeccionable> elementos; // Lista de elementos coleccionables

    // Constructor de la clase Coleccion
    public Coleccion() {
        this.elementos = new ArrayList<>();
    }

    // Método para añadir una moneda a la colección
    public void anadirMoneda(Moneda moneda) {
        elementos.add(moneda);
    }

    // Método para añadir un sello a la colección
    public void anadirSello(Sello sello) {
        elementos.add(sello);
    }

    // Método para mostrar todas las monedas de la colección
    public List<Moneda> mostrarMonedas() {
        List<Moneda> monedas = new ArrayList<>();
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Moneda) {
                monedas.add((Moneda) elemento);
            }
        }
        return monedas;
    }

    // Método para mostrar todos los sellos de la colección
    public List<Sello> mostrarSellos() {
        List<Sello> sellos = new ArrayList<>();
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Sello) {
                sellos.add((Sello) elemento);
            }
        }
        return sellos;
    }

    // Método para obtener el precio total de la colección
    public double obtenerPrecioTotal() {
        double total = 0;
        for (ElementoColeccionable elemento : elementos) {
            total += elemento.getPrecio();
        }
        return total;
    }

    // Método para obtener la rareza media de la colección
    public double obtenerRarezaMedia() {
        if (elementos.isEmpty()) {
            return 0;
        }
        double totalRareza = 0;
        for (ElementoColeccionable elemento : elementos) {
            totalRareza += elemento.getRareza();
        }
        return totalRareza / elementos.size();
    }
}