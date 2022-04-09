package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        //soru7) Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        char ilkHarf = scan.next().charAt(0);
        // charAt (index) methodu parametre olarak yazdigimiz index'deki char'i bize getirir.
        // String'de index 0'dan baslar.
        // E-0 r-1 s-2 i-3 n-4
        System.out.println("Girdiğiginiz ismin ilk harfi: " + ilkHarf);



    }
}
