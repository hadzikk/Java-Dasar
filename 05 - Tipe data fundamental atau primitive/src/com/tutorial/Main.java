package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Tipe data di java:
        // integer, byte, short, long, float, char, boolean, double

        // integer (bilangan bulat)
        int i = 10; /* integer adalah sebuah tipe data yang menampung bilangan bulat*/
        System.out.println("====INTEGER====");
        System.out.println("Nilai i = " + i);
        System.out.println("Nilai max integer = " + Integer.MAX_VALUE); // output: Nilai max integer = 2147483647
        System.out.println("Nilai min integer = " + Integer.MIN_VALUE); // output: Nilai min integer = -2147483648
        System.out.println("Besar byte = " + Integer.BYTES + " bytes");
        System.out.println("Besar byte = " + Integer.SIZE + " bit");

        // ketika nilai integer melebihi nilai maksimalnya, maka nilai tersebut akan berubah menjadi bilangan bulat negatif
        // dan akan di kalkulasi dari bilangan negatif tersebut, maka hati hati jika ingin mengkalkulasi menggunakan tipe data integer
        System.out.println(Integer.MAX_VALUE + 1 + "\n");

        // byte (bilagan bulat)
        byte b = 127;
        System.out.println("====BYTE====");
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai maximum byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai minimum byte = " + Byte.MIN_VALUE);
        System.out.println("Besar byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar byte = " + Byte.SIZE + " bit" + "\n");

        // short (bilangan bulat)
        short s = 32767;
        System.out.println("====SHORT====");
        System.out.println("Nilai maximum short = " + Short.MAX_VALUE);
        System.out.println("Nilai minimum short = " + Short.MIN_VALUE);
        System.out.println("Besar byte = " + Short.BYTES + " bytes");
        System.out.println("Besar byte = " + Short.SIZE + " bit" + "\n");

        // long (bilangan bulat)
        long l = 10L; // pada long dapat menuliskan huruf L setelah angka yang dimasukan, menandakan bahwa ini adalah value dari tipe data Long namun outputnya tidak menyertakan huruf tersebut
        System.out.println("====LONG====");
        System.out.println("Nilai variabel l = " + l);
        System.out.println("Nilai maximum long = " + Long.MAX_VALUE);
        System.out.println("Nilai minimum long = " + Long.MIN_VALUE);
        System.out.println("Besar byte = " + Long.BYTES + " bytes");
        System.out.println("Besar byte = " + Long.SIZE + " bit" + "\n");

        // double (bilangan desimal (64 bit))
        double d = 3.14d;
        System.out.println("====DOUBLE====");
        System.out.println("Nilai variabel d = " + d);
        System.out.println("Nilai maximum double = " + Double.MAX_VALUE);
        System.out.println("Nilai minimum double = " + Double.MIN_VALUE);
        System.out.println("Besar byte = " + Double.BYTES + " bytes");
        System.out.println("Besar byte = " + Double.SIZE + " bit" + "\n");

        // float (bilangan desimal (32 bit))
        float f = 40.00f;
        System.out.println("====FLOAT====");
        System.out.println("Nilai variabel f = " + f);
        System.out.println("Nilai maximum double = " + Float.MAX_VALUE);
        System.out.println("Nilai minimum double = " + Float.MIN_VALUE);
        System.out.println("Besar byte = " + Float.BYTES + " bytes");
        System.out.println("Besar byte = " + Float.SIZE + " bit" + "\n");

        // char (huruf)
        /*
        char adalah tipe data yang hanya dapat menampung satu digit
        huruf ataupun angka. namun pada umumnya char ini digunakan untuk menampung huruf

        hint: cari tau hubungan antara char dengan ASCII CODE
         */
        char c = 'x';
        System.out.println("====CHAR====");
        System.out.println("Nilai variabel c = " + c);
        System.out.println("Nilai maximum char = " + Character.MAX_VALUE);
        System.out.println("Nilai minimum char = " + Character.MIN_VALUE);
        System.out.println("Besar byte = " + Character.BYTES + " bytes");
        System.out.println("Besar byte = " + Character.SIZE + " bit" + "\n");

        // boolean (true atau false)
        boolean aktif = true; // boolean adalah tipe data 1 bit yang hanya dapat berisikan true dan false
        /* dalam dunia komputer yaitu pada binnary, hanya terdapat 1 dan 0
           yang dimana 1 merepresentasikan true dan 0 false
           jalanya sebuah komputer dijalankan oleh sesuatu yang dinamakan trancistor
           dan transistor ini mengalirkan arus listrik yang dimana ketika true pada binner
           maka transistor akan mengaliri komputer, dan jika 0 maka tidak akan mengaliri listrik
           ritme arus listrik yang dihasilkan binner inilah yang menjalankan komputer.
        */
        System.out.println("====BOOLEAN====");
        System.out.println("Nilai variabel aktif = " + aktif);


        // kesimpulan
        /* integer, byte, short, long, float, char, boolean, double
           adalah tipe data primitive yang artinya nilai dan ketentuanya sudah ditetapkan
           sedangkan String adalah tipe data hight level, yang dimana String ini tidak memiliki MAX_VALUE maupun MIN_VALUE
           String terdiri dan tersusun dari beberapa character
        */



    }
}
