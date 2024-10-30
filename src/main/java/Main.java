import uax.practica1.coleccion.Coleccion;
import uax.practica1.enums.EstadoConservacionMoneda;
import uax.practica1.enums.EstadoConservacionSello;
import uax.practica1.moneda.Moneda;
import uax.practica1.sello.Sello;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        Coleccion coleccion = new Coleccion(); // Crear una nueva colección
        int opcion = -1; // Inicializar la opción con un valor inválido

        do {
            // Mostrar el menú de opciones
            System.out.println("1-Añadir una nueva moneda");
            System.out.println("2-Añadir un nuevo sello");
            System.out.println("3-Mostrar todas las monedas");
            System.out.println("4-Mostrar todos los sellos");
            System.out.println("5-Mostrar el precio total de la colección");
            System.out.println("6-Mostrar la rareza media de la colección");
            System.out.println("0-Salir");
            System.out.print("Seleccione una opción: ");

            // Validar la entrada del usuario para la opción del menú
            while (!scanner.hasNextInt()) {
                System.out.println("Opción no válida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar la entrada inválida
                System.out.print("Seleccione una opción: ");
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Añadir una nueva moneda
                    System.out.print("Ingrese el país: ");
                    String paisMoneda = scanner.next();
                    System.out.print("Ingrese la autoridad gobernante: ");
                    String autoridadMoneda = scanner.next();
                    int annusMoneda = 0;
                    while (true) {
                        System.out.print("Ingrese el año: ");
                        try {
                            annusMoneda = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Año no válido. Por favor, ingrese un número.");
                            scanner.next(); // Limpiar la entrada inválida
                        }
                    }
                    double valorMoneda = 0;
                    while (true) {
                        System.out.print("Ingrese el valor: ");
                        try {
                            valorMoneda = scanner.nextDouble();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Valor no válido. Por favor, ingrese un número.");
                            scanner.next(); // Limpiar la entrada inválida
                        }
                    }
                    System.out.print("Ingrese la unidad monetaria: ");
                    String unidadMonetariaMoneda = scanner.next();
                    System.out.print("Ingrese la rareza (1-100): ");
                    int rarezaMoneda = scanner.nextInt();
                    double precioMoneda = 0;
                    while (true) {
                        System.out.print("Ingrese el precio: ");
                        try {
                            precioMoneda = scanner.nextDouble();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Precio no válido. Por favor, ingrese un número.");
                            scanner.next(); // Limpiar la entrada inválida
                        }
                    }
                    System.out.print("Ingrese la composición: ");
                    String composicion = scanner.next();
                    double peso = 0;
                    while (true) {
                        System.out.print("Ingrese el peso: ");
                        try {
                            peso = scanner.nextDouble();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Peso no válido. Por favor, ingrese un número.");
                            scanner.next(); // Limpiar la entrada inválida
                        }
                    }
                    double diametro = 0;
                    while (true) {
                        System.out.print("Ingrese el diámetro: ");
                        try {
                            diametro = scanner.nextDouble();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Diámetro no válido. Por favor, ingrese un número.");
                            scanner.next(); // Limpiar la entrada inválida
                        }
                    }
                    double grosor = 0;
                    while (true) {
                        System.out.print("Ingrese el grosor: ");
                        try {
                            grosor = scanner.nextDouble();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Grosor no válido. Por favor, ingrese un número.");
                            scanner.next(); // Limpiar la entrada inválida
                        }
                    }
                    System.out.print("Ingrese el estado de conservación (G, VG, F, VF, XF, AU, UNC): ");
                    String estadoConservacionMonedaInput = scanner.next();
                    EstadoConservacionMoneda estadoConservacionMoneda;
                    try {
                        estadoConservacionMoneda = EstadoConservacionMoneda.valueOf(estadoConservacionMonedaInput); // Validar el estado de conservación
                    } catch (IllegalArgumentException e) {
                        System.out.println("Estado de conservación no válido. Intente de nuevo.");
                        break;
                    }
                    // Crear una nueva moneda y añadirla a la colección
                    Moneda moneda = new Moneda(paisMoneda, autoridadMoneda, annusMoneda, valorMoneda, unidadMonetariaMoneda, rarezaMoneda, precioMoneda, composicion, peso, diametro, grosor, estadoConservacionMoneda);
                    coleccion.anadirMoneda(moneda);
                    break;
                case 2:
                    // Añadir un nuevo sello
                    System.out.print("Ingrese el país: ");
                    String paisSello = scanner.next();
                    System.out.print("Ingrese la autoridad gobernante: ");
                    String autoridadSello = scanner.next();
                    int annusSello = 0;
                    while (true) {
                        System.out.print("Ingrese el año: ");
                        try {
                            annusSello = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Año no válido. Por favor, ingrese un número.");
                            scanner.next(); // Limpiar la entrada inválida
                        }
                    }
                    double valorSello = 0;
                    while (true) {
                        System.out.print("Ingrese el valor: ");
                        try {
                            valorSello = scanner.nextDouble();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Valor no válido. Por favor, ingrese un número.");
                            scanner.next(); // Limpiar la entrada inválida
                        }
                    }
                    System.out.print("Ingrese la unidad monetaria: ");
                    String unidadMonetariaSello = scanner.next();
                    System.out.print("Ingrese la rareza (1-100): ");
                    int rarezaSello = scanner.nextInt();
                    double precioSello = 0;
                    while (true) {
                        System.out.print("Ingrese el precio: ");
                        try {
                            precioSello = scanner.nextDouble();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Precio no válido. Por favor, ingrese un número.");
                            scanner.next(); // Limpiar la entrada inválida
                        }
                    }
                    double altura = 0;
                    while (true) {
                        System.out.print("Ingrese la altura: ");
                        try {
                            altura = scanner.nextDouble();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Altura no válida. Por favor, ingrese un número.");
                            scanner.next(); // Limpiar la entrada inválida
                        }
                    }
                    double anchura = 0;
                    while (true) {
                        System.out.print("Ingrese la anchura: ");
                        try {
                            anchura = scanner.nextDouble();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Anchura no válida. Por favor, ingrese un número.");
                            scanner.next(); // Limpiar la entrada inválida
                        }
                    }
                    System.out.print("Ingrese la imagen: ");
                    String imagen = scanner.next();
                    System.out.print("Ingrese el estado de conservación (U, NSG, NF, N): ");
                    String estadoConservacionSelloInput = scanner.next();
                    EstadoConservacionSello estadoConservacionSello;
                    try {
                        estadoConservacionSello = EstadoConservacionSello.valueOf(estadoConservacionSelloInput); // Validar el estado de conservación
                    } catch (IllegalArgumentException e) {
                        System.out.println("Estado de conservación no válido. Intente de nuevo.");
                        break;
                    }
                    // Crear un nuevo sello y añadirlo a la colección
                    Sello sello = new Sello(paisSello, autoridadSello, annusSello, valorSello, unidadMonetariaSello, rarezaSello, precioSello, altura, anchura, imagen, estadoConservacionSello);
                    coleccion.anadirSello(sello);
                    break;
                case 3:
                    // Mostrar todas las monedas
                    System.out.println("Monedas en la colección:");
                    for (Moneda m : coleccion.mostrarMonedas()) {
                        System.out.println(m);
                    }
                    break;
                case 4:
                    // Mostrar todos los sellos
                    System.out.println("Sellos en la colección:");
                    for (Sello s : coleccion.mostrarSellos()) {
                        System.out.println(s);
                    }
                    break;
                case 5:
                    // Mostrar el precio total de la colección
                    System.out.println("Precio total de la colección: " + coleccion.obtenerPrecioTotal());
                    break;
                case 6:
                    // Mostrar la rareza media de la colección
                    System.out.println("Rareza media de la colección: " + coleccion.obtenerRarezaMedia());
                    break;
                case 0:
                    // Salir del programa
                    System.out.println("Saliendo...");
                    break;
                default:
                    // Opción no válida
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0); // Repetir el bucle hasta que la opción sea 0

        scanner.close(); // Cerrar el objeto Scanner
    }
}