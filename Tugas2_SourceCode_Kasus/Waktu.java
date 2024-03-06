import java.util.Scanner;

public class Waktu{

	public static void main(String[] args) {
	//	Deklarasi Variabel
		int tDetik, tMenit, tJam, detikS, menitS, jamS;

	//	Input Program
		System.out.println("===Input===");
		Scanner inputUser = new Scanner(System.in);
		System.out.print("Masukkan total detik: ");
		tDetik = inputUser.nextInt();

	//	Kamus Program
		detikS = tDetik % 60;
		tMenit = tDetik / 60;
		menitS = tMenit % 60;
		tJam = tMenit / 60;
		jamS = tJam % 24;

	//	Output
		System.out.print("\n===Output===");
		System.out.printf("%n" + "%s : %s : %s", jamS, menitS, detikS);

	}
}