HAYAT AY 
250541055
29/10/2025
Görev2- Geometrik Hesap 

  import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        // Sabit PI değeri
        final double PI = 3.14159;


        Scanner input = new Scanner(System.in);
        System.out.println("===Geomtri Hesaplama===");
        System.out.println("Dairenin yaricapini girin (cm): ");
        double r = input.nextDouble();

        // Hesaplamalar
        double daireAlani = PI * r * r;
        double daireCevresi = 2 * PI * r;
        double daireCapi = 2 * r;
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
        double kureYuzeyAlani = 4 * PI * r * r;

        // Sonuçları yazdır
        System.out.println("SONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani       : %.2f cm^2%n", daireAlani);
        System.out.printf("Daire Cevresi     : %.2f cm%n", daireCevresi);
        System.out.printf("Daire Capi        : %.2f cm%n", daireCapi);
        System.out.printf("Kure Hacmi        : %.2f cm^3%n", kureHacmi);
        System.out.printf("Kure Yuzey Alani  : %.2f cm^2%n", kureYuzeyAlani);

        input.close();
    }
}
