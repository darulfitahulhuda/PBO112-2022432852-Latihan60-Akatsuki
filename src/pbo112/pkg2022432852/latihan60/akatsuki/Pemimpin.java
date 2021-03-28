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
public class Pemimpin extends Akatsuki{
    protected String ketua;

    public Pemimpin(String nama, String desa, String cincin) {
        super(nama, desa, cincin);
        this.nama = nama;
        this.desa = desa;
        this.cincin = cincin;
    }
    
    public String getPemimpin() {
        return ketua;
    }

    public void setPemimpin (String ketua) {
        this.ketua = ketua;
    }
    
}
