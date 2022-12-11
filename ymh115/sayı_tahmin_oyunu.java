import java.util.Scanner;
import java.util.Random;

public class sayı_tahmin_oyunu {
    public static void main (String args []) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Sayı tahmin oyununa hoş geldiniz!");
        System.out.println("Lütfen 1-1000 arasında bir sayı giriniz: ");
        int tahmin = scan.nextInt();
        int sayi = rnd.nextInt(1001);
        while (tahmin != sayi) {
            if(tahmin < 0 || tahmin > 1000 ) {
                System.out.println("1 ile 1000 arasında bir değer giriniz: ");
                tahmin = scan.nextInt(); }
            else if (tahmin < sayi) {
                System.out.println("Daha büyük bir sayı giriniz: ");
                tahmin = scan.nextInt(); }
            else{
                System.out.println("Daha küçük bir sayı giriniz: ");
                tahmin = scan.nextInt();}
        }
        System.out.println("Tebrikler, kazandınız!"); }
}