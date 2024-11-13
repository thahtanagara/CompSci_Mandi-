import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CekKebiasaanMandi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n-------------------------------------------Inputan cek------------------------------------------------");
        System.out.print("Masukkan jumlah mahasiswa yang akan dicek: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        List<Mahasiswa> mahasiswaList = new ArrayList<>();

        // Mengisi data mahasiswa berdasarkan input pengguna
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Apakah mahasiswa Computer Science? (y/n): ");
            boolean isCompSci = scanner.nextLine().equalsIgnoreCase("y");

            System.out.print("Apakah menggunakan sabun pagi ini? (y/n): ");
            boolean menggunakanSabun = scanner.nextLine().equalsIgnoreCase("y");

            System.out.print("Apakah menggunakan shampo pagi ini? (y/n: ");
            boolean menggunakanShampo = scanner.nextLine().equalsIgnoreCase("y");

            System.out.print("Apakah menggunakan sikat gigi pagi ini? (y/n): ");
            boolean menggunakanSikatGigi = scanner.nextLine().equalsIgnoreCase("y");

            // Menambahkan objek Mahasiswa ke dalam list
            mahasiswaList.add(new Mahasiswa(nama, isCompSci, menggunakanSabun, menggunakanShampo, menggunakanSikatGigi));
        }

        // Mengecek dan menampilkan status mandi mahasiswa
        System.out.println("\n----------------------------------Hasil Cek Kebiasaan Mandi Mahasiswa----------------------------------");
        for (Mahasiswa mahasiswa : mahasiswaList) {
            cekApakahMandi(mahasiswa);
        }

        scanner.close();
    }

    public static void cekApakahMandi(Mahasiswa mahasiswa) {
        if (mahasiswa.isCompSci()) {
            if (!mahasiswa.isSudahMandi()) {
                System.out.println("Mahasiswa " + mahasiswa.getNama() + " dari jurusan Computer Science tidak pernah mandi.");
            } else {
                System.out.println("Mahasiswa " + mahasiswa.getNama() + " dari jurusan Computer Science sudah mandi dengan bukti:");
                for (String item : mahasiswa.getBuktiMandi()) {
                    System.out.println("- " + item);
                }
            }
        } else {
            System.out.println("Mahasiswa " + mahasiswa.getNama() + " bukan dari jurusan Computer Science.");
        }

        System.out.println("\n");
    }


}
