import javax.swing.JOptionPane;

public class Input3{
	public static void main(String[] args) {
	//	Deklarasi variabel
		String nama, nim, jurusan, fakultas;

	//	Input
		System.out.println("===Pengimplementasian program menggunakan input class JOptionPane===");
		nama = JOptionPane.showInputDialog("Nama : ");
		nim = JOptionPane.showInputDialog("NIM : ");
		jurusan = JOptionPane.showInputDialog("Jurusan : ");
		fakultas = JOptionPane.showInputDialog("Fakultas : ");

	//	Output
		System.out.println("===Output===\n");
		System.out.printf("Nama		: %s\n", nama);
		System.out.printf("NIM		: %s\n", nim);
		System.out.printf("Jurusan 	: %s\n", jurusan);
		System.out.printf("Fakultas	: %s\n", fakultas);

	}
}