import java.util.Scanner;
// import java.io.IOException;

public class Input1{
	public static void main(String[] args) {
	// deklarasi variabel
		String nama,nim,jurusan,fakultas;

	// input
		Scanner input = new Scanner(System.in);
		System.out.println("Pengimplementasian program menggunakan input class Scanner");
		System.out.println("===Input===");
		System.out.print("Masukkan Nama : ");
		nama = input.nextLine();
		System.out.print("Masukkan NIM : ");
		nim = input.nextLine();
		System.out.print("Masukkan Jurusan : ");
		jurusan = input.nextLine();
		System.out.print("Masukkan Fakultas : ");
		fakultas = input.nextLine();

	// output
		System.out.println("===Output===\n");
		System.out.printf("Nama		: %s\n", nama);
		System.out.printf("NIM		: %s\n", nim);
		System.out.printf("Jurusan 	: %s\n", jurusan);
		System.out.printf("Fakultas	: %s\n", fakultas);

	}
}