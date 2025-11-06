import java.util.Scanner;
public class SearchNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen: ");
        int n = sc.nextInt();
        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang dicari (key): ");
        int key = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        sc.close();
    }
}
