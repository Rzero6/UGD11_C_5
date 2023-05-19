/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ugd11_c_5;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.ArrayList;
/**
  
 *
 * @author VICTUS
    Reynold Kunarto             210711015   C
    Febiola Ika Putri Wibowo    210711023   C
 */
public class UGD11_C_5 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner scan = new Scanner (System.in);
        // TODO code application logic here
        Bangunan b = new Bangunan("Bank Rakyat","Demangan 10","Kantor Rakyat","Rudy","S1");
        AccountOfficer P1 = new AccountOfficer("Siti","01012023","01/01/2023","25/01/2023",10,"Jogja");
        b.addPegawai(P1);

        Teller P2 = new Teller("Hadi","02022023","01/01/2023","10/02/2023",1000,1000);
        b.addPegawai(P2);

        CustomerService P3 = new CustomerService("Oline","03032023","01/01/2023","01/02/2023","Mobil",5);
        b.addPegawai(P3);

        b.showBank();
        b.showKantor();
    }

}
