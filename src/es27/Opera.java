/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es27;

/**
 *
 * @author ALESSIO
 */
public abstract class Opera {
    
    private String titolo;
    private String cognomeArtista;
    private double quotazione;

    public Opera(String titolo,String cognomeArtista,double quotazione){
        this.titolo=titolo;
        this.cognomeArtista=cognomeArtista;
        this.quotazione=quotazione;
    }
    
    public String stampaInfo(){
        
        return "il titolo è:" +titolo +"l'artista è:" +cognomeArtista +"la quotazione è:"+quotazione;
    }
    
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    
    public String getCognomeArtista() {
        return cognomeArtista;
    }

    public void setCognomeArtista(String cognomeArtista) {
        this.cognomeArtista = cognomeArtista;
    }

    public double getQuotazione() {
        return quotazione;
    }

    public void setQuotazione(double quotazione) {
        this.quotazione = quotazione;
    }
    
    public abstract double ingombro();

    

    
    
    
}
