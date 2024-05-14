
import java.io.Serializable;


public class Motocicleta implements Serializable{
    //atributos
    private String marca, modelo;
    private float velocidade;
    
    //construtor
    //metodo que constroi o objeto, sempre tem o mesmo nome que a classe
    // não tem retorno
    public Motocicleta(String marca, String modelo, float velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
    
    //metodo get

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getVelocidade() {
        return velocidade;
    }
    
    //metodo set
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    
    
            
    public float alterarVelocidade(float fatorAceleração){
        velocidade = velocidade * fatorAceleração;
        return velocidade;
    }
    
    public float parar(){
        velocidade = 0;
        return velocidade;
    }
    
}
