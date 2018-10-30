package Aula11;

import java.util.*;

//Desenvolvido por Leonardo Vartuli Negreiros, João Victor Antunes Figueira e Henrique Borges de Almeida Filho

public class Escola {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Lista lista = new Lista();
		boolean loop = true;

		while (loop == true) {
			System.out.println("Bem-vindo ao Sistema Academico Uniaca:");
			System.out.println("Menu:");
			System.out.println("Digite 1 para cadastrar, 2 para lista de alunos, 3 para lista de professores");
			System.out.println(
					"4 para lista de disciplinas, 5 para lista de aniversários, 6 para remover cadastros ou 7 para editar disciplinas");
			int menu = scan.nextInt();
			switch (menu) {

			case 1:
				System.out.println(
						"Digite 1 para cadastrar Aluno, 2 para cadastrar Disciplina, 3 para cadastrar Professor");
				System.out.println("4 para inscrever Aluno em uma Turma, 5 para cadastrar uma Turma ou 6 para voltar");
				int escolhaCadastro = scan.nextInt();

				switch (escolhaCadastro) {

				case 1:
					System.out.println("Digite o primeiro nome (apenas) do aluno:");
					String nome = scan.nextLine();
					System.out.println("Digite o último sobrenome do aluno:");
					String sobrenome = scan.nextLine();
					System.out.println("Digite o dia da data de nascimento do aluno (apenas o dia)");
					int dia = scan.nextInt();
					System.out.println("Digite o mês da data de nascimento do aluno (apenas o mês)");
					int mes = scan.nextInt();
					System.out.println("Digite o ano da data de nascimento do aluno (apenas o ano)");
					int ano = scan.nextInt();
					System.out.println("Digite o nome do curso:");
					String curso = scan.nextLine();
					System.out.println("Digite o período de entrada do aluno:");
					String periodo = scan.nextLine();
					System.out.println("Digite a matrícula do aluno:");
					String matricula = scan.nextLine();

					Aluno aluno = new Aluno(nome, sobrenome, dia, mes, ano, curso, periodo, matricula);
					lista.adicionaLista(aluno);

					System.out.println("Esse aluno possui Professor Orientador? Responda S para sim ou N para não.");
					String confirmaOrientador = scan.nextLine();
					if (confirmaOrientador == "S") {
						String professorOrientador = scan.nextLine();
						aluno.adicionaOrientador(lista.retornaProfessor(professorOrientador));
					}
					System.out.println("Aluno " + nome + sobrenome + " cadastrado!");
					break;

				case 2:
					System.out.println("Nome da disciplina:");
					String nomeDisciplina = scan.nextLine();
					System.out.println("Código da disciplina:");
					int codigo = scan.nextInt();
					System.out.println("Ementa:");
					String ementa = scan.nextLine();
					System.out.println("Carga horaria semanal:");
					int cargaHoraria = scan.nextInt();
					System.out.println("Professor Responsavel:");
					String professorResponsavel = scan.nextLine();
					System.out.println("Crie uma turma para a disciplina:");
					System.out.println("Digite o periodo da turma:");
					String periodoTurma = scan.nextLine();
					System.out.println("Digite o nome do professor dessa turma:");
					String professorTurma = scan.nextLine();
					Turma turma = new Turma(null, periodoTurma, lista.retornaProfessor(professorTurma));
					lista.adicionaLista(turma);
					Disciplina disciplina = new Disciplina(nomeDisciplina, codigo, ementa, cargaHoraria,
							lista.retornaProfessor(professorResponsavel), turma);
					lista.adicionaLista(disciplina);
					turma.setDisciplina(lista.retornaDisciplina(nomeDisciplina));

					System.out.println(
							"Deseja adicionar um Monitor (Aluno ou Professor)? 1 para aluno, 2 para professor, N para nenhum monitor.");
					String confirmaMonitor = scan.nextLine();
					if (confirmaMonitor == "1") {
						String Monitor = scan.nextLine();
						turma.podeSerMonitor(lista.retornaAluno(Monitor));
					}
					if (confirmaMonitor == "2") {
						String Monitor = scan.nextLine();
						turma.podeSerMonitor(lista.retornaProfessor(Monitor));
					}
					System.out.println("Disciplina " + nomeDisciplina + " criada!");
					break;

				case 3:
					System.out.println("Digite o primeiro nome (apenas) do professor:");
					nome = scan.nextLine();
					System.out.println("Digite o último sobrenome do professor:");
					sobrenome = scan.nextLine();
					System.out.println("Digite o dia da data de nascimento do professor (apenas o dia)");
					dia = scan.nextInt();
					System.out.println("Digite o mês da data de nascimento do professor (apenas o mês)");
					mes = scan.nextInt();
					System.out.println("Digite o ano da data de nascimento do professor (apenas o ano)");
					ano = scan.nextInt();
					System.out.println("Digite a matrícula do professor:");
					String matriculaProfessor = scan.nextLine();
					System.out.println("Digite o departamento do professor:");
					String departamento = scan.nextLine();

					Professor professor = new Professor(nome, sobrenome, dia, mes, ano, matriculaProfessor,
							departamento);
					lista.adicionaLista(professor);
					System.out.println("Professor " + nome + sobrenome + " cadastrado!");
					break;

				case 4:
					System.out.println("Digite o primeiro nome (apenas) do aluno:");
					nome = scan.nextLine();
					System.out.println("Digite o último sobrenome do aluno:");
					sobrenome = scan.nextLine();
					System.out.println("Digite a disciplina que o aluno deseja entrar:");
					nomeDisciplina = scan.nextLine();
					String nomelista = nome + sobrenome;
					lista.retornaDisciplina(nomeDisciplina).getTurma().inscreveAluno(lista.retornaAluno(nomelista));

					break;

				case 5:
					System.out.println("Digite o periodo da turma:");
					periodoTurma = scan.nextLine();
					System.out.println("Digite o nome do professor dessa turma:");
					professorTurma = scan.nextLine();
					System.out.println("Digite a disciplina da turma: ");
					nomeDisciplina = scan.nextLine();
					Turma turmaAdicional = new Turma(lista.retornaDisciplina(nomeDisciplina), periodoTurma,
							lista.retornaProfessor(professorTurma));
					lista.adicionaLista(turmaAdicional);

					System.out.println(
							"Deseja adicionar um Monitor (Aluno ou Professor)? 1 para aluno, 2 para professor, N para nenhum monitor.");
					confirmaMonitor = scan.nextLine();
					if (confirmaMonitor == "1") {
						String Monitor = scan.nextLine();
						turmaAdicional.podeSerMonitor(lista.retornaAluno(Monitor));
					}
					if (confirmaMonitor == "2") {
						String Monitor = scan.nextLine();
						turmaAdicional.podeSerMonitor(lista.retornaProfessor(Monitor));
					}

					System.out.println("Turma de " + nomeDisciplina + " cadastrada com sucesso!");
					break;

				default:
					System.out.println("Voltando...");
					break;

				}

				break;
			case 2:
				lista.mostraAlunos();
				break;
			case 3:
				lista.mostraProfessores();
				break;
			case 4:
				lista.mostraDisciplinas();
				break;
			case 5:
				lista.mostraAniversarios();
				break;
			case 6:
				System.out.println(
						"Digite 1 para remover aluno, 2 para remover professor, 3 para remover disciplina, 4 para remover turma ou 5 para voltar.");
				int escolhaRemocao = scan.nextInt();

				switch (escolhaRemocao) {
				case 1:
					System.out.println("Digite o nome e sobrenome do aluno que deseja remover do sistema:");
					lista.mostraAlunos();
					String resposta1 = scan.nextLine();
					System.out.println("Tem certeza? Responda S para sim ou N para não.");
					String resposta = scan.nextLine();
					if (resposta == "S") {
						lista.removeAluno(resposta1);
					} else {
						System.out.println("Voltando...");
					}

					break;

				case 2:
					System.out.println("Digite o nome e sobrenome do professor que deseja remover do sistema:");
					lista.mostraProfessores();
					resposta1 = scan.nextLine();
					System.out.println("Tem certeza? Responda S para sim ou N para não.");
					resposta = scan.nextLine();
					if (resposta == "S") {
						lista.removeProfessor(resposta1);
					} else {
						System.out.println("Voltando...");
					}

					break;

				case 3:
					System.out.println("Digite o nome da disciplina que deseja remover do sistema:");
					lista.mostraDisciplinas();
					resposta1 = scan.nextLine();
					System.out.println("Tem certeza? Responda S para sim ou N para não.");
					resposta = scan.nextLine();
					if (resposta == "S") {
						lista.removeDisciplina(resposta1);
						System.out.println("Disciplina " + resposta1 + " Removida.");
					} else {
						System.out.println("Voltando...");
					}

					break;
				case 4:
					System.out.println("Digite o nome do professor dessa turma:");
					String professorTurma = scan.nextLine();
					System.out.println("Digite o periodo da turma:");
					String periodoTurma = scan.nextLine();
					lista.removeTurma(lista.retornaProfessor(professorTurma), periodoTurma);
					System.out.println("Turma Removida.");
					break;
				default:
					System.out.println("Voltando...");
					break;
				}
			case 7:
				System.out.println("Digite o nome da disciplina que deseja alterar");
				lista.mostraDisciplinas();
				String resposta1 = scan.nextLine();
				System.out.println(
						"Digite 'ementa' para alterar a ementa ou 'carga horaria' para alterar a carga horária semanal:");
				String resposta = scan.nextLine();
				if (resposta == "ementa") {
					System.out.println("Ementa atual:");
					System.out.println(lista.retornaDisciplina(resposta1).getEmenta());
					System.out.println("Digite a nova ementa:");
					String ementa = scan.nextLine();
					lista.retornaDisciplina(resposta1).setEmenta(ementa);
					System.out.println("Ementa alterada!");

				} else if (resposta == "carga horaria") {
					System.out.println("Carga horária semanal atual:");
					System.out.println(lista.retornaDisciplina(resposta1).getCargaHoraria());
					System.out.println("Digite a nova carga horária semanal:");
					int cargaHoraria = scan.nextInt();
					lista.retornaDisciplina(resposta1).setCargaHoraria(cargaHoraria);
					System.out.println("Carga horária semanal alterada!");

				} else {
					System.out.println("Voltando...");
				}

				break;
			}
		}
	}
}
