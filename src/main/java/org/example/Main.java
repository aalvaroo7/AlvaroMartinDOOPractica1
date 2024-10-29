package org.example;

import org.example.coleccion.Coleccion;
import org.example.enums.EstadoConservacionMoneda;
import org.example.enums.EstadoConservacionSello;
import org.example.Moneda;
import org.example.Sello;

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
                    System.out.print("Ingrese el país: ");
                    String paisMoneda = scanner.next();
                    System.out.print("Ingrese la autoridad gobernante: ");
                    String autoridadMoneda = scanner.next();
                    System.out.print("Ingrese el año: ");
                    int annusMoneda = scanner.nextInt();
                    System.out.print("Ingrese el valor: ");
                    double valorMoneda = scanner.nextDouble();
                    System.out.print("Ingrese la unidad monetaria: ");
                    String unidadMonetariaMoneda = scanner.next();
                    System.out.print("Ingrese la rareza (1-100): ");
                    int rarezaMoneda = scanner.nextInt();
                    System.out.print("Ingrese el precio: ");
                    double precioMoneda = scanner.nextDouble();
                    System.out.print("Ingrese la composición: ");
                    String composicion = scanner.next();
                    System.out.print("Ingrese el peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Ingrese el diámetro: ");
                    double diametro = scanner.nextDouble();
                    System.out.print("Ingrese el grosor: ");
                    double grosor = scanner.nextDouble();
                    System.out.print("Ingrese el estado de conservación (G, VG, F, VF, XF, AU, UNC): ");
                    EstadoConservacionMoneda estadoConservacionMoneda = EstadoConservacionMoneda.valueOf(scanner.next());
                    Moneda moneda = new Moneda(paisMoneda, autoridadMoneda, annusMoneda, valorMoneda, unidadMonetariaMoneda, rarezaMoneda, precioMoneda, composicion, peso, diametro, grosor, estadoConservacionMoneda);
                    coleccion.anadirMoneda(moneda);
                    break;
                case 2:
                    System.out.print("Ingrese el país: ");
                    String paisSello = scanner.next();
                    System.out.print("Ingrese la autoridad gobernante: ");
                    String autoridadSello = scanner.next();
                    System.out.print("Ingrese el año: ");
                    int annusSello = scanner.nextInt();
                    System.out.print("Ingrese el valor: ");
                    double valorSello = scanner.nextDouble();
                    System.out.print("Ingrese la unidad monetaria: ");
                    String unidadMonetariaSello = scanner.next();
                    System.out.print("Ingrese la rareza (1-100): ");
                    int rarezaSello = scanner.nextInt();
                    System.out.print("Ingrese el precio: ");
                    double precioSello = scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double altura = scanner.nextDouble();
                    System.out.print("Ingrese la anchura: ");
                    double anchura = scanner.nextDouble();
                    System.out.print("Ingrese la imagen: ");
                    String imagen = scanner.next();
                    System.out.print("Ingrese el estado de conservación (U, NSG, NF, N): ");
                    EstadoConservacionSello estadoConservacionSello = EstadoConservacionSello.valueOf(scanner.next());
                    Sello sello = new Sello(paisSello, autoridadSello, annusSello, valorSello, unidadMonetariaSello, rarezaSello, precioSello, altura, anchura, imagen, estadoConservacionSello);
                    coleccion.anadirSello(sello);
                    break;
                case 3:
                    System.out.println("Monedas en la colección:");
                    for (Moneda m : coleccion.mostrarMonedas()) {
                        System.out.println(m);
                    }
                    break;
                case 4:
                    System.out.println("Sellos en la colección:");
                    for (Sello s : coleccion.mostrarSellos()) {
                        System.out.println(s);
                    }
                    break;
                case 5:
                    System.out.println("Precio total de la colección: " + coleccion.obtenerPrecioTotal());
                    break;
                case 6:
                    System.out.println("Rareza media de la colección: " + coleccion.obtenerRarezaMedia());
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