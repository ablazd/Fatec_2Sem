

import org.junit.Test;
import static org.junit.Assert.*;


public class TestePessoa {
    
    @Test
    public void testeArvoreGenealogica(){
    //pessoa deverá retornar sua arvore genealogica materna
    
        Pessoa maria = new Pessoa("Maria");
        Pessoa isabela = new Pessoa("Isabela", maria);
        Pessoa bia = new Pessoa("Bia", isabela);
        
        System.out.println(bia.ArvoreGenealogica());
    
    assertEquals("Maria->Isabela->Bia", bia.ArvoreGenealogica());
    
    }
    
}
