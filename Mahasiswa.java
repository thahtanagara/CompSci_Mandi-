import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private boolean isCompSci;
    private boolean sudahMandi;
    private List<String> buktiMandi;

    public Mahasiswa(String nama, boolean isCompSci, boolean menggunakanSabun, boolean menggunakanShampo, boolean menggunakanSikatGigi) {
        this.nama = nama;
        this.isCompSci = isCompSci;
        this.buktiMandi = new ArrayList<>();

        // Memeriksa bukti mandi berdasarkan penggunaan sabun, shampo, dan sikat gigi
        if (menggunakanSabun) buktiMandi.add("Sabun");
        if (menggunakanShampo) buktiMandi.add("Shampo");
        if (menggunakanSikatGigi) buktiMandi.add("Sikat Gigi");

        // Sudah mandi jika menggunakan minimal dua dari tiga item tersebut
        this.sudahMandi = buktiMandi.size() >= 2;
    }

    public boolean isCompSci() {
        return isCompSci;
    }

    public boolean isSudahMandi() {
        return sudahMandi;
    }

    public String getNama() {
        return nama;
    }

    public List<String> getBuktiMandi() {
        return buktiMandi;
    }
}
