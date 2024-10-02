package task5;

public class Patternprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows =5;
		int columns =2;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 3) {
                    if (j == 2) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
	}

}
