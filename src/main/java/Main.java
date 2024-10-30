import uax.practica1.coleccion.Coleccion;
import uax.practica1.enums.EstadoConservacionMoneda;
import uax.practica1.enums.EstadoConservacionSello;
import uax.practica1.moneda.Moneda;
import uax.practica1.sello.Sello;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final Set<String> VALID_COUNTRIES = Set.of(
            "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria",
            "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan",
            "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia",
            "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo, Democratic Republic of the", "Congo, Republic of the",
            "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador",
            "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France",
            "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau",
            "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland",
            "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South",
            "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein",
            "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania",
            "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar",
            "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia", "Norway",
            "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland",
            "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino",
            "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands",
            "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria",
            "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey",
            "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu",
            "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"
    );

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

            try {
                switch (opcion) {
                    case 1:
                        // Añadir una nueva moneda
                        String paisMoneda = "";
                        while (true) {
                            System.out.print("Ingrese el país: ");
                            paisMoneda = scanner.next();
                            if (VALID_COUNTRIES.contains(paisMoneda)) {
                                break;
                            } else {
                                System.out.println("País no válido. Por favor, ingrese un país existente.");
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
                                    System.out.println("Año no puede ser negativo. Intente de nuevo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Año no válido. Por favor, ingrese un número entero.");
                                scanner.next(); // Limpiar la entrada inválida
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
                                    System.out.println("Valor no puede ser negativo. Intente de nuevo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Valor no válido. Por favor, ingrese un número.");
                                scanner.next(); // Limpiar la entrada inválida
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
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Rareza no válida. Por favor, ingrese un número.");
                                scanner.next(); // Limpiar la entrada inválida
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
                                    System.out.println("Precio no puede ser negativo. Intente de nuevo.");
                                }
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
                                if (peso >= 0) {
                                    break;
                                } else {
                                    System.out.println("Peso no puede ser negativo. Intente de nuevo.");
                                }
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
                                if (diametro >= 0) {
                                    break;
                                } else {
                                    System.out.println("Diámetro no puede ser negativo. Intente de nuevo.");
                                }
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
                                if (grosor >= 0) {
                                    break;
                                } else {
                                    System.out.println("Grosor no puede ser negativo. Intente de nuevo.");
                                }
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
                        String paisSello = "";
                        while (true) {
                            System.out.print("Ingrese el país: ");
                            paisSello = scanner.next();
                            if (VALID_COUNTRIES.contains(paisSello)) {
                                break;
                            } else {
                                System.out.println("País no válido. Por favor, ingrese un país existente.");
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
                                    System.out.println("Año no puede ser negativo. Intente de nuevo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Año no válido. Por favor, ingrese un número entero.");
                                scanner.next(); // Limpiar la entrada inválida
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
                                    System.out.println("Valor no puede ser negativo. Intente de nuevo.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Valor no válido. Por favor, ingrese un número.");
                                scanner.next(); // Limpiar la entrada inválida
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
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Rareza no válida. Por favor, ingrese un número.");
                                scanner.next(); // Limpiar la entrada inválida
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
                                    System.out.println("Precio no puede ser negativo. Intente de nuevo.");
                                }
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
                                if (altura >= 0) {
                                    break;
                                } else {
                                    System.out.println("Altura no puede ser negativa. Intente de nuevo.");
                                }
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
                                if (anchura >= 0) {
                                    break;
                                } else {
                                    System.out.println("Anchura no puede ser negativa. Intente de nuevo.");
                                }
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
                        throw new IllegalArgumentException("Opción no válida");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (opcion != 0); // Repetir el bucle hasta que la opción sea 0

        scanner.close(); // Cerrar el objeto Scanner
    }
}