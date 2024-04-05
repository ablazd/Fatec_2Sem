
public class Principal {

    
    public static void main(String[] args) {
        
        ListaLigada minhaLista = new ListaLigada(); 
        minhaLista.add("Ana"); 
        minhaLista.add("Eduarda",  0);
        minhaLista.add("Rodrigo", 1);
        minhaLista.add("Lili", 3);
        System.out.println(minhaLista.concatenaNos());

        minhaLista.remover(3);

        System.out.println(minhaLista.concatenaNos());
    }
    
}
