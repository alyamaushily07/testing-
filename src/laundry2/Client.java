/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry2;

import java.util.ArrayList;
import laundry2.user;

/**
 *
 * @author ASUS
 */

public class Client implements user {
    private ArrayList<String> namaClient =new ArrayList<String>();
    private ArrayList<String> alamat =new ArrayList<String>();
    private ArrayList<String> telepon =new ArrayList<String>();
    private ArrayList<Integer> saldo =new ArrayList<Integer>();
    
    public Client (){
        this.namaClient.add("Nazwa");
        this.alamat.add("Malang");
        this.telepon.add("08534339060");
        this.saldo.add(100000);
      
        this.namaClient.add("Alya");
        this.alamat.add("Sawojajar");
        this.telepon.add("081332388427");
        this.saldo.add(100000);
      
        this.namaClient.add("Mauhsily");
        this.alamat.add("Jawa");
        this.telepon.add("081230963430");
        this.saldo.add(100000);
       
        
        }
    
    public void setSaldo(int saldo){
        this.saldo.add(saldo);   
    }
    
    public int getSaldo(int idClient) {
        return this.saldo.get(idClient);
    }
    
    public void editSaldo(int idClient, int saldo){
        this.saldo.set(idClient, saldo);        
    }
    
    public int getJmlClient(){
        return this.saldo.size();
    
    }

    @Override
    public void setNama(String nama) {
        
    }

    @Override
    public void setAlamat(String alamat) {
        
    }

    @Override
    public void setTelepon(String telepon) {
        
    }

    @Override
    public String getNama(int idClient) {
        return this.namaClient.get(idClient);
    }

    @Override
    public String getTelepon(int idClient) {
        return this.telepon.get(idClient);
    }

    @Override
    public String getAlamat(int idClient) {
        return this.alamat.get(idClient);
    }
}
