import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class Kontak mewakili sebuah kontak dengan atribut nama, nomor telepon, dan email RAVLINDOOOOOO.
 */
class Kontak {
    private String nama;
    private String nomorTelepon;
    private String email;

    /**
     * Constructor untuk membuat objek Kontak.
     *
     * @param nama         Nama kontak
     * @param nomorTelepon Nomor telepon kontak
     * @param email        Email kontak
     */
    public Kontak(String nama, String nomorTelepon, String email) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    /**
     * Mengembalikan nama kontak.
     *
     * @return Nama kontak
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengatur nama kontak.
     *
     * @param nama Nama kontak
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Mengembalikan nomor telepon kontak.
     *
     * @return Nomor telepon kontak
     */
    public String getNomorTelepon() {
        return nomorTelepon;
    }

    /**
     * Mengatur nomor telepon kontak.
     *
     * @param nomorTelepon Nomor telepon kontak
     */
    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    /**
     * Mengembalikan email kontak.
     *
     * @return Email kontak
     */
    public String getEmail() {
        return email;
    }

    /**
     * Mengatur email kontak.
     *
     * @param email Email kontak
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Mengembalikan representasi string dari objek Kontak.
     *
     * @return Representasi string dari Kontak
     */
    public String toString() {
        return "Nama: " + nama + ", Nomor Telepon: " + nomorTelepon + ", Email: " + email;
    }
}

/**
 * Class PengelolaanKontak mengelola daftar kontak.
 */
class Pengelolandata {
    protected List<Kontak> daftarKontak;

    public Pengelolandata() {
        daftarKontak = new ArrayList<>();
    }

    // refaktor 3 super class
    public void tambahKontak(Kontak kontak) {
        daftarKontak.add(kontak);
        System.out.println("Kontak " + kontak.getNama() + " berhasil ditambahkan.");
    }

    //refaktor 5 dafter contact ekstra method
    public void hapusKontak(String nama) {
        Kontak kontakToRemove = null;
        for (Kontak kontak : daftarKontak) {
            if (kontak.getNama().equalsIgnoreCase(nama)) {
                kontakToRemove = kontak;
                break;
            }
        }
        if (kontakToRemove != null) {
            daftarKontak.remove(kontakToRemove);
            System.out.println("Kontak " + nama + " berhasil dihapus.");
        } else {
            System.out.println("Kontak dengan nama " + nama + " tidak ditemukan.");
        }
    }

    // Menampilkan semua kontak
    public void tampilkanKontak() {
        if (daftarKontak.isEmpty()) {
            System.out.println("Tidak ada kontak yang tersedia.");
        } else {
            System.out.println("Daftar Kontak:");
            for (Kontak kontak : daftarKontak) {
                System.out.println(kontak);
            }
        }
    }
}


/**
 * Class MainApp untuk menjalankan aplikasi pengelolaan kontak.
 */
class MainApp {
    public static void main(String[] args) {
        Pengelolandata pengelolaanKontak = new Pengelolandata();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu Pengelolaan Kontak:");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Hapus Kontak");
            System.out.println("3. Tampilkan Kontak");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Kontak: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Nomor Telepon: ");
                    String nomorTelepon = scanner.nextLine();
                    System.out.print("Masukkan Email: ");
                    String email = scanner.nextLine();
                    Kontak kontakBaru = new Kontak(nama, nomorTelepon, email);
                    pengelolaanKontak.tambahKontak(kontakBaru);
                    break;
                case 2:
                    System.out.print("Masukkan Nama Kontak yang akan dihapus: ");
                    String namaHapus = scanner.nextLine();
                    pengelolaanKontak.hapusKontak(namaHapus);
                    break;
                case 3:
                    pengelolaanKontak.tampilkanKontak();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
