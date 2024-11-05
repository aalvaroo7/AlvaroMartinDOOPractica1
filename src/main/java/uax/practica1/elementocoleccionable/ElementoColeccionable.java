package uax.practica1.elementocoleccionable;

// Clase abstracta que representa un elemento coleccionable
public abstract class ElementoColeccionable {
    private String pais; // País de origen del elemento
    private String autoridadGobernante; // Autoridad gobernante del elemento
    private int annus; // Año del elemento
    private double valor; // Valor del elemento
    private String unidadMonetaria; // Unidad monetaria del valor del elemento
    private int rareza; // Rareza del elemento
    private double precio; // Precio del elemento

    // Constructor de la clase ElementoColeccionable
    public ElementoColeccionable(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio) {
        if (rareza < 1 || rareza > 100) {
            throw new IllegalArgumentException("Rareza debe estar entre 1 y 100");
        }
        this.pais = pais;
        this.autoridadGobernante = autoridadGobernante;
        this.annus = annus;
        this.valor = valor;
        this.unidadMonetaria = unidadMonetaria;
        this.rareza = rareza;
        this.precio = precio;
    }

    // Getter para el país del elemento
    public String getPais() {
        return pais;
    }

    // Setter para el país del elemento
    public void setPais(String pais) {
        this.pais = pais;
    }

    // Getter para la autoridad gobernante del elemento
    public String getAutoridadGobernante() {
        return autoridadGobernante;
    }

    // Setter para la autoridad gobernante del elemento
    public void setAutoridadGobernante(String autoridadGobernante) {
        this.autoridadGobernante = autoridadGobernante;
    }

    // Getter para el año del elemento
    public int getAnnus() {
        return annus;
    }

    // Setter para el año del elemento
    public void setAnnus(int annus) {
        this.annus = annus;
    }

    // Getter para el valor del elemento
    public double getValor() {
        return valor;
    }

    // Setter para el valor del elemento
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Getter para la unidad monetaria del elemento
    public String getUnidadMonetaria() {
        return unidadMonetaria;
    }

    // Setter para la unidad monetaria del elemento
    public void setUnidadMonetaria(String unidadMonetaria) {
        this.unidadMonetaria = unidadMonetaria;
    }

    // Getter para la rareza del elemento
    public int getRareza() {
        return rareza;
    }

    // Setter para la rareza del elemento
    public void setRareza(int rareza) {
        if (rareza < 1 || rareza > 100) {
            throw new IllegalArgumentException("Rareza debe estar entre 1 y 100");
        }
        this.rareza = rareza;
    }

    // Getter para el precio del elemento
    public double getPrecio() {
        return precio;
    }

    // Setter para el precio del elemento
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}