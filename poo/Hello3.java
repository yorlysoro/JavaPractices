package poo;

public class Hello3 extends Hello2 {
	
	private double number_float;

	public Hello3(int number, String msg) {
		super(number, msg);
		// TODO Auto-generated constructor stub
		
	}

	public double getNumber_float() {
		return number_float;
	}

	public void setNumber_float(double number_float) {
		this.number_float = number_float;
	}
	
	public String toString() {
		String msj = this.getMsg() + " " + this.getNumber() + " " + this.getNumber_float();
		return msj;
	}
	

}
