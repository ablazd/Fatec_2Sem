
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteListaLigada {
    
    /*@Test
    public void testeCriacaodeNos(){
        Object info = "Ana";
        No proximoNo = null;
        No meuPrimeiroNo = new No(info, proximoNo);
        assertEquals("Ana", meuPrimeiroNo.getInfo());
    }*/
    
    @Test
    public void testeCriacaoLista(){
        
        ListaLigada minhaLista = new ListaLigada();
        
        minhaLista.add("Ana");
        minhaLista.add("Eduarda");
        minhaLista.add("Rodrigo");
        
            assertEquals("Ana", minhaLista.get(0)); 
            assertEquals("Eduarda", minhaLista.get(1)); 
            assertEquals("Rodrigo", minhaLista.get(1));
    }
    
    
}
