import java.util.Scanner;

public class antrianKRSmenu12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrianKRS12 antrian = new antrianKRS12();
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Panggil 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Mahasiswa Belakang");
            System.out.println("6. Cek Antrian Kosong / Penuh");
            System.out.println("7. Cetak Jumlah Antrian & Proses KRS");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    mahasiswa12 mhs = new mahasiswa12(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2: 
                    antrian.panggilDuaMahasiswa(); 
                    break;
                case 3: 
                    antrian.tampilkanSemua(); 
                    break;
                case 4: 
                    antrian.tampilkan2Terdepan(); 
                    break;
                case 5: 
                    antrian.tampilkanBelakang(); 
                    break;
                case 6:
                    System.out.println("Kosong: " + antrian.isEmpty());
                    System.out.println("Penuh : " + antrian.isFull());
                    break;
                case 7: 
                    antrian.cetakJumlah(); 
                    break;
                case 8: 
                    antrian.kosongkan(); 
                    break;
                case 0: 
                    System.out.println("Keluar dari program"); 
                    break;
                default: System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
