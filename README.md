
---

# Cek Kebiasaan Mandi Mahasiswa 🚿💻

Program ini adalah proyek sederhana dalam Java yang digunakan untuk memeriksa apakah mahasiswa dari jurusan Computer Science sudah mandi atau belum. Berdasarkan tiga item kebersihan (sabun, shampo, sikat gigi), program ini menganggap mahasiswa sudah mandi jika mereka menggunakan minimal dua dari tiga item tersebut.

## Fitur ✨

- **Input Data Mahasiswa**: Dapat menambahkan data beberapa mahasiswa sekaligus.
- **Pengecekan Jurusan**: Program hanya memeriksa kebiasaan mandi untuk mahasiswa yang berasal dari jurusan *Computer Science*.
- **Pengecekan Bukti Mandi**: Menggunakan logika sederhana untuk menentukan apakah seorang mahasiswa sudah mandi berdasarkan penggunaan sabun, shampo, dan sikat gigi.

## Teknologi yang Digunakan 🛠️

- **Bahasa Pemrograman**: Java
- **IDE yang Direkomendasikan**: IntelliJ IDEA, Eclipse, atau Visual Studio Code (dengan plugin Java)

## Cara Menggunakan 💻

1. **Clone repositori ini**:

    ```bash
    [git clone https://github.com/username/cek-kebiasaan-mandi-mahasiswa.git
    cd cek-kebiasaan-mandi-mahasiswa](https://github.com/thahtanagara/CompSci_Mandi-.git)
    ```

2. **Jalankan program** di terminal atau IDE Java pilihan Anda.

3. **Input data mahasiswa** saat diminta. Anda akan memasukkan:
   - Nama mahasiswa
   - Apakah jurusan mahasiswa adalah "Computer Science" (`y` atau `n`)
   - Apakah mahasiswa menggunakan sabun, shampo, dan sikat gigi (masukkan `y` atau `n`)

4. **Lihat hasilnya**. Program akan menampilkan apakah mahasiswa tersebut sudah mandi (lengkap dengan bukti item kebersihan) atau belum.

## Contoh Penggunaan 📋

Berikut adalah contoh sesi input dan output dari program:

```plaintext
Masukkan jumlah mahasiswa yang akan dicek: 2

Data Mahasiswa ke-1
Nama: Ali
Apakah mahasiswa Computer Science? (y/n): y
Apakah menggunakan sabun pagi ini? (y/n: y
Apakah menggunakan shampo pagi ini? (y/n): n
Apakah menggunakan sikat gigi pagi ini? (y/n): y

Data Mahasiswa ke-2
Nama: Siti
Apakah mahasiswa Computer Science? (y/n): n
Apakah menggunakan sabun pagi ini? (y/n): y
Apakah menggunakan shampo pagi ini? (y/n): y
Apakah menggunakan sikat gigi pagi ini? (y/n): n

Hasil Cek Kebiasaan Mandi Mahasiswa:
Mahasiswa Ali dari jurusan Computer Science sudah mandi dengan bukti:
- Sabun
- Sikat Gigi
Mahasiswa Siti bukan dari jurusan Computer Science.
```

## Struktur Kode 🗂️

- **Class `Mahasiswa`**: Menyimpan data mahasiswa, seperti nama, jurusan, status mandi, dan item kebersihan.
- **Class `CekKebiasaanMandi`**: Mengambil input dari pengguna, menambahkan data mahasiswa, dan menjalankan logika pengecekan melalui metode `cekApakahMandi`.

## Contributing 🤝

Ingin berkontribusi? Silakan ikuti langkah-langkah berikut:

1. Fork repo ini
2. Buat branch baru (`git checkout -b fitur-baru`)
3. Commit perubahan Anda (`git commit -m 'Menambahkan fitur baru'`)
4. Push ke branch (`git push origin fitur-baru`)
5. Buat Pull Request

## Lisensi 📄

Proyek ini menggunakan lisensi MIT - lihat [LICENSE.md](LICENSE.md) untuk detail lebih lanjut.

---
