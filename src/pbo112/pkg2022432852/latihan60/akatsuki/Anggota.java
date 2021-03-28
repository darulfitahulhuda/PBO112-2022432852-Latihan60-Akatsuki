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
public class Anggota extends Akatsuki{
    protected String posisi;

    public Anggota(String nama, String desa, String cincin) {
        super(nama, desa, cincin);
        this.nama = nama;
        this.desa = desa;
        this.cincin = cincin;
    }
    public String getAnggota() {
        return posisi;
    }

    public void setAnggota (String posisi) {
        this.posisi = posisi;
    }
    
}
