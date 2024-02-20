
package classes;

public class Pessoa {
    
    //Atributos da classe
    String nome;
    int qtdFilhos, qtdIrmaos;
    String[] nomeFilhos = new String[20];
    //vetores[] são instanciados no inicio e não deve ficar mudando
    
    /*Metodo "Apresentar", responde com o Nome concatenado 
    com a quantidade de Filhos.
    */
    public String Apresentar(){
        return "O " + nome + " poussi " + qtdFilhos + " filhos! ";
    }
    
    public String ApresentarFilhos(){
        String resposta = "Meus filhos são ";
        
        for(int i = 0; i < 20; i++){
            resposta = resposta + nomeFilhos[i] + ", ";
        }
        
        return resposta;
        //quando chega no return ele encerra a função
    }
}
