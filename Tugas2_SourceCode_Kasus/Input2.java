import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Input2{
	public static void main(String[] args) throws IOException {
	// deklarasi Variabel
		String nama,nim,jurusan,fakultas;

	// Input
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Pengimplementasian program mengguanakan input class BufferedReader");
		System.out.println("===Input===");
		System.out.print("Masukkan Nama	: ");
		nama = input.readLine();
		System.out.print("Masukkan NIM : ");
		nim = input.readLine();
		System.out.print("Masukkan Jurusan : ");
		jurusan = input.readLine();
		System.out.print("Masukkan Fakultas : ");
		fakultas = input.readLine();

	// Output
		System.out.println("===OUTPUT===\n");
		System.out.printf("Nama		: %s\n", nama);
		System.out.printf("NIM		: %s\n", nim);
		System.out.printf("Jurusan 	: %s\n", jurusan);
		System.out.printf("Fakultas	: %s\n", fakultas);


	}
}