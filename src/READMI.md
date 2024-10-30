# Aplikasi Pengelolaan Kontak

Proyek ini adalah **Aplikasi Pengelolaan Kontak** berbasis konsol yang digunakan untuk mengelola daftar kontak secara sederhana. Dengan aplikasi ini, pengguna dapat menambah, menghapus, dan melihat daftar kontak yang tersimpan dalam sistem.

## Deskripsi Singkat Proyek

Aplikasi Pengelolaan Kontak bertujuan untuk memudahkan pengguna dalam menyimpan informasi kontak. Setiap kontak terdiri dari informasi **nama**, **nomor telepon**, dan **email**. Aplikasi ini menyediakan antarmuka berbasis teks yang sederhana dan mudah digunakan.

Aplikasi ini telah melalui proses refactoring untuk meningkatkan keterbacaan dan modularitas kode sesuai dengan Modul 2. Beberapa langkah refactoring yang telah dilakukan termasuk pengubahan nama variabel, pemindahan kode ke dalam class super, dan penggunaan metode tambahan untuk meningkatkan fungsionalitas.

## Fitur Utama

1. **Tambah Kontak**: Menambahkan informasi kontak baru ke dalam daftar.
2. **Hapus Kontak**: Menghapus kontak yang ada berdasarkan nama.
3. **Tampilkan Kontak**: Menampilkan semua kontak yang telah ditambahkan.
4. **Keluar dari Program**: Menutup aplikasi.

## Struktur Kode

### 1. `Kontak.java`
- Class ini menyimpan informasi kontak individual seperti nama, nomor telepon, dan email.
- Memiliki metode getter dan setter untuk mengakses serta memperbarui data kontak.
- Override `toString()` untuk menampilkan informasi kontak.

### 2. `Pengelolandata.java`
- Class ini berperan sebagai penyimpan dan pengelola daftar semua kontak.
- Menyediakan metode:
    - `tambahKontak`: Menambahkan kontak ke daftar.
    - `hapusKontak`: Menghapus kontak berdasarkan nama.
    - `tampilkanKontak`: Menampilkan semua kontak dalam daftar.

### 3. `MainApp.java`
- Merupakan titik masuk utama untuk menjalankan aplikasi.
- Memberikan antarmuka teks sederhana dengan pilihan untuk menambah, menghapus, menampilkan kontak, atau keluar dari aplikasi.

## Langkah-langkah untuk Menjalankan Proyek

1. **Clone atau unduh** repository ini ke dalam direktori proyek lokal Anda.
2. **Buka** terminal atau command prompt pada direktori proyek.
3. **Compile** program dengan perintah:
   ```bash
  
   
## AUTORS RAVLINDO MS