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
        int opcion = -1;

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
                        String paisMoneda = "";
                        while (true) {
                            System.out.print("Ingrese el país: ");
                            paisMoneda = scanner.next();
                            if (!paisMoneda.matches(".*\\d.*")) {
                                break;
                            } else {
                                System.out.println("País no válido. Por favor, ingrese un texto.");
                            }
                        }
                        String autoridadMoneda = "";
                        while (true) {
                            System.out.print("Ingrese la autoridad gobernante: ");
                            autoridadMoneda = scanner.next();
                            if (!autoridadMoneda.matches(".*\\d.*")) {
                                break;
                            } else {
                                System.out.println("Autoridad gobernante no válida. Por favor, ingrese un texto.");
                            }
                        }
                        int annusMoneda = 0;
                        while (true) {
                            System.out.print("Ingrese el año: ");
                            try {
                                annusMoneda = scanner.nextInt();
                                if (annusMoneda >= 0) {
                                    break;
                                } else {
                                    System.out.println("Año no válido. Por favor, ingrese un número entero no negativo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Año no válido. Por favor, ingrese un número entero.");
                                scanner.next();
                            }
                        }
                        double valorMoneda = 0;
                        while (true) {
                            System.out.print("Ingrese el valor: ");
                            try {
                                valorMoneda = scanner.nextDouble();
                                if (valorMoneda >= 0) {
                                    break;
                                } else {
                                    System.out.println("Valor no válido. Por favor, ingrese un número no negativo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Valor no válido. Por favor, ingrese un número.");
                                scanner.next();
                            }
                        }
                        String unidadMonetariaMoneda = "";
                        while (true) {
                            System.out.print("Ingrese la unidad monetaria: ");
                            unidadMonetariaMoneda = scanner.next();
                            if (!unidadMonetariaMoneda.matches(".*\\d.*")) {
                                break;
                            } else {
                                System.out.println("Unidad monetaria no válida. Por favor, ingrese un texto.");
                            }
                        }
                        int rarezaMoneda = 0;
                        while (true) {
                            System.out.print("Ingrese la rareza (1-100): ");
                            try {
                                rarezaMoneda = scanner.nextInt();
                                if (rarezaMoneda >= 1 && rarezaMoneda <= 100) {
                                    break;
                                } else {
                                    System.out.println("Rareza no válida. Por favor, ingrese un número entre 1 y 100.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Rareza no válida. Por favor, ingrese un número.");
                                scanner.next();
                            }
                        }
                        double precioMoneda = 0;
                        while (true) {
                            System.out.print("Ingrese el precio: ");
                            try {
                                precioMoneda = scanner.nextDouble();
                                if (precioMoneda >= 0) {
                                    break;
                                } else {
                                    System.out.println("Precio no válido. Por favor, ingrese un número no negativo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Precio no válido. Por favor, ingrese un número.");
                                scanner.next();
                            }
                        }
                        String composicion = "";
                        while (true) {
                            System.out.print("Ingrese la composición: ");
                            composicion = scanner.next();
                            if (!composicion.matches(".*\\d.*")) {
                                break;
                            } else {
                                System.out.println("Composición no válida. Por favor, ingrese un texto.");
                            }
                        }
                        double peso = 0;
                        while (true) {
                            System.out.print("Ingrese el peso: ");
                            try {
                                peso = scanner.nextDouble();
                                if (peso >= 0) {
                                    break;
                                } else {
                                    System.out.println("Peso no válido. Por favor, ingrese un número no negativo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Peso no válido. Por favor, ingrese un número.");
                                scanner.next();
                            }
                        }
                        double diametro = 0;
                        while (true) {
                            System.out.print("Ingrese el diámetro: ");
                            try {
                                diametro = scanner.nextDouble();
                                if (diametro >= 0) {
                                    break;
                                } else {
                                    System.out.println("Diámetro no válido. Por favor, ingrese un número no negativo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Diámetro no válido. Por favor, ingrese un número.");
                                scanner.next();
                            }
                        }
                        double grosor = 0;
                        while (true) {
                            System.out.print("Ingrese el grosor: ");
                            try {
                                grosor = scanner.nextDouble();
                                if (grosor >= 0) {
                                    break;
                                } else {
                                    System.out.println("Grosor no válido. Por favor, ingrese un número no negativo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Grosor no válido. Por favor, ingrese un número.");
                                scanner.next();
                            }
                        }
                        System.out.print("Ingrese el estado de conservación (G, VG, F, VF, XF, AU, UNC): ");
                        String estadoConservacionMonedaInput = scanner.next();
                        EstadoConservacionMoneda estadoConservacionMoneda;
                        try {
                            estadoConservacionMoneda = EstadoConservacionMoneda.valueOf(estadoConservacionMonedaInput);
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
                        String paisSello = "";
                        while (true) {
                            System.out.print("Ingrese el país: ");
                            paisSello = scanner.next();
                            if (!paisSello.matches(".*\\d.*")) {
                                break;
                            } else {
                                System.out.println("País no válido. Por favor, ingrese un texto.");
                            }
                        }
                        String autoridadSello = "";
                        while (true) {
                            System.out.print("Ingrese la autoridad gobernante: ");
                            autoridadSello = scanner.next();
                            if (!autoridadSello.matches(".*\\d.*")) {
                                break;
                            } else {
                                System.out.println("Autoridad gobernante no válida. Por favor, ingrese un texto.");
                            }
                        }
                        int annusSello = 0;
                        while (true) {
                            System.out.print("Ingrese el año: ");
                            try {
                                annusSello = scanner.nextInt();
                                if (annusSello >= 0) {
                                    break;
                                } else {
                                    System.out.println("Año no válido. Por favor, ingrese un número entero no negativo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Año no válido. Por favor, ingrese un número entero.");
                                scanner.next();
                            }
                        }
                        double valorSello = 0;
                        while (true) {
                            System.out.print("Ingrese el valor: ");
                            try {
                                valorSello = scanner.nextDouble();
                                if (valorSello >= 0) {
                                    break;
                                } else {
                                    System.out.println("Valor no válido. Por favor, ingrese un número no negativo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Valor no válido. Por favor, ingrese un número.");
                                scanner.next();
                            }
                        }
                        String unidadMonetariaSello = "";
                        while (true) {
                            System.out.print("Ingrese la unidad monetaria: ");
                            unidadMonetariaSello = scanner.next();
                            if (!unidadMonetariaSello.matches(".*\\d.*")) {
                                break;
                            } else {
                                System.out.println("Unidad monetaria no válida. Por favor, ingrese un texto.");
                            }
                        }
                        int rarezaSello = 0;
                        while (true) {
                            System.out.print("Ingrese la rareza (1-100): ");
                            try {
                                rarezaSello = scanner.nextInt();
                                if (rarezaSello >= 1 && rarezaSello <= 100) {
                                    break;
                                } else {
                                    System.out.println("Rareza no válida. Por favor, ingrese un número entre 1 y 100.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Rareza no válida. Por favor, ingrese un número.");
                                scanner.next();
                            }
                        }
                        double precioSello = 0;
                        while (true) {
                            System.out.print("Ingrese el precio: ");
                            try {
                                precioSello = scanner.nextDouble();
                                if (precioSello >= 0) {
                                    break;
                                } else {
                                    System.out.println("Precio no válido. Por favor, ingrese un número no negativo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Precio no válido. Por favor, ingrese un número.");
                                scanner.next();
                            }
                        }
                        double altura = 0;
                        while (true) {
                            System.out.print("Ingrese la altura: ");
                            try {
                                altura = scanner.nextDouble();
                                if (altura >= 0) {
                                    break;
                                } else {
                                    System.out.println("Altura no válida. Por favor, ingrese un número no negativo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Altura no válida. Por favor, ingrese un número.");
                                scanner.next();
                            }
                        }
                        double anchura = 0;
                        while (true) {
                            System.out.print("Ingrese la anchura: ");
                            try {
                                anchura = scanner.nextDouble();
                                if (anchura >= 0) {
                                    break;
                                } else {
                                    System.out.println("Anchura no válida. Por favor, ingrese un número no negativo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Anchura no válida. Por favor, ingrese un número.");
                                scanner.next();
                            }
                        }
                        double tamanoImagen = 0;
                        while (true) {
                            System.out.print("Ingrese el tamaño de la imagen: ");
                            try {
                                tamanoImagen = scanner.nextDouble();
                                if (tamanoImagen >= 0) {
                                    break;
                                } else {
                                    System.out.println("Tamaño de la imagen no válido. Por favor, ingrese un número no negativo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Tamaño de la imagen no válido. Por favor, ingrese un número.");
                                scanner.next();
                            }
                        }

                        System.out.print("Ingrese el estado de conservación (U, NSG, NF, N): ");
                        String estadoConservacionSelloInput = scanner.next();
                        EstadoConservacionSello estadoConservacionSello;
                        try {
                            estadoConservacionSello = EstadoConservacionSello.valueOf(estadoConservacionSelloInput);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Estado de conservación no válido. Intente de nuevo.");
                            break;
                        }
                        // Crear un nuevo sello y añadirlo a la colección
                        Sello sello = new Sello(paisSello, autoridadSello, annusSello, valorSello, unidadMonetariaSello, rarezaSello, precioSello, altura, anchura, tamanoImagen, estadoConservacionSello);
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
                        throw new IllegalArgumentException("Opción no válida");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (opcion != 0);

        // Cerrar el escáner
        scanner.close();
    }
}