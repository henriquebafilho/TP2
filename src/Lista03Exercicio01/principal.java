package Lista03Exercicio01;

import java.util.*;

public class principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		SetorPessoal grupo = new SetorPessoal();
		boolean criarOutro = true;

		while (criarOutro) {
			System.out.println("Ol�! Vamos gerenciar sua empresa!");
			System.out.println("Vamos come�ar adicionando um funcion�rio.");
			System.out.println("Insira o nome do seu funcion�rio:");
			String nome = entrada.nextLine();
			System.out.println("Insira o n�mero da matr�cula do funcion�rio:");
			double matricula = entrada.nextDouble();
			System.out.println("Insira a fun��o do funcion�rio:");
			String funcao = entrada.nextLine();
			System.out.println("Insira o n�mero do departamento no qual o funcion�rio trabalha:");
			double departamento = entrada.nextDouble();
			System.out.println("Por �ltimo, insira o sal�rio do funcion�rio:");
			double salario = entrada.nextDouble();
			while (salario <= 0) {
				System.out.println("Erro. O sal�rio do funcion�rio n�o pode ser menor ou igual a zero.");
				System.out.println("Insira um sal�rio v�lido para seu funcion�rio:");
				salario = entrada.nextDouble();
			}

			Funcionario f = new Funcionario(matricula, nome, departamento, salario, funcao);
			grupo.adicionarFuncionario(f);

			// Finalizando
			System.out.println("Deseja criar outro funcion�rio? 0 - n�o/ 1 - sim");
			int c = entrada.nextInt();
			while (c < 0 || c > 1) {
				System.out.println("Erro. Insira um n�mero v�lido. 0 - n�o/ 1 - sim");
			}
			if (c == 0) {
				criarOutro = false;
			}
		}
		// Retornando as informa��es dos funcion�rios da empresa

		System.out.println("Obrigado por usar nosso sistema! At� a pr�xima!");
	}

}