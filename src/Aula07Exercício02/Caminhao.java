package Aula07Exerc�cio02;

public class Caminhao extends Veiculo {
	private int carga; // m�ximo 1000kg
	private int maxCarga;

	public void insereCarga(int carga) {
		this.carga += carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getMaxCarga() {
		return maxCarga;
	}

	public void setMaxCarga(int maxCarga) {
		this.maxCarga = maxCarga;
	}
	
}

