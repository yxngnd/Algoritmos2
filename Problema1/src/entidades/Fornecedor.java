package entidades;

public class Fornecedor extends Entidade{
	private String cnpj;	
	private String nome;
	private String endereco;
	
	public Fornecedor(String cnpj, String nome, String endereco, int codigo) {
		this.codigo = codigo;
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNomeString(String nomeString) {
		this.nome = nomeString;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
