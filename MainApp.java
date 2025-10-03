public class MainApp {
    public static void main(String[] args) {
        MahasiswaService service = new MahasiswaService();

        //Menambahkan beberapa mahasiswa
        service.tambahMahasiswa(new Mahasiswa("2403020", "Iman Mardiyanti Pratama"));
        service.tambahMahasiswa(new Mahasiswa("2403026", "Alfath Shafira"));
        service.tambahMahasiswa(new Mahasiswa("2403059", "Maya Dwi Putri Ramadhani"));

        //Menampilkan daftar mahasiswa
        service.tampilkanMahasiswa();
    }
}