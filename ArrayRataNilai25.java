import java.util.Scanner;
public class ArrayRataNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        System.out.println("Masukkan nilai mahasiswa:");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Rata-rata = " + rata2);

        int countLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) countLulus++;
        }
        System.out.println("Banyak mahasiswa yang lulus : " + countLulus);

        sc.close();
    }
}
