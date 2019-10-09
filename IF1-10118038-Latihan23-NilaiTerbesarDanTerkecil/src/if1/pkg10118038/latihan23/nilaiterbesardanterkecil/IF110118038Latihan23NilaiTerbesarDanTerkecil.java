/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan23.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Nilai Terbesar Dan Terkecil
 */
public class IF110118038Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas :");
        String petugas = sc.next();
        System.out.print("Masukkan banyak nilai mahasiswa :");
        int mahasiswa = sc.nextInt();
        int[] nilai = new int[mahasiswa];
        int i = 1; 
            System.out.print("Nilai Mahasiswa ke-" + i++ + " = ");
            nilai[i-2] = sc.nextInt();
        int besar = nilai[i-2];
        int kecil = nilai[i-2];
        while ( i <= mahasiswa) {
            System.out.print("Nilai Mahasiswa ke-" + i++ + " = ");
            nilai[i-2] = sc.nextInt();
            if(nilai[i-2] > besar) 
                besar = nilai[i-2];
            if(nilai[i-2] < kecil)
                kecil = nilai[i-2];
        }
        
        System.out.println("\n" + "=====Hasil Nilai Mahasiswa=====" );
        for(int l = 0; l < mahasiswa; l++)
            System.out.println("Nilai Mahasiswa Ke-" + (l+1) + " = " + nilai[l]);
        
        System.out.println("\n" +  "Nilai Terbesar adalah " + besar);
        System.out.println("Nilai Terkecil adalah " + kecil);
        
        System.out.println("\n" + "Petugas : " + petugas);
    }
    
}
