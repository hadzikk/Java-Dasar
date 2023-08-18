package com.tutorial;

public class Main{
    public static void main(String[] args){
        // while
        // adalah sebuah perulangan yang akan terus mengeksekusi statement yang ada di body while selama ekspresinya bernilai true
        // maka perlu diingat jika ingin menggunakan while kita perlu men set kapan program akan berhenti
       int a = 0;
       boolean kondisi = true;

       // ekspresi
       while (kondisi){
           // statement akan dijalankan jika ekspresi bernilai true
           System.out.println("hello world ke-"+a);

           // men set kapan perulangan akan berakhir, pada case ini dihentikan ketika mengulang 10x
           if (a == 10){
               kondisi = false;
           } a++;
       }
    }
}