package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // Membuat Kalkulator sederhana menggunakan Switch Case
        Scanner input;
        float a,b,hasil;
        String operator;

        input = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = input.nextFloat();
        System.out.print("operator = ");
        operator = input.next();
        System.out.print("nilai b = ");
        b = input.nextFloat();

        // karena switch menerima ekspresi berupa String maka pada variabel operator dibuat tipe data String
        switch (operator){
            case "+":
                // penjumlahan
                hasil = (a + b);
                System.out.println(a + " " + operator + " " + b + " = " + hasil);
                break;
            case "-":
                // pengurangan
                hasil = (a - b);
                System.out.println(a + " " + operator + " " + b + " = " + hasil);
                break;
            case "*":
                // perkalian
                hasil = (a * b);
                System.out.println(a + " " + operator + " " + b + " = " + hasil);
                break;
            case "/":
                // pembagian
                hasil = (a / b);
                System.out.println(a + " " + operator + " " + b + " = " + hasil);
                break;
                default:
                    System.out.println("operator tidak ditemukan");
        }

    }
}
