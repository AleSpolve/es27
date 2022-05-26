/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es27;

/**
 *
 * @author ALESSIO
 */
public class Quadro extends Opera{
    
    private double altezza;
    private double base;

    public Quadro(double altezza, double base, String titolo, String artista, double quotazione) {
        super(titolo, artista, quotazione);
        this.altezza = altezza;
        this.base = base;
    }
    
    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double ingombro(){
        
        return base*altezza;
    }
    
}
