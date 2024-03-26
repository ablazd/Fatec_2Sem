
package heranca;


public class Funcionario extends Pessoa{
    
    private String cargo;
    private float salarioBase;
    
    public String getCargo() {
        return cargo;
    }
    
    public float getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Funcionario (String nome){
        super(nome);
    }
    
    public Funcionario(String nome, String cargo) {
        this(nome);
        this.cargo = cargo;
    }
    
    public Funcionario(String nome, String cargo, float salarioBase) {
        this(nome, cargo);
        this.salarioBase = salarioBase;
    }
    
    public float calculaSalario(){
        return this.salarioBase;
    }
   
}
