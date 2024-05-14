
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class TesteMotocicleta {
    
    public static void main(String[] args) {
        Motocicleta motoca = new Motocicleta ("Honda", "GC 150", 100);
        Motocicleta motoca2 = null;
        System.out.println("Velocidade atual: " + motoca.getVelocidade());
        motoca.alterarVelocidade(1.5f);
        System.out.println("Velocidade atual: " + motoca.getVelocidade());
        
        try {
            Serializador.gravar("motoca.dat", motoca);
        } catch (IOException ex) {
            System.out.println("Erro Gravar: "+ex.getMessage());
        }
        
        try {
            motoca2 = (Motocicleta) Serializador.ler("motoca.dat");
        } catch (Exception ex) {
            System.out.println("Erro Ler: "+ ex.getMessage());
        }
        
        System.out.println("Motoca 2 = "+ motoca2.getVelocidade());
        
    }
    
}
