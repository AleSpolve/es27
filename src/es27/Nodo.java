/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es27;

/**
 *
 * @author ALESSIO
 */
public class Nodo {
    
    private Opera op;
    private Nodo next;
    
    public Nodo(Opera op){
        next=null;
        this.op=op;
    }

    public Opera getOp() {
        return op;
    }

    public void setOp(Opera op) {
        this.op = op;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
    
}
