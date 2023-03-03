package poo;

public class Hello2 {
	private int number;
	private String msg;
	
	public Hello2(int number, String msg) {
		this.setMsg(msg);
		this.setNumber(number);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String toString() {
		String msj = this.msg + " " + this.number;
		return msj;
	}
}
