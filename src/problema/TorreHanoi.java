package problema;

public class TorreHanoi {
	
	private EstadoTH estadoi;
	private EstadoTH estadof;
	
	public TorreHanoi() {
		Disco disco1 = new Disco("d1",30);
		Disco disco2 = new Disco("d2",20);
		Disco disco3 = new Disco("d3",10);
		
		Torre t1 = new Torre();
		t1.adiciona(disco1);
		t1.adiciona(disco2);
		t1.adiciona(disco3);
		
		Torre t2 = new Torre();
		Torre t3 = new Torre();
		
		estadoi = new EstadoTH(t1,t2,t3);
		estadof = new EstadoTH(t3,t2,t1);
	}
	
	//Conjunto de ações
	public EstadoTH torre1_torre2(EstadoTH estado){
		
		Disco topA = estado.getTorre1().getTop();
		Disco topB = estado.getTorre2().getTop();
		
		if(topA.getDiametro() < topB.getDiametro() & topA != null){
			estado.getTorre2().adiciona(estado.getTorre1().remove());
		}
		
		return null;
		
	}
	
	
	//Método sucessor (retorna uma lista de estados gerados)

}
