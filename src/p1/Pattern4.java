package p1;

public class Pattern4 {
	void pattern4(int row) {
		int count=1;
		for (int i=1; i<=row; i++) {
			for (int j=1;j<=i; j++) {
				System.out.print(count+ "  ");
				count++;
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		new Pattern4().pattern4(4);
	}
}