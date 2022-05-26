/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es27;

/**
 *
 * @author ALESSIO
 */
public class Scultura extends Opera{
    
    private double base;
    private double altezza;
    private double profondità;

    public Scultura(double base, double altezza, double profondità, String titolo, String artista, double quotazione) {
        super(titolo, artista, quotazione);
        this.base = base;
        this.altezza = altezza;
        this.profondità = profondità;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getProfondità() {
        return profondità;
    }

    public void setProfondità(double profondità) {
        this.profondità = profondità;
    }
    
    @Override
    public double ingombro(){
        
        return base*altezza*profondità; 
    }
    
    public double superficieOccupata(){
        
        return altezza*profondità;
        
    }
    
    
    
}
