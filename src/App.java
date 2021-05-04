public class App {
    public static void main(String[] args) throws Exception {

        // Membuat objek
        var bolpoint = new AlatTulis();
        var pensil = new AlatTulis();
        var penghapus = new AlatTulis();

        // Set bolpoint
        bolpoint.setNama("Bolpoint");
        bolpoint.setStok(10);
        bolpoint.setHargaSatuan(2000);
        bolpoint.setTotalHarga();

        // Set pensil
        pensil.setNama("pensil");
        pensil.setStok(10);
        pensil.setHargaSatuan(1000);
        pensil.setTotalHarga();
        
        // Set penghapus
        penghapus.setNama("penghapus");
        penghapus.setStok(10);
        penghapus.setHargaSatuan(500);
        penghapus.setTotalHarga();

        // Get bolpoint
        System.out.println("Nama Alat Tulis: " + bolpoint.getNama());
        System.out.println("Stok: " + bolpoint.getStok());
        System.out.println("Harga Satuan: " + bolpoint.getHargaSatuan());
        System.out.println("Harga Bolpoint: " + bolpoint.getTotalHarga());

        // Get pensil
        System.out.println("\nNama Alat Tulis: " + pensil.getNama());
        System.out.println("Stok: " + pensil.getStok());
        System.out.println("Harga Satuan: " + pensil.getHargaSatuan());
        System.out.println("Harga Pensil: " + pensil.getTotalHarga());

        // Get penghapus
        System.out.println("\nNama Alat Tulis: " + penghapus.getNama());
        System.out.println("Stok: " + penghapus.getStok());
        System.out.println("Harga Satuan: " + penghapus.getHargaSatuan());
        System.out.println("Harga Penghapus: " + penghapus.getTotalHarga());
        
    }
}
