
public class Principal {

    
    public static void main(String[] args) {
        String vetor[]=new String[]{"(","}"};
        System.out.println(validaBalanceamento(vetor));
        String vetor2[]=new String[]{"(",")"};
        System.out.println(validaBalanceamento(vetor2));

    }
    
    public static boolean validaBalanceamento(String[] vetor){
        
        Pilha p = new Pilha();
        
        for(int i=0;i<vetor.length;i++){
            //vetor[i]== simbolo de abertura[
            if(vetor[i]=="(" || vetor[i]=="{" || vetor[i]=="["){
                if (vetor[i] == "(")
                    p.empilhar(")");
            }        
        }
        return false;
    }
    
}
