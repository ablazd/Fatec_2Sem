/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alunos
 */
public class NoDuplo {
    
    private Object info;
    private No proximoNo;
    private No anteriorNo;

    public NoDuplo(Object info, No proximoNo, No anteriorNo) {
        this.info=info;
        this.proximoNo=proximoNo;
        this.anteriorNo = anteriorNo;
    }
    
    //metodo get
    public Object getInfo() {
        return info;
    }

    public No getProximoNo() {
        return proximoNo;
    }
    
    public No getAnteriorNo(){
        return anteriorNo;
    }
    
    //metodo set
    public void setInfo(Object info) {
        this.info = info;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public void setAnteriorNo(No anteriorNo) {
        this.anteriorNo = anteriorNo;
    }

    void setProximo(NoDuplo novoNo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setAnterior(NoDuplo novoNo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getAnterior() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
