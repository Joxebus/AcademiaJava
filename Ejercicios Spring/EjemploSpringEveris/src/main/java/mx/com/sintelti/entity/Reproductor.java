package mx.com.sintelti.entity;

public class Reproductor {
	
	private int noSerie;
	private String fabricante;
	
	@Override
	public String toString() {
		return this.getNoSerie()+" fabricado por "+this.getFabricante();
	}

	public int getNoSerie() {
		return noSerie;
	}

	public void setNoSerie(int noSerie) {
		this.noSerie = noSerie;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
}
