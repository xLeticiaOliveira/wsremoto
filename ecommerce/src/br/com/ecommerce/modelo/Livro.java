package br.com.ecommerce.modelo;

public class Livro extends Produto {
	public String gramatura;
	public String autor;
	public String editora;
	
	
	public Livro() {
		super();
	}

	public Livro(int i, String d, float vc, float vv, int q, String gramatura, String autor, String editora) {
		super(i, d, vc, vv, q);
		this.gramatura = gramatura;
		this.autor = autor;
		this.editora = editora;
	}
	
	public String getGramatura() {
		return gramatura;
	}
	public void setGramatura(String gramatura) {
		this.gramatura = gramatura;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Livro [gramatura=" + gramatura + ", autor=" + autor + ", editora=" + editora + super.toString() + "]";
	}

	public void setAll(int i, String d, float vc, float vv, int q, String gramatura, String autor, String editora) {
		super.setAll(i, d, vc, vv, q);
		this.gramatura = gramatura;
		this.autor = autor;
		this.editora = editora;
	}
	
	
	
	
	
	
	
	
}
