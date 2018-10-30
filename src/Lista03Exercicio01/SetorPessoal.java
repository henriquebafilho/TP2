package Lista03Exercicio01;

import java.util.*;

public class SetorPessoal {
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();

	// (a) adicionar um funcionário;
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
		System.out.println("A folha de pagamento da empresa é R$" + folha);
	}

	// (d) informar o funcionário que recebe o maior salário;
	public void maiorSalario(ArrayList<Funcionario> funcionarios) {
		ArrayList<Funcionario> funs = new ArrayList<>();
		double maiorSalario = 0;

		for (Funcionario fun : this.funcionarios) {
			if (fun.getSalario() > maiorSalario) {
				funs.add(fun);
			}
		}
		// imprimindo se apenas um funcionário tiver o maior salário...
		if (funs.size() == 1) {
			System.out.println("O funcionário com maior salário é o " + funs.get(0).getNome() + " que ganha R$"
					+ funs.get(0).getSalario());
		}
		// se mais de um funcionário ganhar o maior salário...
		else {
			System.out.println(
					"Os funcionários com maior salário são " + funs + ", que ganham R$" + funs.get(0).getSalario());
		}
	}

}
