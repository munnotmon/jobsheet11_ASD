import java.util.Scanner;

public class LayananAkademikSIAKAD12 {
    
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        antrianLayanan12 antrian = new antrianLayanan12(5);
        int pilihan;
    

        do {
            System.out.println("\n===== MENU ANTRIAN LAYANAN AKADEMIK =====");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc12.nextInt();
            sc12.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM              : ");
                    String nim = sc12.nextLine();
                    System.out.print("Nama        : ");
                    String nama = sc12.nextLine();
                    System.out.print("Prodi                 : ");
                    String prodi = sc12.nextLine();
                    System.out.print("Kelas      : ");
                    String kelas = sc12.nextLine();
                    mahasiswa12 mhs = new mahasiswa12(nim, nama, prodi, kelas);
                case 2:
                    mahasiswa12 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}

//commit