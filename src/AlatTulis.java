public class AlatTulis {
    String nama;
    int stok;
    int hargaSatuan;
    int hargaTotal;

    // Method setter nama
    void setNama(String nama) {
        this.nama = nama;
    }

    // Method getter nama
    String getNama() {
        return this.nama;
    }

    // Method setter stok
    void setStok(int stok) {
        this.stok = stok;
    }

    // Method getter stok
    int getStok() {
        return this.stok;
    }

    // Method setter hargaSatuan
    void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    // Method getter hargaSatuan
    int getHargaSatuan() {
        return this.hargaSatuan;
    }

    // Method setter totalHarga
    void setTotalHarga() {
        int hargaTotal = this.stok * this.hargaSatuan;
        this.hargaTotal = hargaTotal;
    }

    // Method getter totalHarga
    int getTotalHarga() {
        return this.hargaTotal;
    }
    
}
