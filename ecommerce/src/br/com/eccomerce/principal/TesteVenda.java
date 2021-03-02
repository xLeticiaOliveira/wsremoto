package br.com.eccomerce.principal;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Pagamento;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import util.Magica;

public class TesteVenda {

	public static void main(String[] args) {
		
		Venda venda = new Venda(
				Magica.i("ID venda"),
				new Cliente(
						Magica.i("ID Cliente"),
						Magica.s("Nome Cliente"),
						Magica.s("Email Cliente"),
						Magica.s("Telefone"),
						new Endereco(
								Magica.s("Logradouro"),
								Magica.s("Número"),
								Magica.s("Complemento"),
								Magica.s("Bairro"),
								Magica.s("Cidade"),
								Magica.s("UF"),
								Magica.s("CEP")
								)
						),
				new Produto(
						Magica.i("ID Produto"),
						Magica.s("Produto X"),
						Magica.f("Valor Compra"),
						Magica.f("Valor Venda"),
						Magica.i("Quantidade")
						),
				Magica.f("Total Venda"),
				new Pagamento(
						Magica.f("Valor"),
						Magica.s("Data"),
						Magica.s("Forma de pagamento")
						)
				);
		
		System.out.println("Venda: " + venda);
		System.out.println("Forma de pagamento: " + venda.getPagamento().getForma());
		System.out.println("Nome do cliente: " + venda.getCliente().getNome());
		System.out.println("Estado do endereço do cliente: " + venda.getCliente().getEndereco().getUf());
		System.out.println("Descrição do produto: " + venda.getProduto().getDescricao());
	}

}
