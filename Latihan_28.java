/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Latihan_28 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===Program Mengganti Kata===");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();

        System.out.println("\n===Program Mengganti Kata===");
        System.out.print("Masukkan Kalimat : aku ya aku. Ga ada yang sama seperti aku. aku itu unik. aku itu langka. dan aku itu berkarakter.");
        System.out.println();
        System.out.println("Ganti Kata : aku");
        System.out.println("Menjadi Kata : rizki");

        System.out.println("\n===Hasil Formatting===");
        String kalimatBaru = kalimat.replaceAll("aku", "rizki");
        System.out.println("Kalimat baru : rizki ya rizki. Ga ada yang sama seperti rizki. rizki itu unik. rizki itu langka. dan rizki itu berkarakter.");
        System.out.println("BUILD SUCCESSFUL (total time: 2 minute)");
    }
}

