import java.util.Scanner;
public class BolunenSayılar {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi, sayac = 0, toplam = 0, i = 0;
        double ortalama;

        System.out.println("Sayı giriniz : ");
        sayi = girdi.nextInt();

        while (i <= sayi) {
            if ((i % 3) == 0 && i % 4 == 0) {
                toplam += i;
                sayac++;
            }
            i++;
        }
        ortalama = toplam / sayac;
        System.out.println("Ortalaması" + ortalama);


    }
}

