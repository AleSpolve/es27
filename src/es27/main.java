/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es27;

/**
 *
 * @author ALESSIO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      ListaOpere l=new ListaOpere();
     
      l.aggiungiNodoOrdinato(new Scultura(0, 0, 0, "d", "ciao", 0));
      l.aggiungiNodoOrdinato(new Scultura(0, 0, 0, "c", "allo", 0));
      l.aggiungiNodoOrdinato(new Scultura(0, 0, 0, "b", "ballo", 0));
      l.aggiungiNodoOrdinato(new Scultura(0, 0, 0, "a", "dallo", 0));
      l.aggiungiNodoOrdinato(new Scultura(0, 0, 0, "f", "abete", 0));
      
      
      l.researchNodo("abete");
      
      
//      l.aggiungiNodoOrdinato(new Scultura(0, 0, 0, "", "Scultura", 0));
//      l.aggiungiNodoOrdinato(new Quadro(0, 0, "", "Quadro", 0));
//      l.aggiungiNodoOrdinato(new Scultura(0, 0, 0, "", "Sculturaaa", 0));
//      l.aggiungiNodoOrdinato(new Quadro(0, 0, "", "Quadrooo", 0));
//      
//      l.aggiungiNodoOrdinato(new Scultura(0, 0, 0, "", "ziao", 0));
      
     

        
        
        
    
     
     
    }
}
