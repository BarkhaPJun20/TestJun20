package p1;

public class Pattern2 {
	void pattern2(int row) {
		
		for (int i=1; i<=row; i++) {
			for (int j=row; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
		new Pattern2().pattern2(5);
	}

}
