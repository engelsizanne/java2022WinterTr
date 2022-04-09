package day11_stringManipulation;
import java.util.Scanner;
public class C03_equalsIgnoreCase {
    public static void main(String[] args) {
        // kullaniciya derse katilip katilmak istemedigini sorun
        // evet derse, cevabini ve  "derse katiliminiz onaylanmistir" yazdirin
        // hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz ? \nEvet veya Hayir yaziniz : ");
        String cevap=scan.next();
        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("Derse katilimizniz onaylanmistir." );
        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("Sonraki derslerimize bekleriz." );
        } else {
            System.out.println("Lutfen sadece evet veya hayir yaziniz.");
        }
    }
}
