
public class No {
    
    private Object info;
    private No proximoNo;
    
    //metodo construtor
    public No(Object info, No proximoNo) {
        this.info = info;
        this.proximoNo = proximoNo;
    }
    
    // Método get
    public Object getInfo() {
        return info;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    // Método set
    public void setInfo(Object info) {
        this.info = info;
    }
    
    public void setProximoNo(No proximoNo){
        this.proximoNo = proximoNo;
    }
    
}
