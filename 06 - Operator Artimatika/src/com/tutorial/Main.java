package  com.tutorial;

public  class Main{
    public static void main(String[] args){
        int variabel1 = 10;
        int variabel2 = 5;
        int hasil;

        // 1. penjumlahan
        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);
        // 2. pengurangan
        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n",variabel1,variabel2,hasil);
        // 3. perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d x %d = %d \n",variabel1,variabel2,hasil);
        // 4. pembagian
        // a. pembagian dengan hasil bilangan bulat
        int bilangan1 = -10;
        int bilangan2 = 5;
        hasil = bilangan1 / bilangan2;
        System.out.printf("(%d) / %d = %d \n",bilangan1,bilangan2,hasil);
        // b. pembagian dengan hasil desimal
        float a = 3f;
        float b = 10f;
        float hasilFloat;
        hasilFloat = a / b;
        System.out.println(a + " : " + b + " = " + hasilFloat);
        // 5. modulus
        int x = 12;
        int y = 5;
        hasil = x % y;
        System.out.printf("%d %% %d = %d",x,y,hasil);

    }
}