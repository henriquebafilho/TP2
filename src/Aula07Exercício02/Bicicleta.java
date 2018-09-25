package Aula07Exercício02;

public class Bicicleta extends Veiculo {
	private int cestinha; // máximo 10kg
	private int maxCestinha;

	public void insereCestinha(int cestinha) {
		this.cestinha += cestinha;
	}

	public int getCestinha() {
		return cestinha;
	}

	public void setCestinha(int cestinha) {
		this.cestinha = cestinha;
	}

	public int getMaxCestinha() {
		return maxCestinha;
	}

	public void setMaxCestinha(int maxCestinha) {
		this.maxCestinha = maxCestinha;
	}
	
}
