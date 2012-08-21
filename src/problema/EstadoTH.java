package problema;

public class EstadoTH {
	private Torre torre1;
	private Torre torre2;
	private Torre torre3;
	
	public EstadoTH(Torre torre1, Torre torre2, Torre torre3) {
		this.torre1 = torre1;
		this.torre2 = torre2;
		this.torre3 = torre3;
	}
	
	public String toString(){
		return "Estado = [torre1" + torre1.toString() 
				+ ", torre2" + torre2.toString() 
				+ ", torre3" + torre3.toString() + "]";
	}

	public Torre getTorre1() {
		return torre1;
	}

	public Torre getTorre2() {
		return torre2;
	}

	public Torre getTorre3() {
		return torre3;
	}
	
	

}
