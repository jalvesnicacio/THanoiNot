import problema.Disco;
import problema.EstadoTH;
import problema.Torre;


public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Disco disco1 = new Disco("d1",30);
		Disco disco2 = new Disco("d2",20);
		Disco disco3 = new Disco("d3",10);
		
		Torre t1 = new Torre();
		t1.adiciona(disco1);
		t1.adiciona(disco2);
		t1.adiciona(disco3);
		
		Torre t2 = new Torre();
		Torre t3 = new Torre();
		
		EstadoTH eInicial = new EstadoTH(t1,t2,t3);
		EstadoTH eFinal = new EstadoTH(t3,t2,t1);
		
		System.out.println("Estado inicial:");
		System.out.println(eInicial.toString());
		
		System.out.println("Estado final");
		System.out.println(eFinal.toString());

	}

}
