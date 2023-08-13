package com.tutorial;

public class Main {
    public  static  void main(String[] args){
        // Perbedaan print, println, dan printf
        // println()
        System.out.println("ini adalah baris ke 1");
        System.out.println("ini adalah baris ke 2");

        // print()
        System.out.print("ini adalah baris ke 3");
        // Teks literal "\"
        // "\n" newline
        System.out.print("ini adalah baris ke 4 \n");
        System.out.print("ini adalah baris ke 5" + "\n" + "\n");

        System.out.println("nama: Hadzik Mochammad Sofyan \nusia: 19 tahun\nalamat: Karangsari" + "\n");
        System.out.print("nama: Fiko Abdigusti" + "\n" + "usia: 20 tahun" + "\n" + "alamat: Rancabelut \n\n");

        // printf()
        System.out.printf("Mustang %dZH adalah salah satu produk mobil eropa \n", 500);
        System.out.printf("%d. Ketuhanan Yang Maha Esa \n", 1);

    }
}
