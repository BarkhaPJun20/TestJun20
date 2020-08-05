package p1;

public class Pattern1 {
	
	void pattrn1(int row) {
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		new Pattern1().pattrn1(5);
	}

}
