package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Memahami alur operasi aritmatika di Java
        int hasil;

        // case 1
        hasil = 10 * 5 + 2;
        System.out.println("1. hasil = " + hasil); // output: 50

        // case 2
        hasil = 5 + 2 * 10; // output yang diharapkan adalah 70, karena 5 + 2 = 7 lalu 7 x 10 = 10
        System.out.println("2. hasil = " + hasil); // output: 25
        /* mengapa terjadi demikian?
           karena di dalam operator aritmatika operator yang dijalankan pertama kali adalah perkalian dan pembagian
        */

        // case 3
        // lalu bagaimana jika kita ingin menghasilkan 5 + 2 * 10 = 70?
        // maka dari itu kita dapat mrnggunakan pengelompokan dengan menggunakan tanda ()
        // bilangan yang ada di tanda kurung akan dikerjakan terlebih dahulu di dalamnya baru setelah selesai di kalkulasi barulah di operaikan dengan bilangan seterusnya
        hasil = (5 + 2) * 10;
        System.out.println("3. hasil = " + hasil); // output: 70
    }
}
