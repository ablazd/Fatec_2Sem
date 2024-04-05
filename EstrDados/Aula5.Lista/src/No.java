
public class No {

    private Object info;
    private No proximoNo;

    public No(Object info, No proximoNo) {
        this.info=info;
        this.proximoNo=proximoNo;
    }
    
    //metodo get
    public Object getInfo() {
        return info;
    }

    public No getProximoNo() {
        return proximoNo;
    }
    
    //metodo set
    public void setInfo(Object info) {
        this.info = info;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

}
