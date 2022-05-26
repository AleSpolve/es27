/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es27;

import java.util.Comparator;

/**
 *
 * @author ALESSIO
 */
public class ListaOpere {
    
    private Nodo testa;
    private Nodo coda;

    public ListaOpere() {
        this.testa =null ;
        this.coda = null;
    }

    public Nodo getCoda() {
        return coda;
    }

    public void setCoda(Nodo coda) {
        this.coda = coda;
    }

    public Nodo getTesta() {
        return testa;
    }

    public void setTesta(Nodo testa) {
        this.testa = testa;
    }
    

    //INSERIMENTO
    public boolean addNodoCoda(Opera o){ //IN CODA

            Nodo corrente;
            Nodo successivo;
            Nodo c = new Nodo(o);
            
            if(testa == null){    
                testa = c;
                coda = c;
                return true;
            }

            corrente = testa; 
            successivo = testa.getNext(); 

            coda.setNext(c);
            coda = c;

            return true;

    }
    
    public boolean addNodoTesta(Opera o){
        
        Nodo c=new Nodo(o);
        
        if(testa==null){
            testa=c;
            coda=c;
            return true;
        }
        
        c.setNext(testa);
        testa=c;
        
        return true;
        
        
    }

    //RICERCA
    public int researchNodo(String cognome){ 

        Nodo corrente=testa;
        
        while(corrente!=null){
            
            if(corrente.getOp().getCognomeArtista().equals(cognome)){
                
                System.out.println("trovato");
                
                return 1;
            }
            
            corrente=corrente.getNext();
        }
        System.out.println("non trovato");
        return 0;
    }

    //RIMOZIONE
    public boolean remove(String cognome){

            Nodo corrente;
            Nodo successivo;

            if(testa == null){
                return false;
            }
            corrente=testa;
            successivo=testa.getNext();
            
            if(testa.getOp().getCognomeArtista().equals(cognome)){
                    testa=testa.getNext();
                    return true;
            }
                
            while(successivo != null){

                if(successivo.getNext()==null){
                        
                        if(successivo.getOp().getCognomeArtista().equals(cognome)){
                                
                            coda=corrente;
                            coda.setNext(null);
                            return true;
                        }
                        
                }
                    if(successivo.getOp().getCognomeArtista().equals(cognome)){
                            corrente.setNext(successivo.getNext());
                            
                            return true;
                    }
                                        
                    corrente=corrente.getNext();
                    successivo=successivo.getNext();
            }
            return false;
    }

    //INSERIMENTO ORDINATO
    public boolean aggiungiNodoOrdinato(Opera o){
            Nodo corrente;
            Nodo successivo;
            Nodo c=new Nodo(o);
            
            if(testa == null){
                testa = c;
                coda = c;
                return true;
            }
            corrente = testa;
            successivo = testa.getNext();
            
            if(corrente.getOp().getCognomeArtista().compareTo(c.getOp().getCognomeArtista()) > 0){
                c.setNext(testa);
                testa = c;
                return true;
            }
            
            while( successivo != null){

               if(successivo.getOp().getCognomeArtista().compareTo(c.getOp().getCognomeArtista()) > 0){
                    corrente.setNext(c);
                    c.setNext(successivo);
                    
                    return true;
                }
               corrente = successivo;
               successivo = successivo.getNext();
            }
            coda.setNext(c);
            coda = c;
            return true;
    }
    
    
    public void stampa(){
        Nodo corrente;

        System.out.println(" -  CONTENUTO DELLA LISTA  -");

        corrente = testa;

            while(corrente != null){
                System.out.println(corrente.getOp().getCognomeArtista());
                corrente = corrente.getNext();
            }
    }

    

    
}
