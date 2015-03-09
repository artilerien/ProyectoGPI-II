package PruebasGPI2;

/**
 *
 * @author Daniel García
 */

/* Esta clase calcula el máximo común divisor */
public final class MaximoComunDivisor {

    //calcula el mcd mediante el algoritmo original de Euclides basado en restas
    public static int mcdResta(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    //calcula el mcd mediante la variante con divisiones
    public static int mcdDivision(int a, int b) {
        int aux;
        
        while (b != 0){
            aux = b;
            b = a%b;
            a = aux;
        }
        return a;
    }
}
