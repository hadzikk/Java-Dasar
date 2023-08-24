package com.tutorial;

public class Main {
    public static void main(String[] args){
        // For Loop
        // adalah sebuah pengulangan eksplisit yang dimana terdapat beberapa syarat yang harus secara spesifik di tentukan untuk melakukan perulangan

        // Syarat for loop
        // inisialisasi, kondisi, increment / decrement


        System.out.println("program start");
        // Increment for loop '++'
        // adalah pengulangan yang secara sistematis terurut dari nilai kecil ke terbesar
        for (int i = 1; i <= 10; i++){
            System.out.println("looping ke-" + i);
        }
        System.out.println("program end" + "\n");

        System.out.println("program start");
        // Decrement for loop '--'
        // adalah pengulangan yang secara sistematis terurut dari nilai besar ke terkecil
        for (int j = 10; j >= 1; j--){
            System.out.println("looping ke-" + j);
        }
        System.out.println("program end");


        // kita juga dapat menuliskan format struktur penulisan for seperti ini, akan tetapi tidak disarankan karena secara standar setiap fungsi memiliki kontruksinya masing masing
        int i = 1;
        for (; i <= 10 ;){
            System.out.println("hello world ke-" + i);

            i++;
        }

    }
}
