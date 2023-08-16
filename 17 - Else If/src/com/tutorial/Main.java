package com.tutorial;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        // else if
        // adalah pengkondisian yang umum digunakan jika dimana objek yang dikondisikan tersebut berhubungan dengan kondisi sebelumnya
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.print("masukkan angka 1 - 10: ");
        angka = input.nextInt();

        if (angka % 2 == 0 && angka >= 1 && angka <= 10) {
            System.out.println("adalah angka genap");
        } else if (angka % 2 != 0 && angka >= 1 && angka <= 10) { // catatan: jika terdapat kondisi yang sama maka pengkondisian yang akan di eksekusi hanyalah kondisi pertama yang bernilai true lalu keluar dari lingkup if dan tidak mengeksekusi if statement berikutnya
            System.out.println("adalah angka ganjil");
        } else {
            System.out.println("angka yang anda masukkan kurang atau melebihi range yang ditentukan");
        }

        // catatan dalam pengkondisian
        // ada baiknya jika ingin menggunakan if dan mengharapkan satu output yang berbeda dari pengkondisian
        // gunakanlah if else
        // karena jika menggunakan if dan if lainya kemungkinan besar akan ada 2 output yang muncul
        // penggunaan tersebut tentunya bergantung pada program yang dibutuhkan
    }
}
