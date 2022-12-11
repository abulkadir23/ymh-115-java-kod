import java.util.Scanner;

public class vki {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz (cm) : ");
        double boy = scanner.nextDouble();

        System.out.print("Kilonuzu giriniz (kg) : ");
        double kilo = scanner.nextDouble();


        boy=boy/100;
        double endeks  = kilo/(boy*boy);

        System.out.println(boy+"m");
        System.out.println(kilo+"kg");
        if(endeks <18)
        {
            System.out.print(String.format("Vücut Kitle Endeksi ZAYIF, vki: %f", +endeks));
        }
        else if(endeks >= 18 && endeks <25)
        {
            System.out.print(String.format("Vücut Kitle Endeksi NORMAL, vki: %f", +endeks));
        }
        else if(endeks >= 25 && endeks <30)
        {
            System.out.print(String.format("Vücut Kitle Endeksi KİLOLU, vki: %f", +endeks));
        }
        else if(endeks >= 30 && endeks <35)
        {
            System.out.print(String.format("Vücut Kitle Endeksi ÇOK KİLOLU, vki: %f", + endeks));
        }
        else
        {
            System.out.print(String.format("Vücut Kitle Endeksi ÇOK CİDDİ KİLOLU, vki: %f", + endeks ));
        }
    }
}