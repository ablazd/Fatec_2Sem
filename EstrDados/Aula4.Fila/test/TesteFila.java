

import org.junit.Test;
import static org.junit.Assert.*;



public class TesteFila {
    /*
    @Test
    public void adicionarUmItem(){

        FilaComLista fila = new FilaComLista();

        fila.adicionar(0);

        assertEquals(1, fila.tamanho());

    }
    
    @Test
    public void adicionarTresItem(){
        FilaComLista fila = new FilaComLista();
        fila.adicionar(0);
        fila.adicionar(1);
        fila.adicionar(2);
        assertEquals(3,fila.tamanho());
        
    }
    
    @Test
    public void adicionarTresRemoverDoisItens(){
        FilaComLista fila = new FilaComLista();
        fila.adicionar(0);
        fila.adicionar(1);
        fila.adicionar(2);
        
        assertEquals(3,fila.tamanho());
        assertEquals(0,fila.tamanho());
        assertEquals(1,fila.tamanho());
        
        assertEquals(1,fila.tamanho());
    }
    */
    @Test
    public void verificaPrioridade(){
        FilaComLista fila = new FilaComLista();
        fila.adicionar(0);
        fila.adicionar(1);
        assertEquals(0,fila.exibirInicio());
        fila.adicionar(65);
        assertEquals(65,fila.exibirInicio());
        fila.remover();
        assertEquals(0,fila.exibirInicio());
    }
}
