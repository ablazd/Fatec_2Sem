
package heranca;
import java.util.ArrayList;
import java.util.List;


public class Aluno extends Pessoa{
    
    private Float[] valorNotas = new Float[10];
    
    public Aluno(String nome) {
        super(nome);
    }
    
    public void addNota(float valorNota){
        for (int i = 0; i < 10; i++){
            if (valorNotas[i] == null){
                valorNotas[i] = valorNota;
                return;
            }
        }
    }
    
    public float calculaMedia(){
        float contador = 0;
        for (int i = 0; i <= valorNotas.length -1 ; i++ ){
            contador += valorNotas[i];
        }
        
        return contador / valorNotas.length;
        
    }
    
    
}
