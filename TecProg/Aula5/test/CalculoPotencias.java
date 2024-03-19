

import org.junit.Test;
import static org.junit.Assert.*;


public class CalculoPotencias {
    
    @Test
    public void testePotenciaDeDois(){
        Matematica mat = new Matematica();
        //Teste2^0
        int base =2;
        int potencia = 0;
        assertEquals(1,mat.pot(base,potencia));
 
}
    
    @Test
    public void testePotenciaDeDoisUm(){
        Matematica mat = new Matematica();
        //Teste2^1
        int base =2;
        int potencia = 1;
        assertEquals(1,mat.pot(base,potencia));}

    @Test
    public void testePotenciaDeDoisDois(){
        Matematica mat = new Matematica();
        //Teste2^2
        int base =2;
        int potencia = 2;
        assertEquals(2,mat.pot(base,potencia));}
    }
    

