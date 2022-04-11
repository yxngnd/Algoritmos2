package entidades;

import java.util.ArrayList;

public class Venda extends Entidade{
	private String dia;
	private String horario;
	private float precoTotal;
	private String modoPagamento;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	public Venda(String dia, String horario, float precoTotal, String modoPagamento, ArrayList<Item> itens, int codigo) {
		this.codigo = codigo;
		this.dia = dia;
		this.horario = horario;
		this.precoTotal = precoTotal;
		this.modoPagamento = modoPagamento;
		this.itens = itens;
	}
	
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public float getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(float precoTotal) {
		this.precoTotal = precoTotal;
	}
	public String getModoPagamento() {
		return modoPagamento;
	}
	public void setModoPagamento(String modoPagamento) {
		this.modoPagamento = modoPagamento;
	}
	public ArrayList<Item> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
}
