package com.tutorial;

// untuk dapat menjalankan scanner maka kita harus memanggil class tersebut terlebih dahulu
// yang terdapat pada folder / package berikut:
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Scanner
        // adalah sebuah class yang terdapat di foler util yang digunakan untuk menampung attachment dari user

        // deklarasi scanner
        Scanner input = new Scanner(System.in);

        // menghitung luas persegi
        System.out.print("masukan panjang: ");
        int panjang = input.nextInt(); // mengasign variabel dengan scanner yang bertipe data int menggunakan method nextInt();
                                      // maka int panjang; akan diisi oleh input dari user dan isi yang diinputkan oleh user harus bertipe data int pada case ini
        System.out.print("masukan lebar: ");
        int lebar = input.nextInt();
        System.out.println("panjang = " + panjang);
        System.out.println("lebar = " + lebar);
        int luas = panjang * lebar;
        System.out.println("luas = " + luas);

    }
}
