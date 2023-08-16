package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Nested if
        // adalah suatu pengkondisian yang di mana di dalam block statement if tersebut terdapat pengkondisian kembali
        // nested if akan dijalankan ketika kondisi parent if nya berhasil dipenuhi

        int a = 10;
        int b = 5;
        boolean hasil;

        System.out.println("mulai...");

        if (a == 5){
            // Nested If
            if (b == 10){ // ini akan dijalankan ketika kondisi parent if nya bernilai true
                hasil = true;
                System.out.printf("ini adalah nested if dengan nilai %s karena a = %d dan b = %d",hasil,a,b);
            } else {
                hasil = false;
                System.out.printf("ini adalah nested if dengan hasil %s karena a = %d dan b = %d",hasil,a,b);
            }
        } else {
            System.out.println("ini adalah output default karena a != 5");
        }

        System.out.println("\nselesai");
    }
}
