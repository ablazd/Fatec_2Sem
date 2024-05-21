
package feiraoveiculos.Controller;

import feiraoveiculos.Model.*;
import java.util.ArrayList;
import java.util.List;

public class Controlador {
    //atributos
    private List <Veiculo>listaVeiculo;
    private List<Pessoa> listaPessoa;
    
    //construtor
    public Controlador(){
        listaPessoa = new ArrayList<Pessoa>();
        listaVeiculo = new ArrayList<Veiculo>();
    }
    
    public void cadastrarPessoa(String nome, String telefone, String CPF){
        listaPessoa.add(new Pessoa(nome, telefone, CPF));
    }
    
    public void cadastrarCliente(String nome, String telefone, String CPF, float valorMax, float valorMin, String tipoVeiculo){
        listaPessoa.add(new Cliente(nome, telefone, CPF, valorMax, valorMin, tipoVeiculo));
    }
}
