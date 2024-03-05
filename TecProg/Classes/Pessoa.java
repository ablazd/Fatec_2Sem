
package classes;

public class Pessoa {
    
    //Atributos da classe
    String nome;
    int qtdFilhos, qtdIrmaos;
    String[] nomeFilhos = new String[20];
    //vetores[] são instanciados no inicio e não deve ficar mudando
    String cpf;
    
    
    /* Método construtor*/
    
    public Pessoa(String nome){
        this.nome="Sr."+nome;
    }
    public Pessoa(String nome, String cpf){
        this(nome);//chama o construtor Pessoa(String nome)
        this.cpf = cpf;
    }
    
    /*Métodos Setter e Getter*/
    public void setCpf(String cpf){
        if(this.cpf==null)
            //Verifica se CPF é nul, se sim permite settar 
            this.cpf= cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setQtdFilhos(int qtdFilhos){
        this.qtdFilhos = qtdFilhos;
    }
    public int getQtdFilhos(){
    return this.qtdFilhos;
    }
    
    /*Metodo "Apresentar", responde com o Nome concatenado 
    com a quantidade de Filhos.*/
    public String Apresentar(){
        return "O " + nome + " possui " + qtdFilhos + " filhos! ";
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

