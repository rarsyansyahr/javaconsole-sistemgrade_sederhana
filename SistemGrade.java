import java.util.Scanner;

class SistemGrade {
	public static void main(String args[]) {

		char grade = '.';
		Scanner input = new Scanner(System.in);

		System.out.println("-------Sistem Grade Nilai -------\n");
	
		System.out.print("Masukan Nilai Anda : ");
		double nilai = input.nextDouble();

		if(nilai >= 80 && nilai <=100) {
			grade = 'A';
		} else if(nilai >= 70 && nilai <=79) {
			grade = 'B';
		} else if(nilai >= 50 && nilai <= 69) {
			grade ='C';
		} else if(nilai >= 40 && nilai <= 39) {
			grade = 'D';
		} else if(nilai <= 39) {
			grade = 'E';
		}

		System.out.println("Grade Nilai Anda adalah " + grade);
	}
}
