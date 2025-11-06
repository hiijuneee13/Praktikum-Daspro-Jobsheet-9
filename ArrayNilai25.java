import java.util.Scanner;
public class ArrayNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        System.out.println("Masukkan 10 nilai mahasiswa:");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }
        System.out.println("\nIsi array nilaiAkhir:");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("nilaiAkhir[" + i + "] = " + nilaiAkhir[i]);
        }
        sc.close();
    }
}
