/**
 * Clase heredera de FiguraGeometrica. Contiene métodos y atributos de triángulo.
 */

public class Triangulo extends FiguraGeometrica{

    private double base, altura;

    /**
     * Constructor de la clase
     *
     * @param nombre nombre de la figura
     * @param color color de la figura
     * @param base base del triángulo
     * @param altura altura del triángulo
     */
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Setter del atributo base
     * @param base la medida de la base del triángulo
     *
     * Complejidad temporal: complejidad constante O(1)
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Setter del atributo altura
     * @param altura la medida de la altura del triángulo
     *
     * Complejidad temporal: complejidad constante O(1)
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcula el área de la figura. (Override de obtenerArea en FiguraGeometrica)
     * @return Area del triángulo
     *
     * Complejidad temporal: Complejidad constante O(1)
     */
    @Override
    public double obtenerArea(){
        return (base * altura) / 2;
    }
}