package br.com.eccomerce.principal;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setId(5);
		cliente.setEmail("asd@asd");
		cliente.setFone("123");
		cliente.setNome("asd");
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Av. x");
		endereco.setBairro("asdf");
		endereco.setUf("SP");
		endereco.setCep("SHINee");
		cliente.setEndereco(endereco);
		
		System.out.println(cliente.toString());
		System.out.println("Usuário: " + cliente.getUsuario());

	}

}
