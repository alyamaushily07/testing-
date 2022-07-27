/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry2; 

/**
 *
 * @author ASUS
 */

    public class Hasil  {
      
    public static void main(String[] args) {
       
        Client c = new Client ();
        Petugas p = new Petugas();
        JenisLaundry j = new JenisLaundry();
        Transaksi t = new Transaksi();
        Laporan l = new Laporan();
        l.NamaToko();
        l.laporan(j);
        l.laporan(c);
        t.prosesTransaksi(c, t, j);
        
        l.laporan(c);
       
    
}
    }

  