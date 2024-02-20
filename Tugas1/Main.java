import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		int totalDetik, totalMenit, totalJam;
		int detikSekarang, menitSekarang, jamSekarang;

		System.out.print("Masukkan total detik = ");
		totalDetik = input1.nextInt();

		detikSekarang = totalDetik % 60;
		System.out.println("Detik sekarang = " + detikSekarang);
		totalMenit = totalDetik / 60;
		System.out.println("Total menit = " + totalMenit);
		menitSekarang = totalMenit % 60;
		System.out.println("Menit sekarang = " + menitSekarang);
		totalJam = totalMenit / 60;
		System.out.println("Total jam = " + totalJam);
		jamSekarang = totalJam % 24;
		System.out.println("Jam sekarang = " + jamSekarang);
		System.out.println(jamSekarang + ":" + menitSekarang + ":" + detikSekarang);
	}
}
