package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // konversi nilai tipe data
        /* dalam konversi nilai ada istilah:
           1. memperluas
           2. memperkecil
           3. casting
        */
        int i = 255; // nilai integer
        System.out.println("nilai i = " + i); // output: 255 dalam memori integer (32 bit)

        // 1. MEMPERLUAS
        // a. ketika kita akan memperluas rentang nilai dari bit yang lebih kecil ke bit yang lebih besar itu tidak masalah
        long l = i; // nilai long = i
        System.out.println("nilai long = " + i);  // output: 255 dalam memori integer yang diubah ke long menjadi (64 bit)

        // 2. MEMPERKECIL
        // b. namun akan bermasalah ketika kita memperkecil rentang nilai dari bit besar ke yang lebih kecil
        //    maka dari itu digunakanlah metode seperti di bawah ini, dengan mengkonversi nilai awal ke nilai kedua yang ingin diubah
        // catatan: memperkecil rentang nilai akan menghilangkan nilai asli dari tipe data tersebut
        byte b = (byte) i; // mengkonversi nilai int ke byte
                          /*  catatan: nilai max byte = 127
                                       nilai min byte = -128
                          */
        System.out.println("nilai byte = " + b); // output: -1 dari memori integer (32 bit) ke (8 bit)
        /* pembahasan: karena nilai max byte = 127
                                    min byte = -128
           maka jika (127/127)
           case: 127 + 1 = -128 maka akan kembali ke nilai min nya, karena tidak bisa lebih dari 127, dan 255 ini menjadi -1
           karena nilainya terus berulang dari MAX_VALUE nya ke MIN_VALUE nya hingga dinyatakan ke dalam bentuk byte yang sesuai
           yaitu -1
        */

        // 3. CASTING
        // casting adalah metode untuk mengubah suatu tipe data dengan menuliskan (tipe data) sebelum nilai yang ingin di ubah
        /* contoh:
           int nilaiInteger = 10;
           int nilaiByte = (byte) nilaiInteger;
        */

        // casting pembagian
        int p = 10;
        int q = 4;
        int r = p / q; // 10 : 4 = 2.5 (dalam bentuk desimal)
                      //  sedangkan dalam penggunaan tipe data integer ini maka nilai yang muncul adalah 2
                      //  karena integer itu sendiri adalah bilangan bulat, maka nilai yang dihasilkan adalah bilangan bulat
        System.out.printf("%d : %d = %d \n",p,q,r); // output: 2

        // casting
        // maka dari contoh kasus di atas penyelesaianya adalah seperti berikut
        // catatan: nilai yang diinginkan adalah desimal 0.5 dari pembagian 10 : 4

        // penyelesaian:
        // 1. cara pertama
        float s = 10;
        int t = 4;
        float u = s / t;
        System.out.printf("%f : %d = %f \n",s,t,u); // output: 2.5
        // cara diatas adalah dengan mengubah dua tipe datanya menjadi float

        // 2. cara kedua
        int v = 10;
        int w = 4;
        float x = (float) v / w; // menggunakan metode casting, hingga tidak harus mendeklarasikan tipe data float sebanyak 2x
        System.out.printf("%d : %d = %f",v,w,x);
        // pada printf(print format)
        // %d untuk bilangan biasa (bulat)
        // %f untuk float

        // bagaimana caranya bekerja?
        /* ketika di deklarasikan int a = 10;
                                  int b = 4;
                                  int c = 10 / 4;
                                  maka yang terjadi adalah 10 / 4 = 2

                                  sedangkan ketika
                                  float a = 10; == 10.000000
                                  int b = 4;
                                  float c = a / b;
                                  maka yang terjadi adalah 2 hal
                                  1. float a = 10; <<<<<<< float pertama ini di eksekusi
                                     int b = 4; <<<<<<<< int baris ini di eksekusi, dibagi dan dikonversi dengan float
                                     float c = a / b;
                                                     maka akan menghasilkan 10.000000 / 4 = 2.000000
                                                     pada mulanya nilai tersebut masih mengacu pada hasil integer yang dimana 10 / 4 = 2
                                                     hanya saja dalam format desimal yaitu 2.000000 berkat deklarasi tipe data float pertama
                                  lalu:
                                  2. float a = 10;
                                     int b = 4;
                                     float c = a / b;  <<<<<<<< float kedua ini di eksekusi
                                                       maka akan menghasilkan 10.000000 / 4 = 2.500000
                                                       karena pada eksekusi sebelumnya 10.000000 / 4 = 2.000000
                                                       yang tadinya hanya mengkonversi format desimalnya saja
                                                       kini dikonversi juga hasil pembagian dengan nilai desimalnya
                                                       2.000000 ini akan di konversi lagi oleh float yang tadinya hanya format nya saja tetapi pembagianya dengan cara integer
                                                       diubah yang tadi format pembagianya menggunakan cara integer (bilangan bulat / pembulatan) menjadi pembagian dengan cara float (desimal)
                                                       2.000000 to 2.500000

             prinsip hal tersebutlah yang digunakan pada cara casting
             int v = 10;
             int w = 4;
             float x = (float) v / w;
                          ^
                          |
                          |
                       casting
        */


    }
}
