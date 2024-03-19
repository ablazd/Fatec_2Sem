
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
    private Pessoa[] listaIrmaos = new Pessoa[10];
    private int qtdIrmaos = 0;
    /************************************/
    
    

    /**
     *
     * @param nome
     */
    
    //Métodos da classe
    
    //Construtores da classe
    
    public Pessoa(String nome){
        this.nome = nome;
        
    }   
    
    public Pessoa(String nome, Pessoa mae){
        //this.nome = nome;
        this(nome);
        this.mae = mae;
        mae.addFilho(this);
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
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
    
    
    /************************************/
    
    //Método para adicionar um filho a lista
    public void addFilho(Pessoa filho){
    /*Verificar se na lista de filhos tem o objeto antes de adicioná-lo*/
        boolean encontrei = false;
        for(int i=0; i< qtdFilhos; i++){
            // equals compara objetos inteiros
           if(filho.equals(listaFilhos[i])){ 
               encontrei=true;
           }
           if(encontrei==false){
               listaFilhos[qtdFilhos] = filho;
               qtdFilhos ++;
           }
        }
        
        
    }
    
    public void addImaos(Pessoa irmao){
        listaFilhos[qtdIrmaos] = irmao;
        qtdIrmaos ++;
        this.mae.addFilho(irmao);
        
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
    
    //Método arvore genealogica, retorna a mãe
    public String ArvoreGenealogica(){
        if (mae == null) return this.nome;
        else return mae.ArvoreGenealogica()+"->"+ this.nome;
    }
    
}
