
public class Principal {

    public static void main(String[] args) {
        Pessoa maeDoJoao = new Pessoa("Maria");
        Pessoa Joao = new Pessoa("Joao", maeDoJoao);
        Pessoa IrmaoJoao = new Pessoa("Jorel", maeDoJoao);
            System.out.println("Nome: "+ Joao.getNome());
            Joao.setNome("Joao dos Santos");
            System.out.println("Nome: "+ Joao.getNome());
            maeDoJoao.addFilho(Joao);
            maeDoJoao.addFilho(IrmaoJoao);
            System.out.println("Mãe do João: "+Joao.getMae().getNome());
            System.out.println("Irmão do João: "+Joao.getMae().getListaFilhos()[1].getNome());
            System.out.println("Filhos: "+ maeDoJoao.retornaListaFilhos());
    }
        
    
}
