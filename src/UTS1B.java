import java.util.Scanner;
public class UTS1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan jenis suu (F untuk Fahrenheit, R untuk Reamur): ");
        char jenisSuhu = input.next().charAt(0);

        System.out.println("masukan nilai suhu dalam celcius:");
        double suhuCelcius = input.nextDouble();
        String statusKelipatan;
        double hasilKonversi = 0;
        if(jenisSuhu == 'F' || jenisSuhu == 'f') {
            hasilKonversi =(suhuCelcius *9/5) + 32;
        }else if (jenisSuhu == 'R' || jenisSuhu == 'r') {
            hasilKonversi=(suhuCelcius *4/5);
        }else {
            System.out.println("jenis suhu tidak valid. Program berhenti.");
            System.exit(0);

            if(hasilKonversi % 2 == 0 && hasilKonversi % 5 == 0){
                statusKelipatan = "kelipatan 2 dan 5";
            }else {
                statusKelipatan = "Bukan kelipatan 2 dan 5";
            }
            System.out.println("hasil konversi:" + hasilKonversi);
            System.out.println("Status kelipatan:" + statusKelipatan);

            input.close();
        }
    }

}
