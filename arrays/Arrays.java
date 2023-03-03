package arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] numbers = {1,2,3};
		int[] numbers2 = {4,5,6};
		
		System.out.println(numbers[1]);
		
		for(Integer number: numbers) {
			System.out.println(number);
		}
		
		for(int number: numbers2) {
			System.out.println(number);
		}
		
		System.out.println(numbers.length);
		

	}

}
