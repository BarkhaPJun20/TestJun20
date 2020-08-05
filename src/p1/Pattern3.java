package p1;

public class Pattern3 {
	void pattern3(int row) {
		for (int i=1; i<=row ; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		new Pattern3().pattern3(10);
	}

}
