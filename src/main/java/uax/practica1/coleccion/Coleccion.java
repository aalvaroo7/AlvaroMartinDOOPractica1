package uax.practica1.coleccion;

import uax.practica1.elementocoleccionable.ElementoColeccionable;
import uax.practica1.moneda.Moneda;
import uax.practica1.sello.Sello;

import java.util.ArrayList;
import java.util.List;

// Class representing a collection of collectible items
public class Coleccion {
    private List<ElementoColeccionable> elementos; // List of collectible items

    // Constructor of the Coleccion class
    public Coleccion() {
        this.elementos = new ArrayList<>();
    }

    // Method to add a coin to the collection
    public void anadirMoneda(Moneda moneda) {
        elementos.add(moneda);
    }

    // Method to add a stamp to the collection
    public void anadirSello(Sello sello) {
        elementos.add(sello);
    }

    // Method to show all coins in the collection
    public List<Moneda> mostrarMonedas() {
        List<Moneda> monedas = new ArrayList<>();
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Moneda) {
                monedas.add((Moneda) elemento);
            }
        }
        return monedas;
    }

    // Method to show all stamps in the collection
    public List<Sello> mostrarSellos() {
        List<Sello> sellos = new ArrayList<>();
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Sello) {
                sellos.add((Sello) elemento);
            }
        }
        return sellos;
    }

    // Method to get the total price of the collection
    public double obtenerPrecioTotal() {
        double total = 0;
        for (ElementoColeccionable elemento : elementos) {
            total += elemento.getPrecio();
        }
        return total;
    }

    // Method to get the average rarity of the collection
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