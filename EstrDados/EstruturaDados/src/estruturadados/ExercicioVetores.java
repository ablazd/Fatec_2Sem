
package estruturadados;

public class ExercicioVetores {
    
        /*Exercicio 3: crie um metodo que receba como parametro um vetor de
      numeros binarios com oito posiçoes, calcule e retorne o valor em decimal*/
    public int converterBinarioDecimal(int[] entrada){
        int[] decimal =new int[]{128,64,32,16,8,4,2,1};
        double[] decimalAndreza = new double[8];
        int soma = 0;
        int indice = 7;
        
            System.out.println("\n======Multiplicador======");
            for(int pot=0; pot<8; pot++){
                decimalAndreza[pot] = Math.pow(2, pot);
                System.out.print(decimalAndreza[pot] + "\t");
                soma = soma + (decimal[pot]*entrada[pot]);
                indice --;
            }
            
            System.out.println("\n======Entrada======");
            for (int i =0; i <8; i++){
                System.out.print(entrada[i] + "\t");
            }
        System.out.println("\n Resposta: " + soma);  
        return soma;
    }
            
}
