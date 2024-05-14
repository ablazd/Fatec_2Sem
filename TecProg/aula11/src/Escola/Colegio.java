
package Escola;

public class Colegio extends Aluno{
    
    public Colegio(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public String getNota() {
        //nota deverá ser retornada no formada 0 a 10
        return String.valueOf(super.nota);
    }
    
}
