package br.com.ecommerce.modelo;

public class CD extends Produto {
	private String artista;
	private String totalFaixas;
	private String gravadora;
	
	
	
	public CD() {
		super();
	}

	public CD(int i, String d, float vc, float vv, int q, String artista, String totalFaixas, String gravadora) {
		super(i, d, vc, vv, q);
		this.artista = artista;
		this.totalFaixas = totalFaixas;
		this.gravadora = gravadora;
	}
	
	
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getTotalFaixas() {
		return totalFaixas;
	}
	public void setTotalFaixas(String totalFaixas) {
		this.totalFaixas = totalFaixas;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	@Override
	public String toString() {
		return "CD [artista=" + artista + 
				", totalFaixas=" + totalFaixas + 
				", gravadora=" + gravadora + 
				", " + super.toString() + "]";
	}

	public void setAll(int i, String d, float vc, float vv, int q, String artista, String totalFaixas, String gravadora) {
		super.setAll(i, d, vc, vv, q);
		this.artista = artista;
		this.totalFaixas = totalFaixas;
		this.gravadora = gravadora;
	}
	
	
	
	
}
