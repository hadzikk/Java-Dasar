package com.tutorial;

public class Main {
    public static void main(String[] args){
        // if statement (pengomkondisian)
        // digunakan untuk menentukan alur pemrograman
        int a = 5;

        System.out.println("nilai = " + 5);

        // deklarasi if statement
        // kondisi akan dijalankan jika kondisi tersebut memenuhi syarat
        if (a == 5) { // di dalam kurung tersebut harus berisi boolean
            System.out.println("ini adalah alur true");
        } else {
            System.out.println("ini adalah alur false (default)"); /* else adalah tempat untuk mengatur alur default
                                                                      yang artinya jika kondisi tidak memenuhi segala syarat pada if
                                                                      maka else yang akan dijalankan */
        }
        System.out.println("selesai");

        // Membedah If Statement
        /*
          if (kondisi) {
            statemenr
          } else {
            else statement
          }

          1. pada kondisi harus berisi boolean
          2. statement adalah output atau alur apa yang kita inginkan jika kondisi tersbebut terpenuhi
          3. pada else statement, ia akan di eksekusi jika tidak ada yang memenuhi syarat kondisi semua if
         */
    }
}
