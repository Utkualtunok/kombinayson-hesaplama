import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n,r, nFact=1, rFact=1, xFact=1;
        //Kullanıcı veri girişi
        System.out.print("n sayısını girin: ");
        n = scanner.nextInt();

        System.out.print("r sayısını girin: ");
        r = scanner.nextInt();

        // n faktöriyel hesabı
        if (n > r) {
            for (int i = 1; i <= n; i++) {
                nFact *= i;
            }

            // r faktöriyel hesabı
            for (int i = 1; i <= r; i++) {
                rFact *= i;
            }

            // (n - r) faktöriyel hesabı
            for (int i = 1; i <= n - r; i++) {
                xFact *= i;
            }

            // Kombinasyon hesabı C(n,r) = n! / (r! * (n-r)!) formül
            System.out.println("Sonuç : " + nFact/(rFact*xFact));
        } else {
            System.out.println("Lütfen eleman sayısından (n) küçük bir seçim sayısı (r) giriniz.");
        }


    }
}
