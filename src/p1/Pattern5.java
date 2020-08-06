package p1;

public class Pattern5 {
	
	void pattern5(int row) {
		int count=1;
		for (int i=1; i<=row;i++) {
			for (int j=row; j>=i;j--) {
				System.out.print(count+"   ");
				count++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Pattern5().pattern5(5);
	}
}	