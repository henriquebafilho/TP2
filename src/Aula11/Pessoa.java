package Aula11;

import java.util.*;

//Desenvolvido por Leonardo Vartuli Negreiros, João Victor Antunes Figueira e Henrique Borges de Almeida Filho

//classe auxiliar (pai)
public class Pessoa {
	private String nome;
	private String sobrenome;
	private String nomelista;
	private int dia;
	private int mes;
	private int ano;
	private String login;

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public String getLogin() {
		return login;
	}

	public String getNome() {
		return nomelista;
	}

	Pessoa(String nome, String sobrenome, int dia, int mes, int ano) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		login = nome + sobrenome;
		login += "@uniriotec.br";
		nomelista = nome + sobrenome;
	}

}

// classe principal
class Aluno extends Pessoa {
	private String matriculaAluno;
	private String curso;
	private String periodo;
	private Professor professorOrientador;

	Aluno(String nome, String sobrenome, int dia, int mes, int ano, String curso, String periodo,
			String matriculaAluno) {
		super(nome, sobrenome, dia, mes, ano);
		this.curso = curso;
		this.periodo = periodo;
		this.matriculaAluno = matriculaAluno;
		System.out.println("CRIEI O ALUNO");

	}

	public void adicionaOrientador(Professor professor) {
		professorOrientador = professor;
	}

	public Professor getProfessorOrientador() {
		return professorOrientador;
	}

}

// classe principal
class Professor extends Pessoa {
	private String matriculaProfessor;
	private String departamento;

	public String getMatriculaProfessor() {
		return matriculaProfessor;
	}

	Professor(String nome, String sobrenome, int dia, int mes, int ano, String matriculaProfessor,
			String departamento) {
		super(nome, sobrenome, dia, mes, ano);
		this.matriculaProfessor = matriculaProfessor;
		this.departamento = departamento;

	}
}

// classe principal
class Disciplina {
	private String nome;
	private int codigo;
	private String ementa;
	private int cargaHoraria;
	private Professor professorResponsavel;
	private Turma turma;

	Disciplina(String nome, int codigo, String ementa, int cargaHoraria, Professor professor, Turma turma) {
		this.cargaHoraria = cargaHoraria;
		this.codigo = codigo;
		this.ementa = ementa;
		this.nome = nome;
		professorResponsavel = professor;
		this.turma = turma;
	}

	public void setProfessorResponsavel(Professor professorResponsavel) {

		this.professorResponsavel = professorResponsavel;
	}

	public Professor getProfessorResponsavel() {
		return professorResponsavel;
	}

	public Turma getTurma() {
		return turma;
	}

	public String getNome() {
		return nome;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}

class Monitor {
	private Aluno alunoMonitor;
	private Professor professorMonitor;

	Monitor(Aluno alunoMonitor) {
		this.alunoMonitor = alunoMonitor;
	}

	Monitor(Professor professorMonitor) {
		this.professorMonitor = professorMonitor;
	}

	public Aluno getAlunoMonitor() {
		return alunoMonitor;
	}

	public void setAlunoMonitor(Aluno alunoMonitor) {
		this.alunoMonitor = alunoMonitor;
	}

	public Professor getProfessorMonitor() {
		return professorMonitor;
	}

	public void setProfessorMonitor(Professor professorMonitor) {
		this.professorMonitor = professorMonitor;
	}

}

// classe principal
class Turma {
	private ArrayList<Aluno> alunosTurma;
	private Disciplina disciplina;
	private String periodoTurma;
	private Professor professorTurma;
	private Monitor monitor;

	Turma(Disciplina disciplina, String periodoTurma, Professor professorTurma) {
		alunosTurma = new ArrayList<>();
		this.disciplina = disciplina;
		this.periodoTurma = periodoTurma;
		this.professorTurma = professorTurma;
	}

	public boolean checaAlunosTurma(Aluno aluno) {
		for (int i = alunosTurma.size(); i >= 0; i--) {
			if (alunosTurma.get(i) == aluno)
				;
			return true;
		}
		return false;
	}

