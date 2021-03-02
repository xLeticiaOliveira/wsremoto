package br.com.eccomerce.principal;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;

public class TesteCliente2 {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(
				6,
				"CLEBERSON",
				"regina@gama.com.br",
				"1111-2222",
				new Endereco (
						"Evenida",
						"77",
						"",
						"Itaquera",
						"São Paulo",
						"SP",
						"12345-123"
						)
				);
		
		System.out.println(cliente);
		System.out.println(cliente.getEndereco().getNumero());
	}
}
