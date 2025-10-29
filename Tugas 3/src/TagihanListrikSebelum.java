import java.util.Scanner;

/**
 * Kelas {@code TagihanListrikSebelum} merupakan versi awal program
 * untuk menghitung tagihan listrik pelanggan sebelum dilakukan refactoring.
 * <p>
 * Program ini meminta pengguna memasukkan nama pelanggan dan jumlah pemakaian listrik (dalam kWh),
 * kemudian menghitung total tagihan berdasarkan tarif dan biaya administrasi tetap.
 * </p>
 *
 * <p><b>Catatan:</b> Kelas ini belum menggunakan metode terpisah (fungsi modular),
 * sehingga seluruh logika program masih berada di dalam metode {@code main()}.</p>
 *
 * @author kiya
 * @version 1.0
 */
public class TagihanListrikSebelum {

    /**
     * Konstanta tarif listrik per kWh.
     */
    public static final int TARIF = 1500;

    /**
     * Konstanta biaya administrasi tetap.
     */
    public static final int BIAYA_ADMIN = 2500;

    /**
     * Metode utama yang menjalankan program penghitungan tagihan listrik.
     * <p>
     * Program akan meminta input nama pelanggan dan jumlah pemakaian listrik,
     * lalu menghitung total tagihan menggunakan rumus sederhana:
     * </p>
     *
     * <pre>
     * total = (pemakaian * TARIF) + BIAYA_ADMIN
     * </pre>
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Penghitung Tagihan Listrik ===");

        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        double pemakaian = input.nextDouble();

        double tarif = TARIF;
        double biayaAdmin = BIAYA_ADMIN;
        double total = (pemakaian * tarif) + biayaAdmin;

        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Total Tagihan Listrik: Rp " + total);

        input.close();
    }
}
