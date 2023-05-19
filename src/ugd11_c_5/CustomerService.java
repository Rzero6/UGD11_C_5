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
public class CustomerService extends Pegawai implements IBukaRekening{
    private String fasilitas;
    private int jumlahKeluhan;

    public CustomerService(String fasilitas, int jumlahKeluhan, String nama, String nomorIdentitas, String tanggalAwal, String tanggalAkhir) {
        super(nama, nomorIdentitas, tanggalAwal, tanggalAkhir);
        this.fasilitas = fasilitas;
        this.jumlahKeluhan = jumlahKeluhan;
    }
    
    public void showPegawai(){
        System.out.println("\t==Data Customer Service==");
        System.out.println("Nama Petugas : "+nama);
        System.out.println("Nomor Identitas : "+nomorIdentitas);
        System.out.println("Awal Kontrak : "+tanggalAwal);
        System.out.println("Akhir Kontrak : "+tanggalAkhir);
        System.out.println("Fasilitas : "+fasilitas);
        System.out.println("Jumlah Keluhan : "+jumlahKeluhan);
        BukaRekening();
    }
    
    public void BukaRekening(){
        System.out.println("Tugas Anda Adalah Membuka Rekening Baru");
    }
}