	public Professor getProfessorTurma() {
		return professorTurma;
	}

	public String getPeriodoTurma() {
		return periodoTurma;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void associarMonitor(Aluno aluno) {
		monitor.setAlunoMonitor(aluno);
	}

	public void associarMonitor(Professor professor) {
		monitor.setProfessorMonitor(professor);
	}

	public void inscreveAluno(Aluno aluno) {
		boolean confirmaAluno = true;
		for (int i = 0; i <= alunosTurma.size(); i++) {
			if (alunosTurma.get(i) == aluno) {
				confirmaAluno = false;
				System.out.println("Erro");
				break;
			}
		}
		if (confirmaAluno) {
			setAluno(aluno);
			System.out.println("Sucesso!");
		}
	}

	public void setAluno(Aluno aluno) {
		alunosTurma.add(aluno);
	}

	public void podeSerMonitor(Aluno aluno) {
		if (disciplina.getProfessorResponsavel() == aluno.getProfessorOrientador()) {
			associarMonitor(aluno);
		} else {
			System.out.println("Condição inválida.");
		}
	}

	public void podeSerMonitor(Professor professor) {
		if (disciplina.getProfessorResponsavel() != professor) {
			associarMonitor(professor);
		} else {
			System.out.println("Condição inválida.");
		}
	}

	public void removeAlunoTurma(Aluno aluno) {
		alunosTurma.remove(aluno);
	}

	public void removeProfessorTurma() {
		professorTurma = null;
	}

}

// classe auxiliar
class Lista {
	// lista de arraylists dos objetos:
	private ArrayList<Pessoa> pessoas;
	private ArrayList<Professor> professores;
	private ArrayList<Aluno> alunos;
	private ArrayList<Disciplina> disciplinas;
	private ArrayList<Turma> turmas;

	Lista() {
		alunos = new ArrayList<>();
		professores = new ArrayList<>();
		disciplinas = new ArrayList<>();
		pessoas = new ArrayList<>();
		turmas = new ArrayList<>();
	}

	// bloco de retorno de objetos:
	public Professor retornaProfessor(String nome) {
		for (Professor professor : professores) {
			if (professor.getNome() == nome) {
				return professor;
			}

		}
		return null;
	}

	public Disciplina retornaDisciplina(String nome) {

		for (Disciplina disciplina : disciplinas) {
			if (disciplina.getNome() == nome) {
				return disciplina;
			}

		}
		return null;
	}

	public Aluno retornaAluno(String nome) {
		for (Aluno aluno : alunos) {
			if (aluno.getNome() == nome) {
				return aluno;
			}

		}
		return null;
	}

	public void validaMonitor(Aluno aluno) {
		for (int i = turmas.size(); i >= 0; i--) {
			if (turmas.get(i).getMonitor().getAlunoMonitor() == aluno)
				;

		}
	}

	public void validaMonitor(Professor professor) {
		for (int i = turmas.size(); i >= 0; i--) {
			if (turmas.get(i).getMonitor().getProfessorMonitor() == professor)
				;
			turmas.get(i).setMonitor(null);
		}
	}

	public void validaTurma(Aluno aluno) {
		for (int i = turmas.size(); i >= 0; i--) {
			if (turmas.get(i).checaAlunosTurma(aluno))
				;
			turmas.get(i).removeAlunoTurma(aluno);
		}
	}

	public void validaTurma(Professor professor) {
		for (int i = turmas.size(); i >= 0; i--) {
			if (turmas.get(i).getProfessorTurma() == professor)
				;
			turmas.remove(i);
		}
	}

	public void validaDisciplina(Professor professor) {
		for (int i = disciplinas.size(); i >= 0; i--) {
			if (disciplinas.get(i).getProfessorResponsavel() == professor)
				;
			disciplinas.get(i).setProfessorResponsavel(null);
			System.out.println("Esse professor era professor responsável da disciplina " + disciplinas.get(i)
					+ ". Novo professor responsável deverá ser cadastrado.");
		}
	}

