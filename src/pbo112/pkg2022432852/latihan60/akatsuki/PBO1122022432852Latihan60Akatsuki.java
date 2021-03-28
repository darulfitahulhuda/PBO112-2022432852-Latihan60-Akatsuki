/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo112.pkg2022432852.latihan60.akatsuki;


/**
 *
 * @author Mini Pc
 * Nama : DaruL Fitahul Huda 
 * NIM : 2022432852 
 * Kode Kelas :FS112B (PBO112B) 
 * Deksripsi Program : Menampilkan Karakter Akatsuki Menggunakan Konsep OOP inheritance dan polymorphism

 */
public class PBO1122022432852Latihan60Akatsuki {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("===Akatsuki===");
      
      Pemimpin p = new Pemimpin("Pain","Amegakure","Rei");
      p.setPemimpin("Pemimpin");
      p.displayAkatsuki();
      System.out.println("Posisi : " + p.getPemimpin());
      
      System.out.println("");
      
      Anggota a1 = new Anggota("Deidara","Iwagakure","Seiryu");
      a1.setAnggota("anggota");
      a1.displayAkatsuki();
      System.out.println("Posisi : " + a1.getAnggota());
        
      System.out.println("");
      
      Anggota a2 = new Anggota("Konan","Amegakure","Byakko");
      a2.setAnggota("anggota");
      a2.displayAkatsuki();
      System.out.println("Posisi : " + a2.getAnggota());
        
    }
    
}
