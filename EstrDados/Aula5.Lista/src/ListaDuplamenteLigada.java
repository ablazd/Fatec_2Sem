/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alunos
 */
public class ListaDuplamenteLigada {
    //Atributos
    No primeiroNo;
    No ultimoNo;
    int qtdNos;
    
    //metodo construtor, inicializa os parametros
    public ListaDuplamenteLigada(){
        qtdNos=0;
        primeiroNo= ultimoNo = null;
    }
    
    public void adicionar(Object elemento){
        No novoNo;
        // Se a lista está vazia inicializa a lista
        if(primeiroNo == null && ultimoNo == null && qtdNos==0){
            //Adicio a primeira posição
            novoNo=new No(elemento,null);
            primeiroNo= ultimoNo= novoNo;
            qtdNos=1;
        }
        else{
            // Lista já está instaciada adiciona na ultima posição
            novoNo=new No(elemento,null);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo=novoNo;
            qtdNos++;
        }
    }
    
}
