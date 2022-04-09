package day13_stringManipulation;

import javax.print.DocFlavor;

public class C01_substring {
    public static void main(String[] args) {

        String str= "Java ile IT cok guzel";
        System.out.println(str.substring(5));
        // Yukaridaki String'i Mehmet Hoca ile IT cok guzel yazalim.

        System.out.println(str.replace("Java", "Mehmet Hoca"));
        System.out.println("Mehmet Hoca " + str.substring(5));

        System.out.println(str.substring(9)); //yazilan index inclusive

        // Eger bir index'den sona kadar olan parcayi degil belirli bir parcayi almak istersek
        // 2 parametre yazmak gerekir. str.substring(baslangicIndexi, bitisIndexi) olarak yazamamiz gerekli.
        // Baslangic indexi ==> iclusive/dahil
        // Bitis Indexi ==> eclusive/haric

        System.out.println(str.substring(0,5));  // Java ve bosluk olarak verecektir.
        System.out.println(str.substring(0,1)); // Sadece J harfini yazdirir
        // Bana 6. harfi String olarak bulun

        str= "Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7)); // hiclik olarak dondurur.

        // System.out.println(str.substring(5,2)); // bitis indexi baslangic indexinden kucuk olacak

        System.out.println(str.substring(str.length()-1)); //Son harfi verir
        System.out.println(str.substring(str.length()-5)); // son 5 harfi yazdiralim
        System.out.println(str.substring(str.length())); //Son harften sonrası yani hiclik verir





    }
}
