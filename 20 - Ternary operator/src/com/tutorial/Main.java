package com.tutorial;
import java.util.Scanner;

public  class Main{
    public static  void main(String[] args){
        // Ternary Operator
        // adalah sebuah pengkondisian yang hanya menampung 1 ekspresi dan menghasilkan 2 statement
        // statement pertama adalah ketika ekspresi bernilai true dan statement kedua adalah ketika ekspresi bernilai false
        int x, input;

        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan angka: ");
        input = scanner.nextInt();
        // ekspresi         // statement true // statement false
        x = (input == 10) ? (input * input) : (input / 2); // pada kasus ini, jika nilai input = 10 maka statement true dijalankan, dan jika false statement kedua dijalankan
        System.out.println("angka = " + x);
    }
}