import java.util.ArrayList;
import java.util.List;
import model.Mahasiswa;   // import class Mahasiswa dari package model

public class MahasiswaService {
    private List <Mahasiswa> daftarMahasiswa;

    public MahasiswaService() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public void tampilkanMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m);
        }
    }
}