import java.util.Scanner;
public class ArrayNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        System.out.println("Masukkan nilai akhir:");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        System.out.println("\nNilai mahasiswa yang lulus (>70):");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-"+i+" lulus!");
            }
        }
        System.out.println("\nStatus kelulusan:");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS!" : "TIDAK LULUS!";
            System.out.println("Mahasiswa ke-"+i+" : " + nilaiAkhir[i] + " -> " + status);
        }
        sc.close();
    }
}
