
package classes;

/**
 *
 * @author Alunos
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa pai;
        pai = new Pessoa("Rodrigo", "3333");
        pai.qtdFilhos = 2;
        pai.qtdIrmaos = 5;
        
        System.out.println(pai.Apresentar());
        //System.out.println(pai.nome + " possui " + pai.qtdFilhos + " filhos e " + pai.qtdIrmaos + " irmãos. ");
        System.out.println("CPF pai: "+pai.getCpf());
        pai.setCpf("0000");
        System.out.println("CPF pai novo: "+pai.getCpf());
        
        Pessoa mae = new Pessoa("Paula", "4444");
        mae.qtdFilhos = 2;
        
        System.out.println(mae.ApresentarFilhos());
        mae.nomeFilhos[0] = "Maria";
        mae.nomeFilhos[1] = "João";
        System.out.println(mae.ApresentarFilhos());
        
        
        
    }
    
}
