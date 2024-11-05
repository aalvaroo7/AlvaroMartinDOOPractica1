import uax.practica1.coleccion.Coleccion;
import uax.practica1.Estado.EstadoConservacionMoneda;
import uax.practica1.Estado.EstadoConservacionSello;
import uax.practica1.moneda.Moneda;
import uax.practica1.sello.Sello;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Crear una nueva colección
        Coleccion coleccion = new Coleccion();
        int opcion;

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
                scanner.next();
                System.out.print("Seleccione una opción: ");
            }
            opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        // Añadir una nueva moneda
                        Moneda moneda = crearMoneda(scanner);
                        if (moneda != null) {
                            coleccion.anadirMoneda(moneda);
                        }
                        break;
                    case 2:
                        // Añadir un nuevo sello
                        Sello sello = crearSello(scanner);
                        if (sello != null) {
                            coleccion.anadirSello(sello);
                        }
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
                        throw new IllegalArgumentException("Opción no válida");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (opcion != 0);

        // Cerrar el escáner
        scanner.close();
    }

    private static Moneda crearMoneda(Scanner scanner) {
        // Método para crear una nueva moneda
        String pais = leerTexto(scanner, "Ingrese el país: ");
        String autoridad = leerTexto(scanner, "Ingrese la autoridad gobernante: ");
        int annus = leerEntero(scanner, "Ingrese el año: ");
        double valor = leerDouble(scanner, "Ingrese el valor: ");
        String unidadMonetaria = leerTexto(scanner, "Ingrese la unidad monetaria: ");
        int rareza = leerEntero(scanner, "Ingrese la rareza (1-100): ", 1, 100);
        double precio = leerDouble(scanner, "Ingrese el precio: ");
        String composicion = leerTexto(scanner, "Ingrese la composición: ");
        double peso = leerDouble(scanner, "Ingrese el peso: ");
        double diametro = leerDouble(scanner, "Ingrese el diámetro: ");
        double grosor = leerDouble(scanner, "Ingrese el grosor: ");
        EstadoConservacionMoneda estadoConservacion = leerEstadoConservacionMoneda(scanner);

        if (estadoConservacion == null) {
            return null;
        }

        return new Moneda(pais, autoridad, annus, valor, unidadMonetaria, rareza, precio, composicion, peso, diametro, grosor, estadoConservacion);
    }

    private static Sello crearSello(Scanner scanner) {
        // Método para crear un nuevo sello
        String pais = leerTexto(scanner, "Ingrese el país: ");
        String autoridad = leerTexto(scanner, "Ingrese la autoridad gobernante: ");
        int annus = leerEntero(scanner, "Ingrese el año: ");
        double valor = leerDouble(scanner, "Ingrese el valor: ");
        String unidadMonetaria = leerTexto(scanner, "Ingrese la unidad monetaria: ");
        int rareza = leerEntero(scanner, "Ingrese la rareza (1-100): ", 1, 100);
        double precio = leerDouble(scanner, "Ingrese el precio: ");
        double altura = leerDouble(scanner, "Ingrese la altura: ");
        double anchura = leerDouble(scanner, "Ingrese la anchura: ");
        double tamanoImagen = leerDouble(scanner, "Ingrese el tamaño de la imagen: ");
        EstadoConservacionSello estadoConservacion = leerEstadoConservacionSello(scanner);

        if (estadoConservacion == null) {
            return null;
        }

        return new Sello(pais, autoridad, annus, valor, unidadMonetaria, rareza, precio, altura, anchura, tamanoImagen, estadoConservacion);
    }

    private static String leerTexto(Scanner scanner, String mensaje) {
        // Método para leer un texto del usuario
        String input;
        while (true) {
            System.out.print(mensaje);
            input = scanner.next();
            if (!input.matches(".*\\d.*")) {
                break;
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un texto.");
            }
        }
        return input;
    }

    private static int leerEntero(Scanner scanner, String mensaje) {
        // Método para leer un entero del usuario
        int input;
        while (true) {
            System.out.print(mensaje);
            try {
                input = scanner.nextInt();
                if (input >= 0) {
                    break;
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese un número entero no negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.next();
            }
        }
        return input;
    }

    private static int leerEntero(Scanner scanner, String mensaje, int min, int max) {
        // Método para leer un entero del usuario dentro de un rango
        int input;
        while (true) {
            System.out.print(mensaje);
            try {
                input = scanner.nextInt();
                if (input >= min && input <= max) {
                    break;
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese un número entre " + min + " y " + max + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.next();
            }
        }
        return input;
    }

    private static double leerDouble(Scanner scanner, String mensaje) {
        // Método para leer un double del usuario
        double input;
        while (true) {
            System.out.print(mensaje);
            try {
                input = scanner.nextDouble();
                if (input >= 0) {
                    break;
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese un número no negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next();
            }
        }
        return input;
    }

    private static EstadoConservacionMoneda leerEstadoConservacionMoneda(Scanner scanner) {
        // Método para leer el estado de conservación de una moneda
        System.out.print("Ingrese el estado de conservación (G, VG, F, VF, XF, AU, UNC): ");
        String input = scanner.next();
        try {
            return EstadoConservacionMoneda.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Estado de conservación no válido. Intente de nuevo.");
            return null;
        }
    }

    private static EstadoConservacionSello leerEstadoConservacionSello(Scanner scanner) {
        // Método para leer el estado de conservación de un sello
        System.out.print("Ingrese el estado de conservación (U, NSG, NF, N): ");
        String input = scanner.next();
        try {
            return EstadoConservacionSello.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Estado de conservación no válido. Intente de nuevo.");
            return null;
        }
    }
}