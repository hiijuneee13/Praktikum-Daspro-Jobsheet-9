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
        System.out.print("Masukkan nilai yang ingin dicari!: ");
        int key = sc.nextInt();
        int hasil = 0;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                hasil = i;
                break;
            }

        }
        if (hasil !=0) {
            System.out.println("Nilai" + key + " ditemukan pada indeks ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        sc.close();
    }
}
