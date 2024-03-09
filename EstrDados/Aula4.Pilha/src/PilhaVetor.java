
public class PilhaVetor {
    //Atributos de classe são variaveis globais
    int registraTopo;
    String[] vetorPilha;
    
    //Construtor
    public PilhaVetor(int tamanho){
        registraTopo=0;
        vetorPilha = new String[tamanho];
    }
    
    //Métodos
    public void empilhar(String entrada){
        if(verificaPilhaCheia()==false){
            vetorPilha[registraTopo] = entrada;
            registraTopo++;
        }
    }
    
    public String desempilha(){
        if(verificaPilhaVazia()==false){
            registraTopo--;
            return vetorPilha[registraTopo];
        }
        return "A pilha já está vazia!";
    }
    
    public boolean verificaPilhaCheia(){
        if(vetorPilha.length==registraTopo)
            return true;
        else
            return false;
        }
    
    public boolean verificaPilhaVazia(){
        if(registraTopo==0)
            return true;
        else
            return false;
        }
    
}
