package p1;

public class Pattern7 {
	void pattern7(int row) {
		int count=1;
		for (int i=1; i<=row; i++) {
			for (int k=1; k<=row-i; k++) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=i;j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
		
	}
	void pattern7_1(int row) {
		int count=1;
		for (int i=1; i<=row; i++) {
			for (int k=1; k<=row-i; k++) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		new Pattern7().pattern7(4);
		System.out.println("================================");
		new Pattern7().pattern7_1(4);
	}
 
}
