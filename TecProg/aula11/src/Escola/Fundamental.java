
package Escola;

public class Fundamental extends Aluno{

    public Fundamental(String nome, int idade) {
        super(nome, idade);
    }
    
    //metodo get
    
    @Override
    public String getNota() {
        //nota deverá ser retornada no formato A a D, sendo A(10,9),
        //B(8,7), C(6,5) e D(<5)
        return "";
        
      
    }
    
}
