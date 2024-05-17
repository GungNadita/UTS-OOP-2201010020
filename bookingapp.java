package projek.uas.nadita;

import java.util.Scanner;

class bookingapp {
    private final BookingHotel[] records;
    private int numOfRecords;
    private final Scanner scanner;
    private static final int MAX_RECORDS = 100; // Define a maximum limit for records

    public bookingapp() {
        records = new BookingHotel[MAX_RECORDS];
        numOfRecords = 0;
        scanner = new Scanner(System.in);
    }

    public void tambahRecord() {
        if (numOfRecords < MAX_RECORDS) {
            System.out.println("Masukkan data tamu:");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat Email: ");
            String email = scanner.nextLine();
            System.out.print("Telepon Pengunjung: ");
            String telepon = scanner.nextLine();
            System.out.print("Jenis Kamar: ");
            String kamar = scanner.nextLine();
            System.out.print("Durasi Penginap (hari): ");
            int durasi = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            records[numOfRecords++] = new BookingHotel(nama, email, telepon, kamar, durasi);
            System.out.println("Data Berhasil Ditambahkan");
        } else {
            System.out.println("Batas maksimal data sudah tercapai");
        }
    }

    public void tampilkanRecord() {
        System.out.println("Daftar Data Pembooking Hotel:");
        for (int i = 0; i < numOfRecords; i++) {
            System.out.println("Data " + (i + 1) + ":");
            System.out.println(records[i].toString());
            System.out.println();
        }
    }

    public void ubahRecord() {
        System.out.println("Masukkan Nomor Data yang ingin Diubah:");
        int nomor = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        if (nomor >= 1 && nomor <= numOfRecords) {
            System.out.println("Masukkan data baru");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat Email: ");
            String email = scanner.nextLine();
            System.out.print("Telepon: ");
            String telepon = scanner.nextLine();
            System.out.print("Jenis Kamar: ");
            String kamar = scanner.nextLine();
            System.out.print("Durasi menginap (hari): ");
            int durasi = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            records[nomor - 1].setNamaPengunjung(nama);
            records[nomor - 1].setAlamatEmail(email);
            records[nomor - 1].setTeleponPengunjung(telepon);
            records[nomor - 1].setJenisKamar(kamar);
            records[nomor - 1].setDurasiMenginap(durasi);

            System.out.println("Data berhasil diubah.");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }

    public void hapusRecord() {
        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        int nomor = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        if (nomor >= 1 && nomor <= numOfRecords) {
            for (int i = nomor - 1; i < numOfRecords - 1; i++) {
                records[i] = records[i + 1];
            }
            numOfRecords--;
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }

    public void jalankan() {
        int pilihan;

        do {
            System.out.println("Menu Aplikasi:");
            System.out.println("1. Tambah Data Tamu");
            System.out.println("2. Tampilkan Data Tamu");
            System.out.println("3. Ubah Data Tamu");
            System.out.println("4. Hapus Data Tamu");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1 -> tambahRecord();
                case 2 -> tampilkanRecord();
                case 3 -> ubahRecord();
                case 4 -> hapusRecord();
                case 5 -> System.out.println("Terima kasih telah menggunakan aplikasi.");
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

    public static void main(String[] args) {
        bookingapp bookingapp = new bookingapp();
        bookingapp.jalankan();
    }
}

class BookingHotel {
    private String namaPengunjung;
    private String alamatEmail;
    private String teleponPengunjung;
    private String jenisKamar;
    private int durasiMenginap;

    public BookingHotel(String nama, String email, String telepon, String kamar, int durasi) {
        this.namaPengunjung = nama;
        this.alamatEmail = email;
        this.teleponPengunjung = telepon;
        this.jenisKamar = kamar;
        this.durasiMenginap = durasi;
    }

    public void setNamaPengunjung(String nama) {
        this.namaPengunjung = nama;
    }

    public void setAlamatEmail(String email) {
        this.alamatEmail = email;
    }

    public void setTeleponPengunjung(String telepon) {
        this.teleponPengunjung = telepon;
    }

    public void setJenisKamar(String kamar) {
        this.jenisKamar = kamar;
    }

    public void setDurasiMenginap(int durasi) {
        this.durasiMenginap = durasi;
    }

    @Override
    public String toString() {
        return "Nama: " + namaPengunjung + "\nAlamat Email: " + alamatEmail + "\nTelepon: " + teleponPengunjung + "\nJenis Kamar: " + jenisKamar + "\nDurasi Menginap: " + durasiMenginap + " hari";
    }
}
