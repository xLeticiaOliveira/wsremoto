package br.com.eccomerce.principal;

import br.com.ecommerce.modelo.Produto;

public class TesteProduto2 {

	public static void main(String[] args) {
		Produto p = new Produto(
				15,
				"churros",
				5.0f,
				8.0f,
				5
				);
		
		System.out.println(p.getDescricao());

	}

}
