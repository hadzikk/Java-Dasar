package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Operator Bitwise ---> operator yang digunakan untuk melakukan operasi pada nilai bit
        byte a, b, c;
        String a_bits, b_bits, c_bits;
        a = 3;
        System.out.println("===OPERATOR BITWISE===");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'); // mengubah nilai string ke biner lalu mereplace format digit kosong dengan angka 0
        System.out.printf("%s = %d \n",a_bits,a);

        // macam macam operator bitwise
        // a. operator bitwise shift left '<<' memindahkan nilai bit ke kiri
        System.out.println("======SHIFT LEFT");
        b = (byte)(a << 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);

        // b. operator bitwise shift right '>>' memindahkan nilai bit ke kanan
        System.out.println("======SHIFT RIGHT");
        a = 6;
        b = (byte)(a >> 1);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);

        // c. operator bitwise '|' (OR)
        System.out.println("======OR");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits,a);

        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);

        c = (byte)(a | b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits,c);

        // d. operator bitwise '&' (AND)
        System.out.println("======AND");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);
        c = (byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits,c);

        // d. operator bitwise '^' (XOR)
        System.out.println("======XOR");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);
        c = (byte)(a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits,c);

        // e. operator bitwise '~' not
        System.out.println("======NOT");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits,a);
        b = (byte)(~a);
        b_bits = String.format("%8s", Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d",b_bits,b);
    }
}
