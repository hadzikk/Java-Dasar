package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // OPERATOR UNARY

        // Operator Unary '-'
        // mengubah suatu nilai menjadi bilangan negatif
        int a = 10;
        System.out.println("nilai a = " + -a); // output: -10

        // Operator Unary '+'
        // mengubah suatu nilai menjadi bilangan positif
        int b = -10;
        System.out.println("nilai b = " + +b); // output: +10

        // Increment, Decrement
        // increment artinya menambahkan nilai, decrement artinya mengurangi nilai
        // secara default nilai increment atau decrement adalah +1 / -1

        // Increment '++'
        int c = 10;
        c++;
        System.out.println("nilai c = " + c); // output: (10 + 1) 11

        // Decrement '--'
        int d = 10;
        d--;
        System.out.println("nilai d = " + d); // output: (10 - 1) 9

        // Jenis Increment dan Decrement
        // prefix postfix

        // Perilaku pada prefix dan postfix:
        // a. ketika di luar print
        int e = 10;
        ++e; // prefix
        e++; // postfix
        System.out.println("nilai e = " + e); // output: (1 + 1) 12

        int f = 10;
        --f;
        f--;
        System.out.println("nilai f = " + f); // output: (10 - 1 -1) 8

        // b. ketika di dalam print
        int g = 10;

        // prefix
        System.out.println("nilai g = " + ++g); // output: (10)+1 11

        // postfix
        int h = 10;
        System.out.println("nilai h = " + h++); // output: (10)1+ 10

        // bang operator pada boolean '!' digunakan untuk mengubah nilai boolean ke nilai sebaliknya
        boolean aktif = true;
        System.out.println("value aktif = " + aktif);
        System.out.println("value aktif dengan operator '!' = " + !aktif);

        // Kesimpulan
        // Unary adalah operator yang hanya digunakan hanya pada 1 variabel
        // Terdapat beberapapa jenis operator unary
        /* '-' unary negatif
           '+' unary positif
           '++' increment
           '--' decrement */
        // terdapat 2 jenis increment dan decrement
        // postfix
        // variabel++ tanda increment atau decremenr dituliskan setelah nama variabel
        // pada postfix nilai akan ditambahkan pada variabel selanjutnya setelah di deklarasikan ulang
        /* contoh:
           int angka = 10;
           System.out.println(angka++); output: 10
           System.out.println(angka); output: 11
         */


        // prefix
        // ++variabel tanda increment atau decremenr dituliskan di awal variabel
        // pada prefix nilai ditambahkan sebelum, lalu output ditampilkan dengan nilai yang sudah di tambahkan
        /* contoh:
           int angka = 10;
           System.out.println(++angka); output: 11
         */
    }
}
