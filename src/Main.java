import java.util.Scanner;

public class Main {
    static Scanner oku = new Scanner(System.in);

public static void Soru1(){
    int tt = 0;
    int ct = 0;
    int s;

    for (int i = 1; i <= 10; i++) {
        IO.print(i + ". sayıyı giriniz: ");
        s = oku.nextInt();
        if (s % 2 == 0) {ct = ct + s;}
        else {tt = tt + s;}
    }
    IO.println("teklerin toplamı: " + tt);
    IO.println("çiftlerin toplamı: " + ct);
}

public static void Soru2(){
    int ta = 0;
    int ca = 0;
    int s;
    for (int i = 1; i <= 10; i++) {
        IO.print(i + ". sayıyı giriniz: ");
        s = oku.nextInt();
        if (s % 2 == 0) {ca++;}
        else {ta++;}
    }
    IO.println("girilen tek sayı adedi: " + ta);
    IO.println("girilen çift sayı adedi: " + ca);
}

public static void Soru3(){
    IO.print("1. sayıyı giriniz: ");
    int eb = oku.nextInt();
    int s;
    for (int i = 2; i <= 5; i++) {
        IO.print(i + ". sayıyı giriniz: ");
        s = oku.nextInt();
        if (s > eb) {eb = s;}
    }
    IO.println("En Büyük Sayı: " + eb);
}

public static void Soru4(){
    double t = 0;
    double s;
    for (int i = 1; i <= 5; i++) {
        IO.print(i + ". sayıyı giriniz: ");
        s = oku.nextDouble();
        t = t + s;
    }
    double ortalama = t / 5;
    IO.println("Ortalama: " + ortalama);
}

public static void Soru5(){
    int t = 0;
    for (int i = 50; i <= 100; i++)
    {t = t + i;}
    IO.println("50 ile 100 arası sayıların toplamı: " + t);
}

public static void Soru6(){
    for (int i = 50; i <= 100; i++) {
        if (i % 3 == 0) {
            IO.println(i);
        }
    }
}

public static void Soru7(){
    IO.print("sayıyı giriniz: ");
    int s = oku.nextInt();
    int sonuc = 1;
    for (int i = 1; i <= s; i++) {sonuc = sonuc * i;}
    IO.println("Sonuç: " + sonuc);
    // hatalı
}

public static void Soru8(){
    IO.print("Bir sayı giriniz: ");
    int s = oku.nextInt();
    int toplam = 0;
    for (int i = 1; i <= s; i++) {
        toplam = toplam + i;
    }

    IO.println("1'den " + s + "'e kadar olan sayıların toplamı: " + toplam);
}

public static void Soru9(){
    IO.print("Başlangıç sayısını giriniz: ");
    int a = oku.nextInt();
    IO.print("Bitiş sayısını giriniz: ");
    int b = oku.nextInt();
    IO.println(a + " ile " + b + " arasındaki tek sayılar:");
    for (int i = a; i <= b; i++) {
        if (i % 2 != 0) {
            IO.println(i);
        }
    }
}
public static void Soru10(){
    System.out.print("Taban sayısını giriniz: ");
    int a = oku.nextInt();
    System.out.print("Üs sayısını giriniz: ");
    int b = oku.nextInt();
    int sonuc = 1;
    for (int i = 1; i <= b; i++) {sonuc = sonuc * a;}
    System.out.println("Sonuç: " + sonuc);
}

public static void Soru11(){
    System.out.print("Bir sayı giriniz: ");
    int s = oku.nextInt();
    int a = 0;
    for (int i = 1; i <= s; i++) {
        if (s % i == 0) {
            a++;
        }
    }
    System.out.println("Tam bölenlerin sayısı: " + a);
}

public static void Soru12(){
    System.out.print("Kaç adet sayı gireceksiniz?: ");
    int a = oku.nextInt();
    double t = 0;
    double s;
    for (int i = 1; i <= a; i++) {
        System.out.print(i + ". sayıyı giriniz: ");
        s = oku.nextDouble();
        t = t + s;
    }
    double o = t / a;
    System.out.println("Girdiğiniz sayıların ortalaması: " + o);
}

public static void Soru13(){
    System.out.print("Başlangıç sayısını giriniz: ");
    int a = oku.nextInt();
    System.out.print("Bitiş sayısını giriniz: ");
    int b = oku.nextInt();
    int toplam = 0;
    int adet = 0;
    for (int i = a; i <= b; i++) {
        if (i % 2 != 0) {
            toplam += i;
            adet++;
        }
    }
    if (adet > 0) {
        double ortalama = (double)toplam / adet;
        System.out.println("Tek Sayıların Toplamı: " + toplam);
        System.out.println("Tek Sayıların Ortalaması: " + ortalama);
    }
    else {System.out.println("Bu aralıkta hiç tek sayı yok.");}
}

public static void Soru14(){
    int t = 0;
    for (int i = 1; i <= 25; i++) {
        int kare = i * i;
        t = t + kare;
    }
    IO.println("1-25 arası sayıların kareleri toplamı: " + t);
}

public static void Soru15(){
    System.out.print("Kaçıncı ay olduğunu giriniz (1-12): ");
    int ay = oku.nextInt();
    switch (ay) {
        case 1:  System.out.println("Ocak"); break;
        case 2:  System.out.println("Şubat"); break;
        case 3:  System.out.println("Mart"); break;
        case 4:  System.out.println("Nisan"); break;
        case 5:  System.out.println("Mayıs"); break;
        case 6:  System.out.println("Haziran"); break;
        case 7:  System.out.println("Temmuz👍👍"); break;
        case 8:  System.out.println("Ağustos"); break;
        case 9:  System.out.println("Eylül"); break;
        case 10: System.out.println("Ekim"); break;
        case 11: System.out.println("Kasım"); break;
        case 12: System.out.println("Aralık"); break;
        default: System.out.println("Hatalı giriş!"); break;
    }
}

public static void Soru16(){
    int t = 0;
    for (int i = 1; i <= 10; i++) {
        t = t + (i * i);
    }
    System.out.println("Toplamı: " + t);
}

public static void Soru17(){
    int pa = 0;
    int na = 0;
    int sa = 0;
    int s;
    System.out.println("Lütfen 10 adet sayı giriniz:");
    for (int i = 1; i <= 10; i++) {
        System.out.print(i + ". sayıyı giriniz: ");
        s = oku.nextInt();
        if (s > 0) {pa++;}
        else if (s < 0) {na++;}
        else {sa++;}
    }
    System.out.println("Pozitif Sayı Adedi: " + pa);
    System.out.println("Negatif Sayı Adedi: " + na);
    System.out.println("Sıfır Sayısı Adedi: " + sa);
}
    public static void main(String[] args) {
        while (true) {
            for(int i=0; i<5; i++) System.out.println();
            System.out.println("================ 2. Çalışma Soruları ================");
            System.out.println("1.  Klavyeden girilen 10 sayıdan tek ve çiftlerin toplamını bulan ve yazdıran");
            System.out.println("2.  Klavyeden girilen 10 sayıdan tek ve çiftlerin sayısını bulan ve yazdıran");
            System.out.println("3.  Klavyeden girilen 5 sayıdan en büyüğünü bulup yazdıran");
            System.out.println("4.  Klavyeden girilen 5 sayının ortalamasını bulan ve yazdıran");
            System.out.println("5.  50-100 arasındaki sayıların toplamını bulan ve yazdıran");
            System.out.println("6.  50 ile 100 arasında 3 ün katlarını ekrana yazdıran");
            System.out.println("7.  Klavyeden girilen bir sayının faktöriyelini bulduran");
            System.out.println("8.  Klavyeden girilen N sayısına göre 1’ den N’e kadar olan sayıların toplamını bulduran");
            System.out.println("9.  Klavyeden girilen a ve b sayıları arasındaki tek sayıları listeleyen program");
            System.out.println("10.  Klavyeden girilen a ve b sayılarından a üstü b yi hesaplayan program");
            System.out.println("11.  Klavyeden girilen bir sayının tam bölenlerinin sayısını bulduran program");
            System.out.println("12.  Kullanıcının istediği miktarda girdiği sayıların ortalamasını hesaplayan program");
            System.out.println("13.  Klavyeden girilen a ve b değerlerine göre a-b arası tek sayıların toplamını ve ortalamasını bulan program");
            System.out.println("14.  1 den 25 e kadar olan sayıların kareleri toplamını bulan program");
            System.out.println("15.  Klavyeden girilen 1-12 arasındaki tamsayıların hangi aya denk geldiğini bulup ekrana yazan program");
            System.out.println("16.  1+4+9+ … +100= değerini hesaplayan program");
            System.out.println("17.  Girilen 10 adet sayi içerisinden pozitiflerin ve negatiflerin ve “0” sayısını ayrı ayrı programın akış diyagramını yapınız program");
            System.out.println("0.  ÇIKIŞ");
            System.out.println("=========================================");
            System.out.print("Seçiminiz: ");
            int secim = oku.nextInt();
            if (secim == 0) break;
            switch (secim) {
                case 1: Soru1(); break;
                case 2: Soru2(); break;
                case 3: Soru3(); break;
                case 4: Soru4(); break;
                case 5: Soru5(); break;
                case 6: Soru6(); break;
                case 7: Soru7(); break;
                case 8: Soru8(); break;
                case 9: Soru9(); break;
                case 10: Soru10(); break;
                case 11: Soru11(); break;
                case 12: Soru12(); break;
                case 13: Soru13(); break;
                case 14: Soru14(); break;
                case 15: Soru15(); break;
                case 16: Soru16(); break;
                case 17: Soru17(); break;

                default: System.out.println("Hatalı seçim!"); break;
            }
            System.out.println("\nDevam etmek için bir sayı girip Enter'a bas...");
            oku.next();
        }
    }

}