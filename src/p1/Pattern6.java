package p1;

public class Pattern6 {
	void pattern6(int row) {
		for (int i=1; i<=row;  i++) {          //for row
			for (int k=1; k<=row-i;k++) {      //for space
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {        //for column
				System.out.print(j);
			}
			System.out.println();
		}
	}		
	public static void main(String[] args) {
		new Pattern6().pattern6(5);
	}
}		