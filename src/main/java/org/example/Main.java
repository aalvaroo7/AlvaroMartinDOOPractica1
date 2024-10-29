package org.example;

import org.example.collection.Coleccion;
import org.example.enums.EstadoConservacionMoneda;
import org.example.enums.EstadoConservacionSello;
import org.example.model.Moneda;
import org.example.model.Sello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coleccion coleccion = new Coleccion();
        int opcion;

        do {
            System.out.println("1-Añadir una nueva moneda");
            System.out.println("2-Añadir un nuevo sello");
            System.out.println("3-Mostrar todas las monedas");
            System.out.println("4-Mostrar todos los sellos");
            System.out.println("5-Mostrar el precio total de la colección");
            System.out.println("6-Mostrar la rareza media de la colección");
            System.out.println("0-Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para añadir una nueva moneda
                    break;
                case 2:
                    // Lógica para añadir un nuevo sello
                    break;
                case 3:
                    // Lógica para mostrar todas las monedas
                    break;
                case 4:
                    // Lógica para mostrar todos los sellos
                    break;
                case 5:
                    // Lógica para mostrar el precio total de la colección
                    break;
                case 6:
                    // Lógica para mostrar la rareza media de la colección
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        scanner.close();
    }
}