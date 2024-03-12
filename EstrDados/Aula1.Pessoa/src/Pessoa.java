/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Pessoa {
     //Atributos da Classe
    String nome;
    int qntFilhos, qntIrmaos;
    String[] nomesFilhos = new String[20];
    String[] nomesIrmaos = new String[10];
    private String cpf; //variaveis privadas sao representadas por "-"
    
    /* M�todo Construtor */
    //construtores n�o possuem retorno
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf) {
        this(nome); //chama o construtor Pessoa(String nome).
        this.cpf = cpf; //torna obrigatorio o uso do cpf para instanciar pessoa.
    }
    
    /* M�todo Setter */
    //metodos setters n�o precisam ter retorno por isso usa void.
    public void setCpf(String cpf) {
        if(this.cpf == null) { //verifica se o cpf � nulo, se V pode atribuir
            this.cpf = cpf;
        } //somente em construtores nao usa o ponto "."
    }
    
    /* M�todo Getter */
    public String getCpf() { //metodos get nao precisam de parametro.
        return this.cpf; //� necessario o retorno.
    }
    
    /*M�todos da Classe
    M�todo "Apresentar", responde com o Nome
    concatenado com a quantidade de Filhos. */
    
    public String Apresentar() {
        return nome + " possui " + qntFilhos + " filhos.";
    }
    
    public String ApresentarFilhos() {
        String resposta = "Meus filhos s�o ";
        int qntFilhosAux = 0;
        
        for(int i = 0; i < 20; i++) {
            if (nomesFilhos[i] != null) {
                qntFilhosAux++;
                resposta += nomesFilhos[i] + ", ";   
            }           
        }
        
        if (qntFilhosAux > 0) {
            return resposta + "Quantidade de Filhos: " + qntFilhosAux;
        }
        else {
            return "N�o possui filhos.";
        }
    }
    
    public String ApresentarIrmaos() {
        String resposta = "Meus Irmaos s�o: ";
        int qntIrmaosAux = 0;
        
        for(int i = 0; i < 10; i++) {
            if (nomesIrmaos[i] != null) {
                qntIrmaosAux++;
                resposta += nomesIrmaos[i] + ", ";
            }
        }
        if (qntIrmaosAux > 0) {
            return resposta + "Quantidade de irm�os: " + qntIrmaosAux;
        }
        else {
            return "N�o possui irm�os.";
        }
    }
}
