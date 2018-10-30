package Lista03Exercicio01;

import java.util.*;

public class SetorPessoal {
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();

	// (a) adicionar um funcion�rio;
	public void adicionarFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		System.out.println("Funcionario " + funcionario.getNome() + " adicionado com sucesso!");
	}

	// (c) calcular o valor total da folha de pagamento;
	public void calculaFolhaDePagamento(ArrayList<Funcionario> funcionarios) {
		double folha = 0;

		for (Funcionario fun : this.funcionarios) {
			folha += fun.getSalario();
		}
		System.out.println("A folha de pagamento da empresa � R$" + folha);
	}

	// (d) informar o funcion�rio que recebe o maior sal�rio;
	public void maiorSalario(ArrayList<Funcionario> funcionarios) {
		ArrayList<Funcionario> funs = new ArrayList<>();
		double maiorSalario = 0;

		for (Funcionario fun : this.funcionarios) {
			if (fun.getSalario() > maiorSalario) {
				funs.add(fun);
			}
		}
		// imprimindo se apenas um funcion�rio tiver o maior sal�rio...
		if (funs.size() == 1) {
			System.out.println("O funcion�rio com maior sal�rio � o " + funs.get(0).getNome() + " que ganha R$"
					+ funs.get(0).getSalario());
		}
		// se mais de um funcion�rio ganhar o maior sal�rio...
		else {
			System.out.println(
					"Os funcion�rios com maior sal�rio s�o " + funs + ", que ganham R$" + funs.get(0).getSalario());
		}
	}

}
