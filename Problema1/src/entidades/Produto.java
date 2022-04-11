package entidades;

public class Produto extends Entidade{
	private String nome;
	private float preco;
	private String validade;
	
	public Produto(String nome, float preco, String validade, int codigo) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.validade = validade;
	}
	
	public String getValidade() {
		return validade;
	}
	
	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	

}
