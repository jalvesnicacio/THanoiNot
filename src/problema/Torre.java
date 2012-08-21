package problema;

import java.util.LinkedList;
import java.util.List;

public class Torre {
	
	private List<Disco> discos = new LinkedList<Disco>();
	private int indice = -1;
	
	public void adiciona(Disco disco){
		this.discos.add(disco);
		this.indice ++;
	}
	
	public Disco remove(){
		Disco d = null;
		if (! this.discos.isEmpty()){
			d = this.discos.remove(indice);
			this.indice--;
		}
		return d;
	}
	
	public Disco getTop(){
		return this.discos.get(indice);
	}
	
	public String toString(){
		String nomeDiscos = "( ";
		for (Disco d : this.discos) {
			nomeDiscos += d.getNome() + " ";
		}
		nomeDiscos += ")";
		return nomeDiscos;
	}
	

}


