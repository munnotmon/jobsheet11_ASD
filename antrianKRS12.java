public class antrianKRS12 {
    mahasiswa12[] antrian = new mahasiswa12[10];
    int front = 0, rear = -1, size = 0, totalSudahKRS = 0;

    boolean isEmpty() { return size == 0; }
    boolean isFull() { return size == 10; }
    
    void tambahAntrian(mahasiswa12 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % antrian.length;
        antrian[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " ditambahkan ke antrian.");
    }


    void panggilDuaMahasiswa() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2!");
            return;
        }
        for (int i = 0; i < 2; i++) {
            mahasiswa12 m = antrian[front];
            m.sudahKRS = true;
            front = (front + 1) % antrian.length;
            size--;
            totalSudahKRS++;
            System.out.print("Memproses: ");
            m.tampilkanData();
        }
    }

    void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % antrian.length;
            antrian[idx].tampilkanData();
        }
    }

    void tampilkan2Terdepan() {
        for (int i = 0; i < Math.min(2, size); i++) {
            int idx = (front + i) % antrian.length;
            antrian[idx].tampilkanData();
        }
    }

    void tampilkanBelakang() {
        if (isEmpty()) return;
        antrian[rear].tampilkanData();
    }

    void kosongkan() {
        front = 0; rear = -1; size = 0; totalSudahKRS = 0;
        System.out.println("Antrian dikosongkan.");
    }

    void cetakJumlah() {
        System.out.println("Total dalam antrian: " + size);
        System.out.println("Sudah proses KRS: " + totalSudahKRS);
        System.out.println("Belum proses KRS: " + (10 - totalSudahKRS));
    }
}
