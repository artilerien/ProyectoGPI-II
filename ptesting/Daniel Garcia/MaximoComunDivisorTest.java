package PruebasGPI2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel García
 */
public class MaximoComunDivisorTest {
    
    public MaximoComunDivisorTest() {
    }
    
    //no hacen falta preparaciones previas, así que no hay setUp() ni tearDown()

    //Desde el punto de vista de coste computacional, consideramos que un más de
    //10 segundos para realizar tres pruebas no es permisible, y también
    //nos aseguramos de que no haya bucles infinitos
    @Test(timeout=10000)
    public void testMcdRestaParticionesEquivalencia() {
        System.out.println("mcdResta");
        
        //por simplificar, se eligen pares de valores de diferentes particiones
        //de equivalencia y se comprueban juntos
        assertEquals(5, MaximoComunDivisor.mcdResta(40, 35));
        assertEquals(1, MaximoComunDivisor.mcdResta(1, 1));
        assertEquals(1, MaximoComunDivisor.mcdResta(4, 97));
    }
    
    @Test(timeout=10000)
    public void testMcdDivisionParticionesEquivalencia() {
        System.out.println("mcdDivision");
        
        assertEquals(5, MaximoComunDivisor.mcdDivision(40, 35));
        assertEquals(1, MaximoComunDivisor.mcdDivision(1, 1));
        assertEquals(1, MaximoComunDivisor.mcdDivision(4, 97));
    }
    
    /* también se podrían hacer pruebas de casos especiales (que un número sea cero),
    casos no válidos (que los dos números sean cero), casos extremos (valores que 
    se salgan del rango), etc
    */
    
}
