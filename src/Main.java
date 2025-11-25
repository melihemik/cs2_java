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
    long sonuc = 1;
    for (int i = 1; i <= s; i++) {sonuc = sonuc * i;}
    IO.println("Sonuç: " + sonuc);
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
    IO.print("Taban sayısını giriniz: ");
    int a = oku.nextInt();
    IO.print("Üs sayısını giriniz: ");
    int b = oku.nextInt();
    int sonuc = 1;
    for (int i = 1; i <= b; i++) {sonuc = sonuc * a;}
    IO.println("Sonuç: " + sonuc);
}

public static void Soru11(){
    IO.print("Bir sayı giriniz: ");
    int s = oku.nextInt();
    int a = 0;
    for (int i = 1; i <= s; i++) {
        if (s % i == 0) {
            a++;
        }
    }
    IO.println("Tam bölenlerin sayısı: " + a);
}

public static void Soru12(){
    IO.print("Kaç adet sayı gireceksiniz?: ");
    int a = oku.nextInt();
    double t = 0;
    double s;
    for (int i = 1; i <= a; i++) {
        IO.print(i + ". sayıyı giriniz: ");
        s = oku.nextDouble();
        t = t + s;
    }
    double o = t / a;
    IO.println("Girdiğiniz sayıların ortalaması: " + o);
}

public static void Soru13(){
    IO.print("Başlangıç sayısını giriniz: ");
    int a = oku.nextInt();
    IO.print("Bitiş sayısını giriniz: ");
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
        IO.println("Tek Sayıların Toplamı: " + toplam);
        IO.println("Tek Sayıların Ortalaması: " + ortalama);
    }
    else {IO.println("Bu aralıkta hiç tek sayı yok.");}
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
    IO.print("Kaçıncı ay olduğunu giriniz (1-12): ");
    int ay = oku.nextInt();
    switch (ay) {
        case 1:  IO.println("Ocak"); break;
        case 2:  IO.println("Şubat"); break;
        case 3:  IO.println("Mart"); break;
        case 4:  IO.println("Nisan"); break;
        case 5:  IO.println("Mayıs"); break;
        case 6:  IO.println("Haziran"); break;
        case 7:  IO.println("Temmuz👍👍"); break;
        case 8:  IO.println("Ağustos"); break;
        case 9:  IO.println("Eylül"); break;
        case 10: IO.println("Ekim"); break;
        case 11: IO.println("Kasım"); break;
        case 12: IO.println("Aralık"); break;
        default: IO.println("Hatalı giriş!"); break;
    }
}

public static void Soru16(){
    int t = 0;
    for (int i = 1; i <= 10; i++) {
        t = t + (i * i);
    }
    IO.println("Toplamı: " + t);
}

public static void Soru17(){
    int pa = 0;
    int na = 0;
    int sa = 0;
    int s;
    IO.println("Lütfen 10 adet sayı giriniz:");
    for (int i = 1; i <= 10; i++) {
        IO.print(i + ". sayıyı giriniz: ");
        s = oku.nextInt();
        if (s > 0) {pa++;}
        else if (s < 0) {na++;}
        else {sa++;}
    }
    IO.println("Pozitif Sayı Adedi: " + pa);
    IO.println("Negatif Sayı Adedi: " + na);
    IO.println("Sıfır Sayısı Adedi: " + sa);
}
    public static void main(String[] args) {
        while (true) {
            for(int i=0; i<5; i++) IO.println("");
            IO.println("================ 2. Çalışma Soruları ================");
            IO.println("1.  Klavyeden girilen 10 sayıdan tek ve çiftlerin toplamını bulan ve yazdıran");
            IO.println("2.  Klavyeden girilen 10 sayıdan tek ve çiftlerin sayısını bulan ve yazdıran");
            IO.println("3.  Klavyeden girilen 5 sayıdan en büyüğünü bulup yazdıran");
            IO.println("4.  Klavyeden girilen 5 sayının ortalamasını bulan ve yazdıran");
            IO.println("5.  50-100 arasındaki sayıların toplamını bulan ve yazdıran");
            IO.println("6.  50 ile 100 arasında 3 ün katlarını ekrana yazdıran");
            IO.println("7.  Klavyeden girilen bir sayının faktöriyelini bulduran");
            IO.println("8.  Klavyeden girilen N sayısına göre 1’ den N’e kadar olan sayıların toplamını bulduran");
            IO.println("9.  Klavyeden girilen a ve b sayıları arasındaki tek sayıları listeleyen program");
            IO.println("10.  Klavyeden girilen a ve b sayılarından a üstü b yi hesaplayan program");
            IO.println("11.  Klavyeden girilen bir sayının tam bölenlerinin sayısını bulduran program");
            IO.println("12.  Kullanıcının istediği miktarda girdiği sayıların ortalamasını hesaplayan program");
            IO.println("13.  Klavyeden girilen a ve b değerlerine göre a-b arası tek sayıların toplamını ve ortalamasını bulan program");
            IO.println("14.  1 den 25 e kadar olan sayıların kareleri toplamını bulan program");
            IO.println("15.  Klavyeden girilen 1-12 arasındaki tamsayıların hangi aya denk geldiğini bulup ekrana yazan program");
            IO.println("16.  1+4+9+ … +100= değerini hesaplayan program");
            IO.println("17.  Girilen 10 adet sayi içerisinden pozitiflerin ve negatiflerin ve “0” sayısını ayrı ayrı programın akış diyagramını yapınız program");
            IO.println("0.  ÇIKIŞ");
            IO.println("=========================================");
            IO.print("Seçiminiz: ");
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

                default: IO.println("Hatalı seçim!"); break;
            }
            IO.println("\nDevam etmek için bir sayı girip Enter'a bas...");
            oku.next();
        }
    }

}