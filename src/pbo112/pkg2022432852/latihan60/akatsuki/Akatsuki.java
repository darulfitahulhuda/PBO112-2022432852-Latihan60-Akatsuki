/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo112.pkg2022432852.latihan60.akatsuki;

/**
 *
 * @author Mini Pc
 */
public class Akatsuki{
    protected String nama;
    protected String desa;
    protected String cincin;
    
    public Akatsuki(String nama, String desa, String cincin) {
        this.nama = nama;
        this.desa =desa;
        this.cincin = cincin;
    }
    
    public void displayAkatsuki(){
        System.out.println("Nama : " + nama);
        System.out.println("Asal Desa : " + desa);
        System.out.println("Cincin : "+cincin);
  
    }
}
