package p1;

public class Pattern11 {
	
	void pattern11(int row) {
		for (int i=1; i<=row; i++) {
			for (int j=row; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//second triangle... starting 7 6
		for (int m=1; m<=row-1; m++) {
			for (int n=row; n>=row-m; n-- ) {
				System.out.print(n+" ");
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Pattern11().pattern11(7);
	}
}