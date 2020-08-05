package p1;

public class Pattern8 {
	void pattern8(int row) {
		
		for (int i=1; i<=row; i++) {
			for (int k=1; k<=i-1; k++) {
				System.out.print(" ");
			}
			for (int j=row; j>=i; j--) {
				
				System.out.print("$");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Pattern8().pattern8(5);
		
	}
}	