package br.com.ecommerce.modelo;

public class Venda {
	private int numero;
	private Cliente cliente;
	private Produto produto;
	private float total;
	private Pagamento pagamento;
	
	public Venda() {
		super();
	}

	public Venda(int numero, Cliente cliente, Produto produto, float total, Pagamento pagamento) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.produto = produto;
		this.total = total;
		this.pagamento = pagamento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	@Override
	public String toString() {
		return "Venda [numero=" + numero + ", cliente=" + cliente + ", produto=" + produto + ", total=" + total
				+ ", pagamento=" + pagamento + "]";
	};
	
	
}
