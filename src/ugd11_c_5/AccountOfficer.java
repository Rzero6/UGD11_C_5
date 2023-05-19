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
public class AccountOfficer extends Pegawai implements IMencariNasabah, IBukaRekening{
    private int jumlahNasabah;
    private String area;

    public AccountOfficer(int jumlahNasabah, String area, String nama, String nomorIdentitas, String tanggalAwal, String tanggalAkhir) {
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
        BukaRekening();
        MencariNasabah();
        
    }
    
    public void BukaRekening(){
        System.out.println("Tugas Anda Adalah Membuka Rekening Baru");
    }
    
    public void MencariNasabah(){
        System.out.println("Tugas Anda Adalah Mencari Nasabah Baru");
    }
    
}
