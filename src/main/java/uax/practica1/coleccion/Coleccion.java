package uax.practica1.coleccion;

import uax.practica1.elementocoleccionable.ElementoColeccionable;
import uax.practica1.moneda.Moneda;
import uax.practica1.sello.Sello;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    private List<ElementoColeccionable> elementos;

    public Coleccion() {
        this.elementos = new ArrayList<>();
    }

    public void anadirMoneda(Moneda moneda) {
        elementos.add(moneda);
    }

    public void anadirSello(Sello sello) {
        elementos.add(sello);
    }

    public List<Moneda> mostrarMonedas() {
        List<Moneda> monedas = new ArrayList<>();
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Moneda) {
                monedas.add((Moneda) elemento);
            }
        }
        return monedas;
    }

    public List<Sello> mostrarSellos() {
        List<Sello> sellos = new ArrayList<>();
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Sello) {
                sellos.add((Sello) elemento);
            }
        }
        return sellos;
    }

    public double obtenerPrecioTotal() {
        double total = 0;
        for (ElementoColeccionable elemento : elementos) {
            total += elemento.getPrecio();
        }
        return total;
    }

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