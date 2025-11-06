import java.util.Scanner;
public class ArrayRataNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        int total = 0;
        double rata2;
        System.out.println("Masukkan 10 nilai mahasiswa:");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Nilai ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("\nTotal = " + total);
        System.out.println("Rata-rata = " + rata2);
        sc.close();
    }
}
