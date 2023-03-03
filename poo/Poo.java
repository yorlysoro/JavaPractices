package poo;

public class Poo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello1 hello1 = new Hello1();
		Hello2 hello2 = new Hello2(15, "Hello2");
		
		hello1.setMsg("Hello1");
		hello1.setNumber(12);
		
		System.out.println(hello1.getMsg());
		System.out.println(hello1.getNumber());
		System.out.println(hello2);
		
		Hello3 hello3 = new Hello3(25, "Hello3");
		hello3.setNumber_float(14.25);
		System.out.println(hello3);
	}

}
