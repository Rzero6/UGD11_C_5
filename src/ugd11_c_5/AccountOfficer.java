/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ugd11_c_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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
public class AccountOfficer extends Pegawai implements IMencariNasabah, IBukaRekening{
    private int jumlahNasabah;
    private String area;

    public AccountOfficer(String nama, String nomorIdentitas, String tanggalAwal, String tanggalAkhir,int jumlahNasabah, String area) {
        super(nama, nomorIdentitas, tanggalAwal, tanggalAkhir);
        this.jumlahNasabah = jumlahNasabah;
        this.area = area;
    }
    
    public void showPegawai(){
        System.out.println("\t==Data Account Officer==");
        System.out.println("Nama Petugas : "+nama);
        System.out.println("Nomor Identitas : "+nomorIdentitas);
        System.out.println("Awal Kontrak : "+tanggalAwal);
        System.out.println("Akhir Kontrak : "+tanggalAkhir);
        System.out.println("Jumlah Nasabah : "+jumlahNasabah);
        System.out.println("Area : "+area);
        System.out.println("Tugas: ");
        BukaRekening();
        MencariNasabah();
        try {
            System.out.println("Durasi Kontrak "+cekDurasi()+" hari");
            cekBonus();
        } catch (ParseException ex) {
            System.out.println("Error Durasi");;
        }
    }
    
    public void BukaRekening(){
        System.out.println("Tugas Anda Adalah Membuka Rekening Baru");
    }
    
    public void MencariNasabah(){
        System.out.println("Tugas Anda Adalah Mencari Nasabah Baru");
    }
    public void cekBonus() throws ParseException{
        if(cekDurasi()>=0){
            System.out.println("Anda mendapatkan bonus");
            System.out.println("Bonus: "+(12000.0*cekDurasi()));
        }else{
            System.out.println("Anda tidak mendapatkan bonus");
        }
    }
    
    public double cekDurasi() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date awal = sdf.parse(tanggalAwal);
        Date akhir = sdf.parse(tanggalAkhir);
        long dif = Math.abs(akhir.getTime() - awal.getTime());
        return (double) TimeUnit.DAYS.convert(dif,TimeUnit.MILLISECONDS);
    }
}
