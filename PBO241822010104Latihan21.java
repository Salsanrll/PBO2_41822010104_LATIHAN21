/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010104.latihan21;
import java.util.Scanner;
/**
 *
 * @author SALSA NURUL LAELI
 * Nama : Salsa Nurul Laeli
 * NIM  : 41822010104
 */
public class PBO241822010104Latihan21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Format Tugas PBO");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukan Banyaknya Mahasiswa: ");
            int banyakMahasiswa = input.nextInt();
            int totalNilai = 0;
            
            for (int i = 1; i <= banyakMahasiswa; i++) {
                System.out.print("Nilai Mahasiswa ke-" + i + " : ");
                int nilai = input.nextInt();
                totalNilai += nilai;
            }
            double rataRata = (double) totalNilai / banyakMahasiswa;
            
            System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
            System.out.println("Developed by: Salsa Nurul Laeli");
        }
    }
    }
  
