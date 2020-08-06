package p1;

public class Pattern10 {
	
	void pattern10(int row) {
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=row-i+1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}		
	}
	void pattern10_1(int row) {
		for (int i=1; i<=row; i++) {
			for (int j=row; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
		
	
	public static void main(String[] args) {
		new Pattern10().pattern10(7);
		System.out.println("===============================");
		new Pattern10().pattern10_1(7);
	}

}