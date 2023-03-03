package loops;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 10;
		
		do {
			System.out.println(number1);
			number1 -= 1;
		}while(number1 != 0);
		
		number1 = 10;
		
		while(number1 != 0) {
			System.out.println(number1);
			number1 -= 1;
		}
		
		for(;number1 < 10; number1++) {
			System.out.println(number1);
		}
		
		

	}

}
