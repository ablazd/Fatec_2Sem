
package Arvore;


public class TesteArvore {
    public static void main(String[] args) {
        ArvoreBinaria b1=new ArvoreBinaria(5);
        b1.addNoOrdenado(3);
        b1.addNoOrdenado(1);
        b1.addNoOrdenado(2);
        b1.addNoOrdenado(4);
        b1.addNoOrdenado(8);
        b1.addNoOrdenado(7);
        b1.addNoOrdenado(6);
        b1.addNoOrdenado(5);
        b1.addNoOrdenado(9);
        
        b1.imprimirPreOrdem();
        b1.imprimirEmOrdem();
        b1.imprimirPosOrdem();
    
    }
}
