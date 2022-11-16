package exercicio1;

public class Midia {
	int codigo;
	double preco;
	String nome;
	
	public Midia() {};
	
	public Midia(int codigo, double preco, String nome) {
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
	}
	
	public String getTipo() {
		return "Midia";
	}
	
	public String getDetalhes() {
		return "codigo: " + codigo + " preco: " + preco + " nome: " + nome + ".";
	}
	
	public void printDados() {
		System.out.printf("%s \n %s",getTipo(), getDetalhes());
	}
	
	public void setCodigo() {
		this.codigo = 0000;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setPreco() {
		this.preco = 00;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setNome() {
		this.nome = "";
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigo() {
		return String.valueOf(this.codigo);
	}
	
	public String getPreco() {
		return String.valueOf(this.preco);
	}

	public String getNome() {
		return this.nome;
	}
}
