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
import java.util.Scanner;

public class Transaksi {

 private ArrayList<Integer> idClient = new ArrayList<Integer>();
 private ArrayList<Integer> IdLaundry = new ArrayList<Integer>();
 private ArrayList<Integer> banyak = new ArrayList<Integer>();

 public Transaksi() {
 this.banyak.add(0);
 this.idClient.add(0);
 this.IdLaundry.add(2);
   
 this.banyak.add(0); 
 this.idClient.add(1);
 this.IdLaundry.add(3);
   
 this.banyak.add(1);
 this.idClient.add(0);
 this.IdLaundry.add(1);
   
 this.banyak.add(1);
 this.idClient.add(2);
 this.IdLaundry.add(2);
 }
  
 public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry jenislaundry){
 Scanner myObj = new Scanner(System.in);
 System.out.println("Silahkan belanja");
 System.out.print("Masukkan ID Client: ");
 int idClient = myObj.nextInt();
 System.out.println("Selamat datang "+ client.getNama(idClient));
 ArrayList<Integer> idLaundry = new ArrayList<Integer>();
 ArrayList<Integer> banyak = new ArrayList<Integer>();
 int i=0;
 int temp=0;
 do{
 System.out.print("Masukkan kode barang :");
 temp=myObj.nextInt();
 if (temp!=99){
 idLaundry.add(temp);
 System.out.print(jenislaundry.getNamaLaundry(idLaundry.get(i))+ " sebanyak : " );
 banyak.add(myObj.nextInt()); 
 
 i++;
 }
 }while (temp!=99);
//========================================================================================//
 System.out.println("Transaksi belanja "+client.getNama(idClient)+" sebagai berikut");
 System.out.println("Nama Barang \tQty \tHarga \tJumlah \t");

 int total=0;
 int x = idLaundry.size();
 for (int j = 0; j < x; j++){
 int jumlah=banyak.get(j) * jenislaundry.getHarga(idLaundry.get(j));
 total+=jumlah;
 System.out.println(jenislaundry.getNamaLaundry(idLaundry.get(j))+"\t"+banyak.get(j)+"\t"+jenislaundry.getHarga(idLaundry.get(j))+"\t"+jumlah);
 transaksi.setTransaksi(jenislaundry, idClient, idLaundry.get(j),banyak.get(j));
 }

 System.out.println("Total Belanja : "+total);
 client.editSaldo(idClient, client.getSaldo(idClient)-total);
 }
 public void setTransaksi(JenisLaundry jenislaundry, int idLaundry, int idClient, int banyaknya){
 this.idClient.add(idClient);
 this.idClient.add(idClient);
 this.banyak.add(banyaknya);
 jenislaundry.editHarga(idClient, jenislaundry.getHarga(idLaundry));
 }
 public int getIdJenisLaundry(int id){
 return this.IdLaundry.get(id);
 }
 public int getBanyaknya(int id){ 
 return this.banyak.get(id);
 }
 public int getIdMember(int id){
 return this.idClient.get(id);
 }
 public int getJmlTransaksi(){
 return this.idClient.size();
 }
}

