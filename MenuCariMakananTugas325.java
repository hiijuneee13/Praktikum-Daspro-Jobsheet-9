import java.util.Scanner;
public class MenuCariMakananTugas325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                         "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.println("Menu tersedia:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        System.out.print("\nMasukkan nama makanan yang dicari: ");
        String cari = sc.nextLine();
        int hasil = 0 ;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari.trim())) {
                hasil = i;
                break;
            }
        }
        if (hasil != 0) {
            System.out.println(cari + " tersedia pada menu indeks ke-" + hasil + " (menu ke-" + (hasil+1) + ").");
        } else {
            System.out.println("Maaf, " + cari + " tidak ada di menu.");
        }
        sc.close();
    }
}

