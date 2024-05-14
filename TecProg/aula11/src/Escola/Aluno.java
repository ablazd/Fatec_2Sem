
package Escola;

public abstract class Aluno extends Pessoa{
    // atributo
    protected String nota; 
    
    public Aluno(String nome, int idade, String genero){
        super(nome, idade, genero);
    }
    
    //metodo get
    @Override
    public String getNome() {
       return super.nome;
    }
    
    public abstract String getNota();
    
    //metodo set
    public void setNota(String nota) {
        this.nota = nota;
    }
    
    
}
