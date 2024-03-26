import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class terserah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input data diri
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);
        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirStr = scanner.next();

        //Konversi tanggal
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);
        //Hitung umur
        Period umur = Period.between(tanggalLahir, LocalDate.now());
        //Output
        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin == 'P' ? "Perempuan" : "Laki-laki"));
        System.out.println("Umur: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan ");

        scanner.close();
    }
}
