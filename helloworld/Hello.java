package helloworld;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg = "Hello World!";
		Integer number = 1;
		Float number2 = (float) 2.35;
		Double number3 = 3.36;
		final int constant = 4;
		
		System.out.printf("%s, %d, %f, %f, %d\n", msg, number, number2, number3,
				constant);
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d", i);
		}
		

	}

}
