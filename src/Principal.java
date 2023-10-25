import java.util.Scanner;
public class Principal {

    /**
     * Método main. Crea los objetos de las clases triángulo, rectángulo y círculo. Crea variables
     * relacionadas con cadauno de los atributos de las clases.
     * Pide al ususario que ingrese por consola los atributos "nombre" y color"
     * Pide al usuario que seleccione una opción correspondiente a cada figura.
     * Dependiendo de la opción seleccionada por el usuario realiza los métodos de la clase triángulo,
     * rectángulo o círculo. Para cada uno de los casos imprime en consola la información solicitada.
     *
     * @param args
     *
     * Complejidad temporal: complejidad constante O(1)
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre = "", color = "";
        double base = 0, altura = 0, lado1 = 0, lado2 = 0, radio = 0, area = 0, perimetro = 0;
        Triangulo triangulo = new Triangulo(nombre, color, base, altura);
        Circulo circulo = new Circulo(nombre, color, radio);
        Rectangulo rectangulo = new Rectangulo(nombre, color, lado1, lado2);

        System.out.println("Ingrese el nombre de la figura");
        nombre = sc.nextLine();
        System.out.println("Ingrese el color de la figura");
        color = sc.nextLine();
        System.out.println("Ingrese el tipo de figura");
        int opcion = sc.nextInt();

        switch(opcion){

            case 1:

                System.out.println("ingrese el radio del circulo");
                radio = sc.nextDouble();
                circulo.setRadio(radio);
                area = circulo.obtenerArea();
                perimetro = circulo.obtenerPerimetro();
                System.out.println("El área es " + area + " y el perímetro es " + perimetro + " de la figura " + nombre + " de color " + color);
                break;

            case 2:

                System.out.println("Ingrese el valor del lado 1");
                lado1 = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 2");
                lado2 = sc.nextDouble();
                rectangulo.setLado1(lado1);
                rectangulo.setLado2(lado2);
                area = rectangulo.obtenerArea();
                perimetro = rectangulo.obtenerPerimetro();
                System.out.println("El área es " + area + " y el perímetro es " + perimetro + " de la figura " + nombre + " de color " + color);
                break;

            case 3:

                System.out.println("Ingrese la base del triángulo");
                base = sc.nextDouble();
                System.out.println("Ingrese la altura del triángulo");
                altura = sc.nextDouble();
                triangulo.setBase(base);
                triangulo.setAltura(altura);
                area = triangulo.obtenerArea();
                System.out.println("El área es " + area  + " de la figura " + nombre + " de color " + color);
                break;
        }
    }
}