/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilangan;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Penilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String nama, pelanggaran;
        
        //membuat judul
        System.out.println("BUKTI PELANGGARAN");
      
        //membuat pilihan
        System.out.println("Pilihlah sesuai tipe pelanggaran anda");
        System.out.println("1. Tidak memakai Masker");
        System.out.println("2. Tidak membawa SIM");
        System.out.println("3. Tidak membawa STNK");
        System.out.println("Pilihan anda");
        int pilihan = sc.nextInt();
        
        //membuat pilihan
        switch(pilihan){
            case 1 : System.out.println("Yang harus dilakukan jika Tidak memakai masker");
                System.out.println("Jika umur anda dibawah 17 tahun, maka bayarlah denda sebesar 50.000");
                System.out.println("Jika umur anda diatas 17 tahun, bayarlah denda sebesar 100.000");
            break;
            case 2 : System.out.println("Yang harus dilakukan jika tidak membawa SIM");
                System.out.println("Jika umur anda dibawah 17 tahun, maka bayarlah denda sebesar 200.000");
                System.out.println("Jika umur anda diatas 17 tahun, bayarlah denda sebesar 450.000");
            break;
            case 3 : System.out.println("Yang harus dilakukan jika tidak membawa STNK");
                System.out.println("Jika umur anda dibawah 17 tahun, maka bayarlah denda sebesar 250.000");
                System.out.println("Jika umur anda diatas 17 tahun, bayarlah denda sebesar 500.000");
            break;
            
            default: System.out.println("Anda salah memasukkan kode");
            break;
            
            
           
            
            
            
            
                    
            }
        
        
        
        }
       
        
    }
