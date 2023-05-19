/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ugd11_c_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

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
public class Teller extends Pegawai implements ITransaksiKeuangan {
    private int tunjangan;
    private int jumlahUangMasuk;

    public Teller(String nama, String nomorIdentitas, String tanggalAwal, String tanggalAkhir,int tunjangan, int jumlahUangMasuk) {
        super(nama, nomorIdentitas, tanggalAwal, tanggalAkhir);
        this.tunjangan = tunjangan;
        this.jumlahUangMasuk = jumlahUangMasuk;
    }
    public void showPegawai(){
        System.out.println("Nama Petugas: "+nama);
        System.out.println("Nomor Identitas: "+nomorIdentitas);
        System.out.println("Awal Kontrak: "+tanggalAwal);
        System.out.println("Akhir Kontrak: "+tanggalAkhir);
        System.out.println("Jumlah Uang Masuk: "+jumlahUangMasuk);
        System.out.println("Tunjangan: "+tunjangan);
        System.out.println("Tugas: ");
        TransaksiKeuangan();
        try {
            System.out.println("Durasi Kontrak "+cekDurasi()+" hari");
            cekBonus();
        } catch (ParseException ex) {
            System.out.println("Error Durasi");;
        }
    }
    
    public void cekBonus() throws ParseException{
        if(cekDurasi()>=0){
            System.out.println("Anda mendapatkan bonus");
            System.out.println("Bonus: "+(13000.0*cekDurasi()));
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

    @Override
    public void TransaksiKeuangan() {
        System.out.println("Tugas Anda adalah melakukan transaksi keuangan");
    }
}
