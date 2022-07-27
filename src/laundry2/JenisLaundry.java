/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry2;

/**
 *
 * @author ASUS
 */

    import java.util.ArrayList;

public class JenisLaundry {

    String namaToko="Laundry MAUSHILY ";
    String slogan=" Maushily4u ";
    
    
 private ArrayList<String> jenisLaundry = new ArrayList<String>();
 private ArrayList<Integer> harga = new ArrayList<Integer>();
 private ArrayList<Integer> durasi = new ArrayList<Integer>();

 public JenisLaundry() {
 this.jenisLaundry.add("Cuci baju");
 this.harga.add(10000);
 this.durasi.add(20);
   
 this.jenisLaundry.add("Cuci sepatu");
 this.harga.add(15000);
 this.durasi.add(30);
   
 this.jenisLaundry.add("Cuci tas");
 this.harga.add(20000);
 this.durasi.add(30);
 }
  
 public int getJmlLaundry(){
 return this.jenisLaundry.size();
 }
 public void setNamaLaundry(String namaBarang ){
 this.jenisLaundry.add(namaBarang);
 }
 public String getNamaLaundry(int idLaundry){
 return this.jenisLaundry.get(idLaundry);
 }

 public void setHarga(int harga ){
 this.harga.add(harga);
 }
 public int getHarga(int idLaundry){
 return this.harga.get(idLaundry);
 }
 public void editHarga(int idLaundry ,int harga){
 this.harga.set(idLaundry, harga);
 }
 public void setDurasi(int Durasi ){
 this.durasi.add(Durasi);
 }
 public int getDurasi(int idLaundry){
 return this.durasi.get(idLaundry);
 }
}

