package Lista03Exercicio01;

import java.util.*;

public class principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		SetorPessoal grupo = new SetorPessoal();
		boolean criarOutro = true;

		while (criarOutro) {
			System.out.println("Olá! Vamos gerenciar sua empresa!");
			System.out.println("Vamos começar adicionando um funcionário.");
			System.out.println("Insira o nome do seu funcionário:");
			String nome = entrada.nextLine();
			System.out.println("Insira o número da matrícula do funcionário:");
			double matricula = entrada.nextDouble();
			System.out.println("Insira a função do funcionário:");
			String funcao = entrada.nextLine();
			System.out.println("Insira o número do departamento no qual o funcionário trabalha:");
			double departamento = entrada.nextDouble();
			System.out.println("Por último, insira o salário do funcionário:");
			double salario = entrada.nextDouble();
			while (salario <= 0) {
				System.out.println("Erro. O salário do funcionário não pode ser menor ou igual a zero.");
				System.out.println("Insira um salário válido para seu funcionário:");
				salario = entrada.nextDouble();
			}

			Funcionario f = new Funcionario(matricula, nome, departamento, salario, funcao);
			grupo.adicionarFuncionario(f);

			// Finalizando
			System.out.println("Deseja criar outro funcionário? 0 - não/ 1 - sim");
			int c = entrada.nextInt();
			while (c < 0 || c > 1) {
				System.out.println("Erro. Insira um número válido. 0 - não/ 1 - sim");
			}
			if (c == 0) {
				criarOutro = false;
			}
		}
		// Retornando as informações dos funcionários da empresa

		System.out.println("Obrigado por usar nosso sistema! Até a próxima!");
	}

}