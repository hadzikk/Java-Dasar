package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Operator Komparasi
        // adalah suatu operator perbandingan yang menghasilkan nilai boolean antara true dan false

        // 1. operator komparasi equal '=='
        // operator yang membandingkan persamaan suatu nilai, jika nilai yang dibandingkan sama maka akan menghasilkan boolean true
        int a, b;
        a = 10;
        b = 10;
        System.out.printf("apakah %d dan %d sama? ==> %s \n",a,b,(a == b));

        // 2. operator komparasi not equal '!='
        // operator yang digunakan untuk banding balik suatu nilai, jika nilai yang dibandingkan tidak sama maka akan menghasilkan boolean true
        int c, d;
        c = 5;
        d = 10;
        System.out.printf("apakah %d dan %d tidak sama? ==> %s \n",c,d,(c != d));

        // 3. operator less then '<'
        // operator yang digunakan untuk mengetahui apakah variabel pertama lebih kecil dari variabel yang dibandingkanya, jika variabel pertama lebih kecil maka akan menghasilkan true
        int e, f;
        e = 10;
        f = 20;
        System.out.printf("apakah %d lebih kecil dari %d? ==> %s \n",e,f,(e < f));

        // operator greater then '>'
        // operator yang digunakan untuk mengetahui apakah variabel pertama lebih besar dari variabel yang dibandingkanya, jika variabel pertama lebih kecil maka akan menghasilkan true
        int g, h;
        g = 200;
        h = 100;
        System.out.printf("apakah %d lebih besar dari %d? ==> %s \n",g,h,(g > h));

        // operator less equal then '<='
        // operator yang digunakan untuk mengetahui apakah variabel pertama lebih kecil atau sama dengan variabel yang dibandingkanya, jika variabel pertama lebih kecil atau sama dengan variabel yang dibandingkanya maka akan menghasilkan tru
        int i,j;
        i = 10;
        j = 10;
        System.out.printf("apakah %d lebih kecil atau sama dengan %d? ==> %s \n",i,j,(i <= j));


        // operator greater equal then '>='
        // operator yang digunakan untuk mengetahui apakah variabel pertama lebih besar atau sama dengan variabel yang dibandingkanya, jika variabel pertama lebih besar atau sama dengan variabel yang dibandingkanya maka akan menghasilkan tru
        int k,l;
        k = 10;
        l = 10;
        System.out.printf("apakah %d lebih besar atau sama dengan %d? ==> %s \n",k,l,(k >= l));
    }
}
