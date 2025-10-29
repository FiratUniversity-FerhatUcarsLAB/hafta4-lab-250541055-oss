HAYAT AY
250541055
29/10/2025
Görev3 - Maaş Hesap 

  import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sabit oranlar
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        // Kullanıcıdan bilgiler alınıyor
        System.out.print("Çalışanın adı soyadı: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylık brüt maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalık çalışma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati: ");
        int mesaiSaat = input.nextInt();

        // Hesaplamalar
        double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        // İstatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176;
        double gunlukNetKazanc = netMaas / 22;

        // Maaş Bordrosu çıktısı
        System.out.println("====================================");
        System.out.println("          MAAS BORDROSU");
        System.out.println("====================================");
        System.out.println("Çalışan: " + adSoyad);
        System.out.println("GELIRLER:");
        System.out.printf("Brüt Maaş: %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ücreti (%d saat): %.2f TL%n", mesaiSaat, mesaiUcreti);
        System.out.println("------------------------");
        System.out.printf("TOPLAM GELIR: %.2f TL%n", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("SGK Kesintisi (%.1f%%): %.2f TL%n", SGK_ORANI * 100, sgk);
        System.out.printf("Gelir Vergisi (%.1f%%): %.2f TL%n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%): %.2f TL%n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("------------------------");
        System.out.printf("TOPLAM KESINTI: %.2f TL%n", toplamKesinti);

        System.out.printf("NET MAAS: %.2f TL%n", netMaas);
        System.out.println("====================================");
        System.out.printf("Kesinti Oranı: %.1f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanç: %.2f TL%n", saatlikNetKazanc);
        System.out.printf("Günlük Net Kazanç: %.2f TL%n", gunlukNetKazanc);
        System.out.println("====================================");
    }
}
