package poo;

public class Hello1 {
	private int number;
	private String msg;
	
	
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
	
