package PruebasGPI2;

/**
 *
 * @author Daniel García
 */
public class Esfera {

    private double radio;

    public Esfera() {
        radio = 1;
    }

    public Esfera(double radio) {
        this.radio = radio;
    }

    //devuelve el area de la esfera
    public double area() {
        return 4 * Math.PI * radio*radio;
    }

    //devuelve el volumen de la esfera
    public double volumen() {
        return 4./3. * Math.PI * radio * radio * radio;
    }
}
