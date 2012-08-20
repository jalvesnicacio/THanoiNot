package problema;

public class Disco {
	
	private int diametro;
	private String nome;
	
	
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Disco(String nome, int diametro) {
		this.nome = nome;
		this.diametro = diametro;
	
	}
	
	

}