	// bloco de remoção dos objetos:
	public void removeProfessor(String nome) {
		validaMonitor(retornaProfessor(nome));
		validaTurma(retornaProfessor(nome));
		validaDisciplina(retornaProfessor(nome));
		professores.remove(retornaProfessor(nome));
		pessoas.remove(retornaProfessor(nome));
	}

	public void removeAluno(String nome) {
		validaMonitor(retornaAluno(nome));
		validaTurma(retornaAluno(nome));
		alunos.remove(retornaAluno(nome));
		pessoas.remove(retornaAluno(nome));
	}

	public void removeTurma(Professor professor, String periodo) {
		for (int i = turmas.size(); i >= 0; i--) {
			if ((turmas.get(i).getProfessorTurma() == professor || turmas.get(i).getProfessorTurma() == null)
					&& (turmas.get(i).getPeriodoTurma() == periodo))
				turmas.remove(i);
		}
	}

	public void removeDisciplina(String nome) {
		for (int i = turmas.size(); i >= 0; i--) {
			if (turmas.get(i).getDisciplina() == retornaDisciplina(nome))
				;
			turmas.remove(i);
		}
		disciplinas.remove(retornaDisciplina(nome));
	}

	// bloco de adição dos objetos:
	public void adicionaLista(Disciplina disciplina) {

		disciplinas.add(disciplina);
	}

	public void adicionaLista(Turma turma) {
		turmas.add(turma);
	}

	public void adicionaLista(Professor professor) {
		professores.add(professor);
		adicionaPessoa(professor);
	}

	public void adicionaLista(Aluno aluno) {
		alunos.add(aluno);
		adicionaPessoa(aluno);
	}

	// bloco de listagem dos objetos:
	public void mostraAlunos() {
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getLogin());
		}
	}

	public void mostraProfessores() {
		for (Professor professor : professores) {
			System.out.println(professor.getNome());
			System.out.println(professor.getMatriculaProfessor());
		}
	}

	public void mostraDisciplinas() {
		for (Disciplina disciplina : disciplinas) {
			System.out.println(disciplina.getNome());
			System.out.println(disciplina.getProfessorResponsavel().getNome());
			int contTurmas = 0;
			for (int i = 0; i <= turmas.size(); i++) {
				if (turmas.get(i).getDisciplina() == retornaDisciplina(disciplina.getNome()))
					contTurmas++;
			}
			System.out.println("Turmas: " + contTurmas);
		}
	}

	public void mostraAniversarios() {
		for (Pessoa pessoa : pessoas) {
			System.out.println("Aniversários:");
			System.out.println(pessoa.getNome() + " dia: " + pessoa.getDia() + "/" + pessoa.getMes());
		}
	}

	private void adicionaPessoa(Aluno aluno) {

		if (pessoas.isEmpty()) {
			pessoas.add(aluno);
		} else {
			for (int i = 0; i <= pessoas.size(); i++) {
				Pessoa pessoa = pessoas.get(i);
				if (aluno.getMes() < pessoa.getMes()) {
					pessoas.set(i, aluno);
					break;
				} else if (aluno.getMes() == pessoa.getMes()) {
					if (aluno.getDia() <= pessoa.getDia()) {
						pessoas.set(i, aluno);
						break;
					} else {
						pessoas.add(aluno);
						break;
					}
				} else {
					pessoas.add(aluno);
					break;
				}
			}
		}
	}

	private void adicionaPessoa(Professor professor) {
		if (pessoas.isEmpty()) {
			pessoas.add(professor);
		} else {
			for (int i = 0; i <= pessoas.size(); i++) {
				Pessoa pessoa = pessoas.get(i);
				if (professor.getMes() < pessoa.getMes()) {
					pessoas.set(i, professor);
					break;
				} else if (professor.getMes() == pessoa.getMes()) {
					if (professor.getDia() <= pessoa.getDia()) {
						pessoas.set(i, professor);
						break;
					} else {
						pessoas.add(professor);
						break;
					}
				} else {
					pessoas.add(professor);
					break;
				}
			}
		}
	}
}
