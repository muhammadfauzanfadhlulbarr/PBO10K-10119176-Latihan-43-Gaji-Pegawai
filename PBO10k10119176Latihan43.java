import java.util.Scanner;
/**
 * Latihan43
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Gaji Pegawai
 */
public class PBO10k10119176Latihan43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GajiPegawai gaji = new GajiPegawai();
        gaji.setNama("Rizky Adam Kurniawan");
        gaji.setAlamat("Jalan Semar dlm 4 No 72/66");
        gaji.setUangTunjangan(250000);
        gaji.setUangTransport(300000);
        gaji.setGajiPokok(4500000);
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTunjangan(), gaji.getUangTransport(), gaji.getGajiPokok(), gaji.getGajiPokok());
        
    }
}
