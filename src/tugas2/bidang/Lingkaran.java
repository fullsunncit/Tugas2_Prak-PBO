/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.bidang;

/**
 *
 * @author acer
 */
public class Lingkaran implements MenghitungBidang{

    private double jariJari;

    public Lingkaran(double jari) {
        this.jariJari = jari;
    }
    public double getJari() {
        return jariJari;
    }

    public void setJari(double jari) {
        this.jariJari = jari;
    }
    
    @Override
    public double keliling() {
        return 3.14*2*jariJari;          
    } 
    
    @Override
    public double luas() {      
        return 3.14*jariJari*jariJari;    
    }
}
