package projek.uas.nadita;


/**
 * Class representing a hotel booking.
 * 
 * Author: 2201010020_Gung Nadita
 * Date: 2024-05-13
 */
public class BookingHotel {
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

    public String getNamaPengunjung() {
        return namaPengunjung;
    }

    public void setNamaPengunjung(String nama) {
        this.namaPengunjung = nama;
    }

    public String getAlamatEmail() {
        return alamatEmail;
    }

    public void setAlamatEmail(String email) {
        this.alamatEmail = email;
    }

    public String getTeleponPengunjung() {
        return teleponPengunjung;
    }

    public void setTeleponPengunjung(String telepon) {
        this.teleponPengunjung = telepon;
    }

    public String getJenisKamar() {
        return jenisKamar;
    }

    public void setJenisKamar(String kamar) {
        this.jenisKamar = kamar;
    }

    public int getDurasiMenginap() {
        return durasiMenginap;
    }

    public void setDurasiMenginap(int durasi) {
        this.durasiMenginap = durasi;
    }

    @Override
    public String toString() {
        return "Nama: " + namaPengunjung +
                "\nAlamat Email: " + alamatEmail +
                "\nTelepon Pengunjung: " + teleponPengunjung +
                "\nJenis Kamar: " + jenisKamar +
                "\nDurasi Menginap: " + durasiMenginap + " hari";
    }
}
