package clases;

/**
 * Representa un cilindro con radio y altura.
 */
public class Cilindro {
    private int radio;
    private int altura;
    private final double PI = 3.14;

    /**
     * Constructor por defecto. Radio = 1, altura = 1.
     */
    public Cilindro() {
        this.radio = 1;
        this.altura = 1;
    }

    /**
     * Constructor con parámetros.
     * @param radio Radio
     * @param altura Altura
     */
    public Cilindro(int radio, int altura) {
        this.radio = radio;
        this.altura = altura;
    }

    /**
     * Calcula la superficie del cilindro.
     * @return superficie
     */
    public double superficie() {
        return 2 * PI * radio * radio + 2 * PI * radio * altura;
    }

    /**
     * Calcula el volumen del cilindro.
     * @return volumen
     */
    public double volumen() {
        return PI * radio * radio * altura;
    }

    public int getRadio() {
        return radio;
    }

    public int getAltura() {
        return altura;
    }
}
