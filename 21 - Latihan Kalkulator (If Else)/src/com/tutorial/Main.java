package com.tutorial;
import java.util.*;

public class Main {
    public  static void main(String[] args){
        // Membuat kalkulator sederhana
        Scanner input; // deklarasi variabel dari object Scanner
        float a,b,hasil; // variabel
        char operator; // variabel untuk menampung operator (+,-,*,/)

        input = new Scanner(System.in);

        System.out.print("nilai a= ");
        a = input.nextFloat();
        System.out.print("operator= ");
        operator = input.next().charAt(0);
        System.out.print("nilai b= ");
        b = input.nextFloat();

        System.out.println(a + " " + operator + " "+ b + " = ");

        // logika yang mengeksekusi nilai character dari operator
        if (operator == '+'){
            // penjumlahan
            hasil = a + b;
            System.out.println(hasil);
        } else if (operator == '-'){
            // pengurangan
            hasil = a - b;
            System.out.println(hasil);
        } else if (operator == '*'){
            // perkalian
            hasil = a * b;
            System.out.println(hasil);
        } else if (operator == '/'){
            // pembagian
            hasil = a / b;

            if (b == 0){
                System.out.println("pembagian dengan '0' akan menghasilkan nilai tak terhingga");
            } else {
                System.out.println(hasil);
            }
        } else {
            // operator tidak ditemukan
            System.out.println("kalkulator gagal dijalankan karena operator " + "'" + operator + "'" + " tidak ditemukan");
            System.out.println("cobalah masukkan operator yang tersedia berikut (+|-|*|/)");
        }


    }
}
