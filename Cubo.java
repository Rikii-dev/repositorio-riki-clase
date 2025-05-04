package clases;

/**
 * Representa un cubo con un lado dado.
 */
public class Cubo {
    private int lado;

    /**
     * Constructor por defecto. Lado = 1.
     */
    public Cubo() {
        this.lado = 1;
    }

    /**
     * Constructor con parámetro.
     * @param lado Lado del cubo
     */
    public Cubo(int lado) {
        this.lado = lado;
    }

    /**
     * Calcula la superficie del cubo.
     * @return superficie
     */
    public int superficie() {
        return 6 * (lado * lado);
    }

    /**
     * Calcula el volumen del cubo.
     * @return volumen
     */
    public int volumen() {
        return lado * lado * lado;
    }

    public int getLado() {
        return lado;
    }
}
