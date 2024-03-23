
public class ListaLigada {
    //Atributos
    No primeiroNo;
    No ultimoNo;
    int tamanhoLista;
    
    public ListaLigada(){
        tamanhoLista=0;
        primeiroNo = ultimoNo = null;
    }
    
    //adiciona um nó na ultima posição 
    public void add(Object elemento){
        No aux = new No(elemento, null);
        //para o 1° nó:
        if (primeiroNo==null && ultimoNo==null){
            primeiroNo = ultimoNo = aux;
            tamanhoLista++;
        }
        //para os demais nós
        else {
            ultimoNo.setProximoNo(aux);
            tamanhoLista++;
            
        }
        
    }
    
    //recebe o indice iniciando em zero e retorna o 
    //campo Info do nó correspondente
    public Object get(int indice){
        /*metodo que deve percorrer a lista retornando o nó
         correspondente ao indice solicitado*/
        if(indice >= 0 && indice < tamanhoLista){
        return percorreLista(indice);
        }
        else return null;
    }

    private No percorreLista(int indice) {
        No aux = primeiroNo;
        for(int i=0; i<indice; i++){
            aux=aux.getProximoNo();
        }
        return null;
    }
    
}
