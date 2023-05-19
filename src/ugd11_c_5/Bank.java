/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ugd11_c_5;

import java.util.ArrayList;

/**
 * Nama : Reynold Kunarto 
 * NPM : 210711015
 * 
 * Nama : Febiola Ika Putri Wibowo
 * NPM : 210711023
 */
/**
 *
 * @author VICTUS
 */
public class Bank extends Bangunan{
    private String alamatBank;

    public Bank(String namaBangunan,String alamatBank) {
        super(namaBangunan);
        this.alamatBank = alamatBank;
    }
    
    ArrayList<Pegawai> listpegawai = new ArrayList<Pegawai>();
    public void showBangunan(){
        System.out.println("Nama Bank : "+namaBangunan);
        System.out.println("Alammat Bank : "+alamatBank);
        
        for(int i=0; i<listpegawai.size(); i++){
            System.out.println("\n\nPetugas ke-"+(i+1));
            listpegawai.get(i).showPegawai();
        }
    }
    public void addPegawai(Pegawai pegawai) {
        listpegawai.add(pegawai);
    }
}
