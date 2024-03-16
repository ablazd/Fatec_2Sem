
import java.util.ArrayList;
import java.util.List;
//import java.util.*; Importa a biblioteca toda

public class FilaComLista {
    //declarar os atributos do objeto
    List fila = new ArrayList<Integer>();
    
    //      Métodos da classe fila        //
    //Adicionar um inteiro no final da fila
    public void adicionar(Integer item){
        fila.add(item);
        if (item>=60){
            fila.add(0,item);
            }
        else{
            fila.add(item);
        }
    }

    public int tamanho(){
        return fila.size();
    }
     
    
    public Object exibirInicio(){
        return (Integer) fila.get(0);
    }
    
    public Object remover(){
        return(Integer)fila.remove(0);
    }
    
}
