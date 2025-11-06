import java.util.Scanner;
public class KelolaNilaiTugas125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya mahasiswa!: ");
        int n = sc.nextInt();
        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }
        int total = 0;
        for (int v : nilai) total += v;
        double rata = (n > 0) ? (double) total / n : 0;
        int max = nilai[0], min = nilai[0];
        for (int v : nilai) {
            if (v > max) max = v;
            if (v < min) min = v;
        }
        System.out.println("\nDaftar nilai:");
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa " + (i+1) + " : " + nilai[i]);
        }
        System.out.println("\nTotal = " + total);
        System.out.println("Rata-rata = " + rata);
        System.out.println("Nilai tertinggi = " + max);
        System.out.println("Nilai terendah = " + min);
        sc.close();
    }
}
