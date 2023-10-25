/**
 * Clase heredera de FiguraGeometrica. Contiene métodos y atributos de círculo.
 */
public class Circulo extends FiguraGeometrica{

    /**
     * Atributos de la clase
     */
    private double radio;

    /**
     * Constructor de la clase
     *
     * @param nombre nombre de la figura
     * @param color color de la figura
     * @param radio radio del círculo
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    /**
     * Setter del atributo radio
     * @param radio radio del circulo
     *
     * Complejidad temporal: complejidad constante O(1)
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Calcula el área de la figura. (Override de obtenerArea en FiguraGeometrica)
     * @return Area del circulo
     *
     * Complejidad temporal: Complejidad constante O(1)
     */
    @Override
    public double obtenerArea(){
        return 3.1415 * radio * radio;
    }

    /**
     * Calcula el perímetro de la figura. (Override de obtenerPerimetro en FiguraGeometrica)
     * @return Perimetro del circulo
     *
     * Complejidad temporal: Complejidad constante O(1)
     */
    @Override
    public double obtenerPerimetro(){
        return 3.1415 * radio * 2;
    }
}