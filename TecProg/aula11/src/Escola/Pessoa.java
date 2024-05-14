
package Escola;

public abstract class Pessoa {
    // atributos
    protected String nome;
    private int idade;
    private String genero;
    
    //construtor
    public Pessoa(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }
    
    public Pessoa(String nome, int idade, String genero){
        this(nome, genero);//chama o construtor acima
        this.idade = idade;
    }
    
    //metodo 
    // metodo abstrato, deve ser implementadonas classes filhas
    public abstract String getNome();
    
    public String getGenero(){
        return this.genero;
    }
    
    public int getIdade(){
        return idade;
    }
    
    //metodo set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
