/**
 * Clase heredera de FiguraGeometrica. Contiene métodos y atributos de rectángulo.
 */
public class Rectangulo extends FiguraGeometrica{

    /**
     * Atributos de la clase
     */
    private double lado1, lado2;

    /**
     * Constructor de la clase
     *
     * @param nombre el nombre de la figura
     * @param color el color de la figura
     * @param lado1 la medida del lado 1 del rectangulo
     * @param lado2 la medida del lado 2 del rectangulo
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Setter del atributo lado 1
     * @param lado1 el lado 1 del rectangulo
     *
     * Complejidad temporal: complejidad constante O(1)
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * Setter del atributo lado 2
     * @param lado2 el lado 2 del rectangulo
     *
     * Complejidad temporal: complejidad constante O(1)
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Calcula el área de la figura. (Override de obtenerArea en FiguraGeometrica)
     * @return Area del rectangulo
     *
     * Complejidad temporal: Complejidad constante O(1)
     */
    @Override
    public double obtenerArea(){
        return lado1 * lado2;
    }

    /**
     * Calcula el perímetro de la figura. (Override de obtenerPerimetro en FiguraGeometrica)
     * @return Perimetro del rectangulo
     *
     * Complejidad temporal: Complejidad constante O(1)
     */
    @Override
    public double obtenerPerimetro(){
        return (2 * lado1) + (2 * lado2);
    }
}
