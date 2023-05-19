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
public class Kantor extends Bangunan {
    private String namaKepalaKantor;
    private String pendidikanAkhirKepalaKantor;

    public Kantor(String namaKepalaKantor, String pendidikanAkhirKepalaKantor, String namaBangunan) {
        super(namaBangunan);
        this.namaKepalaKantor = namaKepalaKantor;
        this.pendidikanAkhirKepalaKantor = pendidikanAkhirKepalaKantor;
    }
    
    public void showBangunan(){
        System.out.println("Nama Kantor : "+namaBangunan);
        System.out.println("Nama Kepala Kantor : "+namaKepalaKantor);
        System.out.println("Pendidikan Akhir Kepala Kantor : "+pendidikanAkhirKepalaKantor);
    }
}
