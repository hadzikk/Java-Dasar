package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // Switch Case
        // adalah suatu operator logika mirip dengan If
        // akan tetapi Switch hanya mengambil satu kondisi dan tidak membandingkan sebuah boolean
        // switch juga tidak memungkinkan perulangan
        // namun switch cocok untuk membuat satu input yang menghasilkan lebih dari 2 output
        // switch akan mengeksekusi suatu nilai yang memenuhi kondisinya walaupun di tambah partikel kata di dalamnya (dalam kasus String)
        Scanner inputUser = new Scanner(System.in);

        String input;
        System.out.print("masukkan nama: ");
        input = inputUser.next();
        switch (input){ // mengambil acuan untuk dikondisikan
            case "hadzik": // menyocokan isi, perlu diingat pada String jika terdapat kata kondisi dan walaupun kata tersebut memiliki partikel, jika cocok maka akan di jalankan
                System.out.println("hadzik terdapat di dalam data"); // output
                break; // digunakan break artinya mengeluarkan switch case dari scope  flow task nya
            case "fiko":
                System.out.println("fiko terdapat di dalam data");
                // tanpa break maka kondisi selanjutnya akan lanjut di running
                default:
                    System.out.println("nama tersebut tidak ada di dalam data");
        }
    }
}
