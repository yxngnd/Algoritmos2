package entidades;

import java.util.ArrayList;

public class Item extends Entidade{
	private String nome;
	private  String descricao;
	private  float preco;
	private  String categoria;
	private  ArrayList<Produto> ingredientes = new ArrayList<Produto>();
	
	public Item(String nome, String descricao, float preco, String categoria, ArrayList<Produto> ingredientes, int codigo) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
		this.ingredientes = ingredientes;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public ArrayList<Produto> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(ArrayList<Produto> ingredientes) {
		this.ingredientes = ingredientes;
	}
}
