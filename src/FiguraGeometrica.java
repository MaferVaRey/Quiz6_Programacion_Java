/**
 * Clase que contiene los aspectos generales de la figura geométrica
 */
public abstract class FiguraGeometrica {

    /**
     * Atributos de la clase
     */
    private String nombre, color;

    /**
     * Constructor de la clase
     * @param nombre define el nombre de la figura
     * @param color define el color de la figura
     *
     * Complejidad temporal: complejidad constante O(1)
     */
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    /**
     * Calcula el área de la figura
     * @return 0
     *
     * Complejidad temporal: Complejidad constante O(1)
     */
    public double obtenerArea() {
        return 0;
    }

    /**
     * Calcula el perímetro de la figura
     * @return 0
     *
     * Complejidad temporal: Complejidad constante O(1)
     */
    public double obtenerPerimetro() {
        return 0;
    }
}
