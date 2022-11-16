package exercicio1;

public class CD extends Midia{
	int nMusicas;
	
	public CD() {
		super();
	};
	
	public CD(int codigo, double preco, String nome, int musicas) {
		super(codigo, preco, nome);
		this.nMusicas = musicas;
	}
	
	public String getTipo() {
		return "CD";
	}
	
	public String getDetalhes() {
		return "codigo: " + codigo + " preco: " + preco + " nome: " + nome + " musicas: " + nMusicas + ".";
	}
	
	public void setMusicas() {
		this.nMusicas = 00;
	}
	
	public void setMusicas(int musicas) {
		this.nMusicas = musicas;
	}
	
	public String getMusicas() {
		return String.valueOf(this.nMusicas);
	}
}
