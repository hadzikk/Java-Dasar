package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Operator logika
        // adalah sebuah operator yang digunakan untuk memanipulasi nilai pada boolean

        // Macam jenis operator logika
        boolean a, b, c;

        // a. Operator logika '&&' (AND)
        // operator logika && akan bernilai true apabila dua nilai boolean true
        a = true;
        b = false;
        c = (a && b);
        // case 1 &&
        System.out.println("=====OPERATOR && (AND)======");
        System.out.println(a + " && " + b + " = " + c);
        // case 2
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        // case 3
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        // case 3
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c + "\n");

        // Operator logika '||' (OR)
        // operator logika || akan bernilai true apabila salah satu nilai atau keduanya bernilai true
        a = true;
        b = false;
        c = (a || b);
        System.out.println("=====OPERATOR || (OR)======");
        System.out.println(a + " || " + b + " = " + c);

        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c + "\n");

        // Operator logika '^' (XOR) Exclusive Or
        // operator logika ^  akan bernilai true apabila salah satu niai bernilai true dan salah satunya lagi bernilai false
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println("=====OPERATOR ^ (XOR)======");
        System.out.println(a + " ^ " + b + " = " + c);

        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c + "\n");

        // Operator '!' (negasi)
        // operator ! akan membalikan nilai boolean atau dikenal dengan istilah flipper

        // case 1
        a = true;
        c = (!a);
        System.out.println("=====OPERATOR ! (negasi)======");
        System.out.println(a + " != " + c);

        // case 2
        a = false;
        c = (!a);
        System.out.println(a + " != " + c);
    }
}
