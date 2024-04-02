/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class ContaBancaria {
    //Atributos da conta 
    private Cliente a;
    private String tipoConta;
    private float saldoConta;
    private String statusConta;
    String extrato = "";
    
    
    //Metodo construtor
    public ContaBancaria(Cliente a, String tipoConta, float saldoConta, String statusConta){
        this.a = a;
        this.tipoConta = tipoConta;
        this.saldoConta = saldoConta;
        this.statusConta = statusConta;
    }
    
    
    
    //Metodos get
    public Cliente getA() {
        return a;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public String getStatusConta() {
        return statusConta;
    }
    
    //Metodos set
    public void setA(Cliente a) {
        this.a = a;
    }
    
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void setStatusConta(String statusConta) {
        this.statusConta = statusConta;
    }
    
    //Metodo depositar
    public void depositar(float valor) {
        saldoConta += valor;
        extrato += "Valor Depositado: " + valor + "\n";
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }
    
    //Metodo retirar
    public void retirar(float valor) {
        saldoConta -= valor;
        extrato += "Valor Retirado: " + valor + "\n";
        System.out.println("Retirada de " + valor + " realizado com sucesso.");
    }
    
    //Cobrar taxas CP 9,99 CC 19,99
    public String taxa() {
       if (tipoConta.equals("CC")) {
           saldoConta -= 19.99;
           System.out.println("Taxa Cobrada: " + 19.99f + "\n");
           extrato += "Taxa: " + 19.99f + "\n";
       }
       if (tipoConta.equals("CP")) {
           saldoConta -= 9.99;
           System.out.println("Taxa Cobrada: " + 9.99f + "\n");
           extrato += "Taxa: " + 9.99f + "\n";
       }
        return "Novo Saldo: " + saldoConta;
    }
    
    //Verificar saldo
    public void verificarSaldo(float valor){
        saldoConta = valor;
        System.out.println("Saldo atual da conta: " + valor);
    }
    
    //Exibir extrato
    public String extratoConta() {
       return "Extrato da conta \n" + extrato;
   }
    

    
}
