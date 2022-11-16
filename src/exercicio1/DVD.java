package exercicio1;

public class DVD extends Midia {
	int nFaixas;
	
	public DVD() {
		super();
	};
	
	public DVD(int codigo, double preco, String nome, int faixas) {
		super(codigo, preco, nome);
		
		this.nFaixas = faixas;
	}
	
	public String getTipo() {
		return "DVD";
	}
	
	public String getDetalhes() {
		return "codigo: " + codigo + " preco: " + preco + " nome: " + nome + " faixas: " + " nFaixas" + ".";
	}
	
	public void setFaixas() {
		this.nFaixas = 00;
	}
	
	public void setFaixas(int faixas) {
		this.nFaixas = faixas;
	}
	
	public String getFaixas() {
		return String.valueOf(this.nFaixas);
	}
}
