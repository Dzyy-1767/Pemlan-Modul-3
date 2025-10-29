import java.util.Scanner;

/**
 * Kelas Main merupakan program sederhana untuk menghitung tagihan listrik pelanggan.
 * Program ini akan meminta nama pelanggan, jumlah pemakaian listrik (dalam kWh),
 * menghitung total tagihan berdasarkan tarif dan biaya admin, lalu menampilkan hasilnya.
 *
 * <p>Dibuat sebagai latihan dokumentasi JavaDoc pada mata kuliah
 * <b>Pemrograman Lanjut</b> — Modul 3 (Documentation Style).</p>
 *
 * @author kiya
 * @version 1.0
 */
public class Main {

    /**
     * Metode utama yang menjalankan program penghitung tagihan listrik.
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        System.out.println("=== Sistem Penghitung Tagihan Listrik ===");

        String nama = inputNamaPelanggan();
        double pemakaian = inputPemakaian();
        double total = hitungTagihan(pemakaian, 1500, 2500);

        tampilkanHasil(nama, total);
    }

    /**
     * Meminta pengguna untuk memasukkan nama pelanggan dan memformat huruf depannya menjadi kapital.
     *
     * @return nama pelanggan yang sudah diformat
     */
    public static String inputNamaPelanggan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine().trim();
        return formatNama(nama);
    }

    /**
     * Meminta pengguna untuk memasukkan jumlah pemakaian listrik (dalam kWh).
     *
     * @return jumlah pemakaian listrik dalam satuan kWh
     */
    public static double inputPemakaian() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        return input.nextDouble();
    }

    /**
     * Menghitung total tagihan listrik berdasarkan pemakaian, tarif, dan biaya admin.
     *
     * @param pemakaian jumlah pemakaian listrik dalam kWh
     * @param tarif tarif per kWh dalam Rupiah
     * @param admin biaya administrasi tetap dalam Rupiah
     * @return total tagihan listrik pelanggan dalam Rupiah
     */
    public static double hitungTagihan(double pemakaian, double tarif, double admin) {
        return (pemakaian * tarif) + admin;
    }

    /**
     * Menampilkan hasil perhitungan tagihan listrik ke layar.
     *
     * @param nama nama pelanggan
     * @param total total tagihan listrik yang harus dibayar
     */
    public static void tampilkanHasil(String nama, double total) {
        System.out.println("\n=== Rincian Tagihan Listrik ===");
        System.out.println("Nama Pelanggan   : " + nama);
        System.out.printf("Total Tagihan    : Rp %, .0f\n", total);
        System.out.println("Terima kasih telah membayar tagihan tepat waktu!");
    }

    /**
     * Membantu memformat nama pelanggan agar huruf pertama menjadi kapital
     * dan sisanya menjadi huruf kecil.
     *
     * @param nama nama pelanggan mentah yang diinput pengguna
     * @return nama pelanggan dengan format kapital di huruf pertama
     */
    public static String formatNama(String nama) {
        if (nama.isEmpty()) return nama;
        return nama.substring(0,1).toUpperCase() + nama.substring(1).toLowerCase();
    }
}
