package br.com.ecommerce.modelo;

/*
 * Design Pattern - Compilado com as melhores pr�ticas para OO
 * DTO (Data Transfer Object) // Beans // TO
 * Recomenda��es:
 * 1� TODOS os atributos devem ser privados
 * 2� CADA atributo deve ter um get and set
 * 3� Toda classe javabeans deve possuir no minimo dois construtores
 *  - construtor vazio
 *  - construtor com todos os atributos de parametro (cheio)
 */

public class Produto {
	private int id;
	private String descricao;
	private float valorCompra;
	private float valorVenda;
	private int qtde;

	public Produto() {
		
	}
	
	public Produto(int i, String d, float vc, float vv, int q) {
		id=i;
		descricao=d;
		valorCompra=vc;
		valorVenda=vv;
		qtde=q;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescri��o(String descri��o) {
		this.descricao = descri��o;
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public float getTotalCompra() {
		return valorCompra * qtde;
	}

	public float getDesconto() {
		return valorVenda * 0.9f;
	}

	public String getResumo() {
		return "Descri��o: " + descricao + "\nValor da venda: " + valorVenda + "\nQuantidade: " + qtde;
	}

	public void setAll(int id, String descricao, float valorCompra, float valorVenda, int qtde) {
		this.id = id;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.qtde = qtde;
	}

	public String verificarEstoque() {
		if (qtde > 10) {
			return "Estoque alto";
		} else if (qtde <= 10 && qtde >= 5) {
			return "Estoque medio";
		} else {
			return "Estoque baixo";
		}
	}

	public void ajustarValores(float porcentagem) {
		valorCompra *= porcentagem / 100;
		valorVenda *= porcentagem / 100;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valorCompra=" + valorCompra + ", valorVenda="
				+ valorVenda + ", qtde=" + qtde + "]";
	}
	
	
}
