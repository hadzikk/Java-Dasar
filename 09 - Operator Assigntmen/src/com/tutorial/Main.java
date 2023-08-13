package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Operator assigntment (operator penugasan)

        int angka = 10; // task: hasilkan output 15 dengan menjumlahkan nilai a
        angka = angka + 5;
        System.out.println("nilai dari angka = " + angka); // output: 15

        // Operator assigntment penjumlahan '+='
        int a = 5;
        a += 10;
        System.out.println("nilai a = " + a);

        // Operator assigntment pengurangan '-='
        int b = 100;
        b -= 25;
        System.out.println("nilai b = " + b);

        // Operator assigntment perkalian '*='
        int c = 8;
        c *= 7;
        System.out.println("nilai c = " + c);

        // Operator assigntment pembagian '/='
        int d = 100;
        d /= 25;
        System.out.println("nilai d = " + d);

        // Operator assigntment modulus '%='
        int e = 10;
        e %= 4;
        System.out.println("nilai e = " + e);
    }
}
