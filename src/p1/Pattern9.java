package p1;

public class Pattern9 {

	void pattern9(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// 1,2,3,4 ==>it is for second triangle
		for (int m = 1; m <= row - 1; m++) {
			for (int n = 1; n <= row - m; n++) {
				System.out.print(n + " ");

			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		new Pattern9().pattern9(5);
	}		
}

// i for row==========> first this
// j for column=======> then second this
// k for space========> write this after i  code..... but pehle i and j concept likhna then k se adjust
// m for row of second triangle
// n for column of second triangle

//printing mainly depends on column means j