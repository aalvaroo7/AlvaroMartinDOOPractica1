package uax.practica1.elementocoleccionable;

public abstract class ElementoColeccionable {
    private String pais;
    private String autoridadGobernante;
    private int annus;
    private double valor;
    private String unidadMonetaria;
    private int rareza;
    private double precio;

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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAutoridadGobernante() {
        return autoridadGobernante;
    }

    public void setAutoridadGobernante(String autoridadGobernante) {
        this.autoridadGobernante = autoridadGobernante;
    }

    public int getAnnus() {
        return annus;
    }

    public void setAnnus(int annus) {
        this.annus = annus;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUnidadMonetaria() {
        return unidadMonetaria;
    }

    public void setUnidadMonetaria(String unidadMonetaria) {
        this.unidadMonetaria = unidadMonetaria;
    }

    public int getRareza() {
        return rareza;
    }

    public void setRareza(int rareza) {
        if (rareza < 1 || rareza > 100) {
            throw new IllegalArgumentException("Rareza debe estar entre 1 y 100");
        }
        this.rareza = rareza;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}