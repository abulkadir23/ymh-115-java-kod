import java.util.Scanner;

public class tek_cift {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sayi;
        System.out.print("Bir Tam Sayı Girin :");
        sayi=scan.nextInt();

        if (sayi %2==0) {
            System.out.println(sayi+" Sayısı Çift Sayıdır");

        }
        else {
            System.out.println(sayi+" Sayısı Tek Sayıdır");
        }
    }
}