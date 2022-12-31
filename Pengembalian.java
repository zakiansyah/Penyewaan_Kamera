public class Pengembalian {
    int tanggal_pinjam;
    int tanggal_kembali;
    int denda;
    int telat;

    public int getTelat() {
        return telat;
    }

    public void setTelat(int telat) {
        this.telat = telat;
    }

    public int getTanggal_pinjam() {
        return tanggal_pinjam;
    }

    public void setTanggal_pinjam(int tanggal_pinjam) {
        this.tanggal_pinjam = tanggal_pinjam;
    }

    public int getTanggal_kembali() {
        return tanggal_kembali;
    }

    public void setTanggal_kembali(int tanggal_kembali) {
        this.tanggal_kembali = tanggal_kembali;
    }

    public int getDenda() {
        denda = 10000;
        if (telat == 0) {
            System.out.println("Anda tidak di kenakan denda");
        } else {
            return denda * telat;
        }
        return 0;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }
}

