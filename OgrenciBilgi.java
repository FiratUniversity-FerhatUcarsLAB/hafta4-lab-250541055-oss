/*
 * Ad Soyad: [HAYAT AY]
 * Ogrenci No: [250541055]
 * Tarih: [29/10/2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        
        
        // Degisken tanimlamalari
        // String ad, soyad;
        // int ogrenciNo, yas;
        // double gpa;
        
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        
        
        // Soyad
        
        
        // Ogrenci No
        
        
        // Yas
        
        
        // GPA
        
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN
        import java.util.Scanner;


public class OgrenciBilgi {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.println("===Ogrenci Bilgi Sistemi===");
       
        // İsim ve soyisim (tüm satırı alır, boşluklu isim için güvenli)
        System.out.print("Adinizi girin:");
        String ad = input.next(); // Tek kelimelik giriş için

        System.out.print("Soyadinizi girin:");
        String soyad = input.next();

        System.out.print("Yasiniz:");
        int yas = input.nextInt();

        System.out.print("Ogrenci numaraniz:");
        int ogrNo = input.nextInt();

        System.out.print("GPA (0.00-4.00):");
        double GPA = input.nextInt();

         System.out.println("\n=== Ogrenci Bilgi Sistemi ===");
        System.out.println("Ad Soyad" + ad + " " + soyad);
        System.out.println("Yas" + yas);
        System.out.println("Ogrenci No" + ogrNo);
        System.out.printf("GPA: %.2f%n" ,GPA);

        input.close();

    }

}
        
        
        
        
        

        
        
        // Scanner'i kapatin (önemli pratik)
        
    }
}
