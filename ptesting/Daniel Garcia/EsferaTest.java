package PruebasGPI2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel García
 */
public class EsferaTest {
    private Esfera esferaPorDefecto;
    private Esfera esfera1;
    private Esfera esfera2;
    private Esfera esfera3;
    
    @Before
    public void setUp() {
        esferaPorDefecto = new Esfera();
        esfera1 = new Esfera(1);
        esfera2 = new Esfera(15);
        esfera3 = new Esfera(33.33);
    }
    
    @After
    public void tearDown() {
        esferaPorDefecto = null;
        esfera1 = null;
        esfera2 = null;
        esfera3 = null;
    }

    @Test
    public void testArea() {
        System.out.println("area");
        Esfera instance = new Esfera();
        
        assertEquals(12.5664, esferaPorDefecto.area(), 0.0001);
        assertEquals(12.5664, esfera1.area(), 0.0001);
        assertEquals(2827.4333, esfera2.area(), 0.0001);
        assertEquals(13959.8416, esfera3.area(), 0.0001);
    }

    @Test
    public void testVolumen() {
        System.out.println("volumen");
        Esfera instance = new Esfera();
        
        assertEquals(4.1887, esferaPorDefecto.volumen(), 0.0001);
        assertEquals(4.1887, esfera1.volumen(), 0.0001);
        assertEquals(14137.1669, esfera2.volumen(), 0.0001);
        assertEquals(155093.8404, esfera3.volumen(), 0.0001);
    }
    
}
