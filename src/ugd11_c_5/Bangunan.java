/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ugd11_c_5;

/**
 * Nama : Reynold Kunarto 
 * NPM : 210711015
 * 
 * Nama : Febiola Ika Putri Wibowo
 * NPM : 210711023
 */
/**
 *
 * @author Msi Modern 14
 */

import java.util.ArrayList;

public class Bangunan {
    private String namaBank;
    private String alamatBank;
    private String namaKantor;
    private String namaKepalaKantor;
    private String pendidikanAkhirKepalaKantor;
    ArrayList<Pegawai> listpegawai = new ArrayList<Pegawai>();

    public Bangunan(String namaBank, String alamatBank, String namaKantor, String namaKepalaKantor) {
        this.namaBank = namaBank;
        this.alamatBank = alamatBank;
        this.namaKantor = namaKantor;
        this.namaKepalaKantor = namaKepalaKantor;
    }
    
    public void showBank(){
        System.out.println("Nama Bank : "+namaBank);
        System.out.println("Alammat Bank : "+alamatBank);
        
        for(int i=0; i<listpegawai.size(); i++){
            System.out.println("Petugas ke-"+(i+1));
            //show pegawai
        }
    }

    public void addPegawai(Pegawai pegawai) {
        listpegawai.add(pegawai);
    }
    
    public void showKantor(){
        System.out.println("Nama Kantor : "+namaKantor);
        System.out.println("Nama Kepala Kantor : "+namaKepalaKantor);
        System.out.println("Pendidikan Alhir Kepala Kantor : "+pendidikanAkhirKepalaKantor);
    }
    
    
}
