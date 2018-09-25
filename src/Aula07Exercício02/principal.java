package Aula07Exercício02;

/*Construa classes para representar os seguintes
conceitos. Implemente métodos e atributos, e utilize
relacionamentos na forma de agregação e herança,
conforme achar adequado.
2. Veículo, Carro, Bicicleta, Caminhão*/
import java.util.*;

public class principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Veiculo veiculo = new Veiculo();
		Carro carro = new Carro();
		Caminhao caminhao = new Caminhao();
		Bicicleta bike = new Bicicleta();
		boolean continuar = true;
		int tipo, qtdPassag, carga, cestinha, mala;
		String criarOutro;
		String marcaVeiculo;

		carro.setRodas(4);
		carro.setMaxPassageiros(5);
		carro.setMaxMala(100);

		caminhao.setRodas(6);
		caminhao.setMaxPassageiros(3);
		caminhao.setMaxCarga(1000);

		bike.setRodas(2);
		bike.setMaxPassageiros(2);
		bike.setMaxCestinha(10);

		// Criando um determinado veículo
		System.out.println("Insira que tipo de veículo você deseja criar:");
		System.out.println("1 - carro");
		System.out.println("2 - caminhão");
		System.out.println("3 - bicicleta");
		tipo = entrada.nextInt();
		while (tipo < 1 || tipo > 3) {
			System.out.println("Erro. Insira um número entre 1 e 3:");
			tipo = entrada.nextInt();
		}

		// Inserindo passageiros no veículo
		if (tipo == 1) {
			System.out.println("Quantos passageiros você deseja inserir no seu carro?");
		} else if (tipo == 2) {
			System.out.println("Quantos passageiros você deseja inserir no seu caminhão?");
		} else {
			System.out.println("Quantos passageiros você deseja inserir na sua bicicleta?");
		}
		qtdPassag = entrada.nextInt();

		// Se o número de passageiros for maior que a quantidade permitida no veículo
		if (tipo == 1) {
			while (qtdPassag > carro.getMaxPassageiros() || qtdPassag < 0) {
				if (qtdPassag > carro.getMaxPassageiros()) {
					System.out.println("Quantidade de passageiros excedida.");
					System.out.println("Seu carro só pode transportar 5 pessoas.");
					System.out.println("Insira um valor válido:");
					qtdPassag = entrada.nextInt();
				} else {
					System.out.println("Erro. Insira um número positivo.");
					qtdPassag = entrada.nextInt();
				}
			}
			carro.inserePassageiro(1, qtdPassag);
		} else if (tipo == 2) {
			while (qtdPassag > caminhao.getMaxPassageiros() || qtdPassag < 0) {
				if (qtdPassag > caminhao.getMaxPassageiros()) {
					System.out.println("Quantidade de passageiros excedida.");
					System.out.println("Seu caminhão só pode transportar 3 pessoas.");
					System.out.println("Insira um valor válido:");
					qtdPassag = entrada.nextInt();
				} else {
					System.out.println("Erro. Insira um número positivo.");
					qtdPassag = entrada.nextInt();
				}
			}
			caminhao.inserePassageiro(2, qtdPassag);
		} else {
			while (qtdPassag > bike.getMaxPassageiros() || qtdPassag < 0) {
				if (qtdPassag > bike.getMaxPassageiros()) {
					System.out.println("Quantidade de passageiros excedida.");
					System.out.println("Sua bicicleta só pode transportar 2 pessoas.");
					System.out.println("Insira um valor válido:");
					qtdPassag = entrada.nextInt();
				} else {
					System.out.println("Erro. Insira um número positivo.");
					qtdPassag = entrada.nextInt();
				}
			}
			bike.inserePassageiro(3, qtdPassag);
		}

		// Inserindo a marca do veiculo
		if (tipo == 1) {
			System.out.println("Insira a marca do seu carro:");
			marcaVeiculo = entrada.next();
			carro.setMarca(marcaVeiculo);
		} else if (tipo == 2) {
			System.out.println("Insira a marca do seu caminhão:");
			marcaVeiculo = entrada.next();
			caminhao.setMarca(marcaVeiculo);
		} else {
			System.out.println("Insira a marca da sua bicicleta:");
			marcaVeiculo = entrada.next();
			bike.setMarca(marcaVeiculo);
		}

		// Fazendo habilidades especiais de cada veículo
		if (tipo == 1) {
			System.out.println("Quanto (em kg) você deseja inserir na mala do seu carro? (máx = 100)");
			mala = entrada.nextInt();
			while (mala > carro.getMaxMala() || mala < 0) {
				if (mala > carro.getMaxMala()) {
					System.out.println("Erro. A capacidade da mala do seu carro foi excedida.");
					System.out.println("Insira uma quantidade de até 100kg:");
					mala = entrada.nextInt();
				} else {
					System.out.println("Erro. Insira uma quantidade positiva.");
					mala = entrada.nextInt();
				}
			}
			carro.insereMala(mala);
		} else if (tipo == 2) {
			System.out.println("Quanto de carga (em kg) você deseja inserir no seu caminhão? (máx = 1000)");
			carga = entrada.nextInt();
			while (carga > caminhao.getMaxCarga() || carga < 0) {
				if (carga > caminhao.getMaxCarga()) {
					System.out.println("Erro. A capacidade de carga do caminhão foi excedida.");
					System.out.println("Insira uma quantidade de até 1000kg:");
					carga = entrada.nextInt();
				} else {
					System.out.println("Erro. Insira uma quantidade positiva.");
					carga = entrada.nextInt();
				}
			}
			caminhao.insereCarga(carga);
		} else {
			System.out.println("Quanto (em kg) você deseja inserir na cestinha da sua bicicleta? (máx = 10)");
			cestinha = entrada.nextInt();
			while (cestinha > bike.getMaxCestinha() || cestinha < 0) {
				if (cestinha > bike.getMaxCestinha()) {
					System.out.println("Erro. A capacidade da cestinha foi excedida.");
					System.out.println("Insira uma quantidade de até 10kg:");
					cestinha = entrada.nextInt();
				} else {
					System.out.println("Erro. Insira uma quantidade positiva.");
					cestinha = entrada.nextInt();
				}
			}
			bike.insereCestinha(cestinha);
		}
		// Retornando os valores do veículo
		if (tipo == 1) {
			System.out.println("Seu carro tem " + carro.getRodas() + " rodas");
			System.out.println("Seu carro é da marca " + carro.getMarca());
			System.out.println("Seu carro tem " + carro.getPassageiros() + " passageiros");
			System.out.println("A mala do seu carro tem " + carro.getMala() + "kg de bagagem");
		} else if (tipo == 2) {
			System.out.println("Seu caminhão tem " + caminhao.getRodas() + " rodas");
			System.out.println("Seu caminhão é da marca " + caminhao.getMarca());
			System.out.println("Seu caminhão tem " + caminhao.getPassageiros() + " passageiros");
			System.out.println("Seu caminhão tem " + caminhao.getCarga() + "kg de carga");
		} else {
			System.out.println("Sua bicicleta tem " + bike.getRodas() + " rodas");
			System.out.println("Sua bicicleta é da marca " + bike.getMarca());
			System.out.println("Sua bicicleta tem " + bike.getPassageiros() + " passageiros");
			System.out.println("Sua bicicleta tem " + bike.getCestinha() + "kg na cestinha");
		}
		System.out.println("---------------------------------------");
		System.out.println("Obrigado por utilizar meu programa :D");
		System.out.println("Volte sempre ^^");
	}
}
