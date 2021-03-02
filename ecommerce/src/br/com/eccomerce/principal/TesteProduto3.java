package br.com.eccomerce.principal;

import br.com.ecommerce.modelo.CD;
import br.com.ecommerce.modelo.Livro;
import br.com.ecommerce.modelo.Produto;
import util.Magica;

public class TesteProduto3 {

	public static void main(String[] args) {
		Produto produto = null;	
		
		char resposta = Magica.s("Digite <L> para Livro ou qualquer outra coisa para CD").charAt(0);
		
		if (resposta=='L') {
			produto = new Livro(
					Magica.i("ID"),
					Magica.s("Descricao"),
					Magica.f("Valor Compra"),
					Magica.f("Valor Venda"),
					Magica.i("Qtde"),
					Magica.s("Gramatura"),
					Magica.s("Autor"),
					Magica.s("Editora")
					);
		}
		else {
			produto = new CD(
					Magica.i("ID"),
					Magica.s("Descricao"),
					Magica.f("Valor Compra"),
					Magica.f("Valor Venda"),
					Magica.i("Qtde"),
					Magica.s("Artista"),
					Magica.s("Total faixas"),
					Magica.s("Gravadora")
					);
		}
		System.out.println(produto);
		
	}

}
