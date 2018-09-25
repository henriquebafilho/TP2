package Aula07Exercicio05;

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

	Disciplina(String nome, int codigo, String ementa, int cargaHoraria, Professor professor) {
		this.cargaHoraria = cargaHoraria;
		this.codigo = codigo;
		this.ementa = ementa;
		this.nome = nome;
		professorResponsavel = professor;
	}

	public Professor getProfessorResponsavel() {
		return professorResponsavel;
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

// classe auxiliar
class Lista {
	// lista de arraylists dos objetos:
	private ArrayList<Pessoa> pessoas;
	private ArrayList<Professor> professores;
	private ArrayList<Aluno> alunos;
	private ArrayList<Disciplina> disciplinas;

	Lista() {
		alunos = new ArrayList<>();
		professores = new ArrayList<>();
		disciplinas = new ArrayList<>();

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

	// bloco de remoção dos objetos:
	public void removeProfessor(String nome) {
		professores.remove(retornaProfessor(nome));
		pessoas.remove(retornaProfessor(nome));
	}

	public void removeAluno(String nome) {
		alunos.remove(retornaAluno(nome));
		pessoas.remove(retornaAluno(nome));
	}

	public void removeDisciplina(String nome) {
		disciplinas.remove(retornaDisciplina(nome));
	}

	// bloco de adição dos objetos:
	public void adicionaLista(Disciplina disciplina) {
		disciplinas.add(disciplina);
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
