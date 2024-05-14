
package Escola;

public class Funcionario extends Pessoa {

    public Funcionario(String nome, String genero) {
        super(nome, genero);
    }
    
    public Funcionario(String nome, int idade, String genero){
        super(nome, idade, genero);
    }
    
    //metodo get
    @Override
    public String getNome() {
        if (super.getGenero().equals("masculino"))
            return "Sr." + super.nome;
        else
            return "Sra." + super.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
