import java.util.Scanner;

public class Sapaaninteraktif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukan usia: ");
        int usia = input.nextInt();
        input.nextLine();

        System.out.print("Asal kota: ");
        String kota = input.nextLine();

        System.out.println("Halo," + nama + "!");
        System.out.println("Tahun depan usia anda " + (usia + 1) + " tahun.");
        System.out.println("Anda berasal dari " + kota + ".");

        input.close();

    }
}