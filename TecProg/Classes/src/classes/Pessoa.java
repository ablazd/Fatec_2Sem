
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
        int qtdFilhoAux = 0;
        
        for(int i = 0; i < 20; i++){
            // != diferente  == igual
            if(nomeFilhos[i] !=null){
                qtdFilhoAux++;
                resposta = resposta + nomeFilhos[i] + ", ";
            }
            
        if(qtdFilhoAux > 0)
            return resposta + "Qtd filhos: " + qtdFilhoAux;
        else
            return "Não tem filhos! "; 
        
        
        //quando chega no return ele encerra a função
    }
        return resposta + " qtd de filhos: " + qtdFilhoAux;
    }
}

