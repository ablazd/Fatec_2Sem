/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Cliente {
    
    //Atributos de classe 
    private String nome;
    private String CPF;
    private String endereco;
    
    //Metodo construtor 
    public Cliente(String nome, String CPF, String endereco){
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        
    }
    
    //Metodo get
    public String getNome(){
        return this.nome;
    }
    
    public String getCPF(){
        return this.CPF;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    //Metodo set
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCPF (String CPF){
        this.CPF = CPF;
    }
    public void setEndereco (String endereco){
        this.endereco = endereco;
    }
    
    
}
