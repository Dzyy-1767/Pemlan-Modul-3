# ⚡ Sistem Penghitung Tagihan Listrik

Proyek ini berisi dua versi program Java untuk menghitung total tagihan listrik pelanggan.  
Program dikembangkan sebagai bagian dari **Tugas 2 - Modul 3 (Pemrograman Lanjut: Documentation Style)**  
pada materi **Modern Programming Environment and Documentation**.
yah seperti itulah

---

## 📘 Deskripsi Proyek

Aplikasi ini menghitung total tagihan listrik berdasarkan:
- **Jumlah pemakaian (kWh)**
- **Tarif per kWh**
- **Biaya administrasi tetap**

Terdapat dua versi kode:
1. **TagihanListrikSebelum.java** → Versi awal (belum menggunakan fungsi terpisah).
2. **Main.java** → Versi setelah refactoring (menggunakan metode modular dan pemformatan nama pelanggan).

---

## 🧩 Struktur Folder

Tugas2_TagihanListrik/

src/

TagihanListrikSebelum.java

Main.java

README.md

uraaaaaaaaaaaaaaa

---

## 💡 Penjelasan Setiap Program

### 🧾 1. TagihanListrikSebelum.java

Program versi awal, berisi logika langsung di dalam `main()` tanpa pemisahan fungsi.

**Fitur:**
- Input nama pelanggan
- Input pemakaian listrik (kWh)
- Hitung total tagihan menggunakan rumus sederhana  
  `total = (pemakaian * TARIF) + BIAYA_ADMIN`
- Menampilkan hasil tagihan ke layar

**Kelemahan:**
- Kode belum modular (semua logika di dalam satu fungsi)
- Tidak ada validasi input
- Kurang fleksibel untuk pengembangan lebih lanjut

---

### ⚙️ 2. Main.java (Setelah Refactoring)

Program hasil refactoring dengan struktur lebih rapi dan modular.  
Setiap proses dipisah ke dalam fungsi terpisah agar mudah dibaca dan dirawat.

**Fitur Tambahan:**
- Modularisasi (fungsi `inputNamaPelanggan`, `inputPemakaian`, `hitungTagihan`, `tampilkanHasil`)
- Pemformatan nama pelanggan (`formatNama`) agar huruf depan kapital
- Output lebih terstruktur dan informatif
- Dokumentasi lengkap menggunakan **JavaDoc**

**Rumus yang digunakan:**

total = (pemakaian * tarif) + admin


---

## 🧠 Contoh Output Program

=== Sistem Penghitung Tagihan Listrik ===

Masukkan nama pelanggan: Kiyaa

Masukkan jumlah pemakaian listrik (kWh): 120

=== Rincian Tagihan Listrik ===

Nama Pelanggan : Kiyaa

Total Tagihan : Rp 182,500

Terima kasih telah membayar tagihan tepat waktu!


---

## 🧩 Perbandingan Versi

| Aspek | TagihanListrikSebelum.java | Main.java (Setelah Refactoring) |
|-------|------------------------------|----------------------------------|
| Struktur | Linear / 1 method | Modular (fungsi terpisah) |
| Pemformatan Nama | Tidak ada | Ada (`formatNama()`) |
| Dokumentasi | Tidak lengkap | Menggunakan JavaDoc |
| Fleksibilitas | Rendah | Mudah dikembangkan |
| Readability | Kurang jelas | Jauh lebih jelas |

---

## 🧾 Dokumentasi JavaDoc

Dokumentasi dihasilkan menggunakan fitur **Generate JavaDoc** di IntelliJ IDEA.

**Langkah:**
1. Buka proyek di IntelliJ IDEA
2. Klik **Tools → Generate JavaDoc...**
3. Tentukan **Output Directory**, misal: `docs/`
4. Klik **OK**

Hasil dokumentasi dapat diakses melalui:
/docs/index.html


---

## 🧰 Cara Menjalankan Program

1. Pastikan sudah menginstal **Java JDK** dan **IntelliJ IDEA / VS Code**
2. Buka proyek → `Run Main.java`
3. Masukkan nama pelanggan dan pemakaian listrik sesuai instruksi
4. Program akan menampilkan total tagihan listrik

---

## 👨‍💻 Identitas Pengembang
- **Nama:** _(Isi nama kamu)_
- **NIM:** _(Isi NIM kamu)_
- **Kelas Praktikum:** _(Isi kelas kamu)_
- **Mata Kuliah:** Pemrograman Lanjut (Modul 3)

---

## 📚 Lisensi
Proyek ini dibuat untuk keperluan pembelajaran di **Universitas Muhammadiyah Malang**  
dan tidak digunakan untuk tujuan komersial.
