package Aula07Exercício02;

public class Veiculo {
	private int qtdRodas;
	private int qtdPassageiros;
	private int maxPassageiros;
	private String marca = new String();

	public void inserePassageiro(int veiculo, int passageiros) {
		this.qtdPassageiros += passageiros;
		if (veiculo == 1) {
			System.out.println("Seu carro tem " + this.qtdPassageiros + " passageiros agora");
		} else if (veiculo == 2) {
			System.out.println("Seu caminhão tem " + this.qtdPassageiros + " passageiros agora");
		} else if (veiculo == 3) {
			System.out.println("Sua bicicleta tem " + this.qtdPassageiros + " passageiros agora");
		}
	}

	// Get and Set
	public int getRodas() {
		return qtdRodas;
	}

	public void setRodas(int rodas) {
		this.qtdRodas = rodas;
	}

	public int getPassageiros() {
		return qtdPassageiros;
	}

	public void setPassageiros(int passageiros) {
		this.qtdPassageiros = passageiros;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMaxPassageiros() {
		return maxPassageiros;
	}

	public void setMaxPassageiros(int maxPassageiros) {
		this.maxPassageiros = maxPassageiros;
	}

}

