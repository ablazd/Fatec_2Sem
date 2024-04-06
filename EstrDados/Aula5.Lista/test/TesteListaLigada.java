
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteListaLigada {
    
    @Test
    public void testeCriacaodeNos(){
        Object info = "Ana";
        No proximoNo = null;
        No meuPrimeiroNo = new No(info, proximoNo);
        assertEquals("Ana", meuPrimeiroNo.getInfo());
    }
    
    @Test
    public void testeCriacaoLista(){
        
        ListaLigada minhaLista = new ListaLigada();
        
        minhaLista.add("Ana");
        minhaLista.add("Eduarda");
        minhaLista.add("Rodrigo");
        
        assertEquals("Ana", minhaLista.get(0)); 
        assertEquals("Eduarda", minhaLista.get(1)); 
        assertEquals("Rodrigo", minhaLista.get(2));
        assertEquals(3, minhaLista.getTamanhoLista());
    }
    
    @Test
    public void testAdd() {
        ListaLigada minhaLista = new ListaLigada();
        
        minhaLista.add("Ana");
        minhaLista.add("Eduarda");
        minhaLista.add("Rodrigo", 1);

        assertEquals("Ana", minhaLista.get(0));
        assertEquals("Rodrigo", minhaLista.get(1));
        assertEquals("Eduarda", minhaLista.get(2));
        
        minhaLista.add("Julia", 1);
        
        assertEquals("Julia", minhaLista.get(1));
        assertEquals("Rodrigo", minhaLista.get(2));
        assertEquals("Eduarda", minhaLista.get(3));
        
    }
    
    @Test
    public void testeRemover(){
        ListaLigada minhaLista = new ListaLigada();
        
        minhaLista.add("Ana");
        minhaLista.add("Rodrigo");
        minhaLista.add("Eduarda");

        assertEquals("Ana", minhaLista.get(0));
        assertEquals("Rodrigo", minhaLista.get(1));
        assertEquals("Eduarda", minhaLista.get(2));
        
        minhaLista.remover(1);
        assertEquals("Eduarda", minhaLista.get(1));
    }
    
    @Test
    public void testeConcatenaNo(){
        ListaLigada minhaLista = new ListaLigada();
        
        minhaLista.add("Ana,");
        minhaLista.add("Rodrigo,");
        minhaLista.add("Eduarda");
        
        assertEquals("Lista de nos: Ana,Rodrigo,Eduarda", minhaLista.concatenaNos());
    } 
    
}
