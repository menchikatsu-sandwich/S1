package pbo1;

public class dataPekerja {
    String nama;
    int gaji;
    int umur;

    public dataPekerja(String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
        System.out.println("Nama Pekerja : " + nama);
        System.out.println("Gaji Pekerja : Rp. " + gaji);
    }

    public dataPekerja(int umur){
        this.umur = umur;
        System.out.println("Umur Pekerja : " + umur);
    }

    public dataPekerja(String inputNama, int inputGaji, int inputUmur){
        nama = inputNama;
        gaji = inputGaji;
        umur = inputUmur;
        System.out.println("Nama Pekerja : " + inputNama);
        System.out.println("Gaji Pekerja : Rp. " + inputGaji);
        System.out.println("Umur Pekerja : " + inputUmur);
    }

    public static void main(String[] args) {
        dataPekerja pekerja1 = new dataPekerja("Aldi", 1500000);
        dataPekerja pekerja2 = new dataPekerja(35);
        dataPekerja pekerja3 = new dataPekerja("Budi", 2000000, 30);
    }
}
