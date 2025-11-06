import java.util.Scanner;
public class PemesananKafeTugas225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan: ");
        int m = sc.nextInt();
        sc.nextLine();
        String[] nama = new String[m];
        int[] harga = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Nama pesanan ke-" + (i+1) + ": ");
            nama[i] = sc.nextLine();
            System.out.print("Harga pesanan ke-" + (i+1) + ": ");
            harga[i] = sc.nextInt();
            sc.nextLine();
        }
        int total = 0;
        System.out.println("\nDaftar pesanan:");
        for (int i = 0; i < m; i++) {
            System.out.println((i+1) + ". " + nama[i] + " - Rp " + harga[i]);
            total += harga[i];
        }
        System.out.println("Total biaya = Rp " + total);
        sc.close();
    }
}
