
public class Carro extends Veiculo{
	private int mala; // máximo 100kg
	private int maxMala;

	public void insereMala(int mala) {
		this.mala += mala;
	}

	public int getMala() {
		return mala;
	}

	public void setMala(int mala) {
		this.mala = mala;
	}

	public int getMaxMala() {
		return maxMala;
	}

	public void setMaxMala(int maxMala) {
		this.maxMala = maxMala;
	}
	
}
