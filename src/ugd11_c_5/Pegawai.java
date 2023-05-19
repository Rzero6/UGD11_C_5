/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ugd11_c_5;

import java.text.ParseException;

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
public abstract class Pegawai {
    protected String nama;
    protected String nomorIdentitas;
    protected String tanggalAwal;
    protected String tanggalAkhir;

    public Pegawai(String nama, String nomorIdentitas, String tanggalAwal, String tanggalAkhir) {
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
        this.tanggalAwal = tanggalAwal;
        this.tanggalAkhir = tanggalAkhir;
    }
    
    public abstract void showPegawai();
    public abstract void cekBonus()throws ParseException;
    public abstract double cekDurasi()throws ParseException;
}
