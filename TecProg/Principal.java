
public class Principal {

    
    public static void main(String[] args) {
        //Cliente
        Cliente Ana = new Cliente ("Ana", "11122233345", "Rua fresnkndb");
        System.out.println("Nome: "+ Ana.getNome()+ "\nCPF: " + Ana.getCPF() + " \nEndereço: "+ Ana.getEndereco());
        
        //Conta bancaria depositar
        ContaBancaria conta = new ContaBancaria(Ana, "CC", 1000.0f, "Aberta");
        System.out.println("Saldo inicial: "+ conta.getSaldoConta());
        conta.depositar(500.0f);
        System.out.println("Saldo atual: " + conta.getSaldoConta());
        
        //Conta bancaria retirar
        System.out.println("Saldo inicial: "+ conta.getSaldoConta());
        conta.retirar(300.0f);
        System.out.println("Saldo atual: " + conta.getSaldoConta());
        
        //Cobrar taxas CP 9,99 CC 19,99
        System.out.println(conta.taxa());
    
        //Extrato
        System.out.println(conta.extratoConta());
        
        
    }
    
}
