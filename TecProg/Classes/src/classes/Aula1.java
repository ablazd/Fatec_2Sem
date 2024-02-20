
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
        pai = new Pessoa();
        pai.nome = "Rodrigo";
        pai.qtdFilhos = 2;
        pai.qtdIrmaos = 5;
        System.out.println(pai.Apresentar());
        //System.out.println(pai.nome + " possui " + pai.qtdFilhos + " filhos e " + pai.qtdIrmaos + " irmãos. ");
        
        Pessoa mae = new Pessoa();
        mae.nome = "Paula";
        mae.qtdFilhos = 2;
        System.out.println(mae.ApresentarFilhos());
        mae.nomeFilhos[0] = "Maria";
        mae.nomeFilhos[1] = "João";
        System.out.println(mae.ApresentarFilhos());
        
        
        
    }
    
}
