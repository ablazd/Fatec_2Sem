
public class Pessoa {
    //Atributos da classe
    private String nome;
    private String cpf;
    private String genero;
    private String telefone;
    private Pessoa mae;
    private Pessoa pai;
    private Pessoa[] listaFilhos = new Pessoa[10];
    private int qtdFilhos = 0;
    /************************************/
    
    //Construtor

    /**
     *
     * @param nome
     */
    public Pessoa(String nome){
        this.nome = nome;
        
    }   
    
    public Pessoa(String nome, Pessoa mae){
        //this.nome = nome;
        this(nome);
        this.mae = mae;
    }
    
    public Pessoa(String nome, Pessoa mae, Pessoa pai){
        //this(nome);
        //this.mae = mae;
        this(nome, mae);
        this.pai = pai;
    }
    /************************************/
    
    //  Métodos de acesso aos atributos  //
    /*            Método Get            */
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public Pessoa getMae(){
        return mae;
    }
    public Pessoa getPai(){
        return pai;
    }
    public Pessoa[] getListaFilhos(){
        return listaFilhos;
    }
    /*           Método Set            */
    public void setNome(String nome){
        this.nome = nome;
    }
    /************************************/
    
    //Método para adicionar um filho a lista
    public void addFilho(Pessoa filho){
        listaFilhos[qtdFilhos] = filho;
        qtdFilhos ++;
        
    }
    
    /*Método que deve retornar uma string com todos os filhos concatenados 
    e separados por ", " */
    public String retornaListaFilhos(){
        String filhos = " ";
        for(int i=0; i<qtdFilhos; i++){
            filhos = filhos+listaFilhos[i].getNome();
            if (i<qtdFilhos-1)filhos+= ", ";
            else filhos += ".";
            
            
        }
        return filhos;  
    }
}
