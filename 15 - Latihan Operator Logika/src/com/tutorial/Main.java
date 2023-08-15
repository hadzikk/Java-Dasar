package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // Membuat sebuah objek untuk menangkap input dari user
        Scanner input = new Scanner(System.in);

        // case 1
        // Membuat permainan sederhana menebak angka
        // jadi nilai yang diinputkan user harus sama dengan nilai yang sudah ditetapkan untuk benar

        int nilaiBenar = 6; // menetapkan nilai yang harus ditebak
        boolean statusTebakan; // boolean untuk membandingkan nilai tebakan apakah sama dengan nilai yang benar

        System.out.print("masukkan nilai tebakan: ");
        int tebakan = input.nextInt();
        System.out.println("nilai tebakan anda: " + tebakan); // memunculkan ulang nilai tebakan

        // Operasi logika
        statusTebakan = (tebakan == nilaiBenar); // membandingkan nilai yang diinputkan user dengan nilai yang ditetapkan
        System.out.println("tebakan anda: " + statusTebakan + "\n"); // output, jika benar true, jika salah false

        // case 2
        // membuat program agar user memasukkan satu nilai dengan syarat:
        // masukkan sebuah nilai antara 4 dan 9
        int nilaiTebakan;
        System.out.print("masukkan sebuah nilai antara 4 dan 9: ");
        nilaiTebakan = input.nextInt();

        // Operasi aljabar boolean (AND / OR)
        // yang membandingkan dua operator boolean
        //                      1                   2
        statusTebakan = (nilaiTebakan > 3) && (nilaiTebakan < 9);
        System.out.println("tebakan anda: " + statusTebakan);

        // perlu diingat bahwa pada operator boolean AND
        /*
            a | b | c
            1   0   0
            0   1   0
            0   0   0
            1   1   1
        */


    }
}
