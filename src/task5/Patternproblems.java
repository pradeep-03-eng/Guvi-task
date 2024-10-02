package task5;

public class Patternproblems {


	public static void main(String[] args) {
		int rows=5;
	
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if (i == 5) {
                    if (j == 5) {
				System.out.print(" ");
			} else {
                    	System.out.print("* ");
                    }
				} else {
                
                    System.out.print(" ");
				}
			}
			
			System.out.println(); 
			}
		}
}

