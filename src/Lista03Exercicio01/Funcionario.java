package Lista03Exercicio01;

import java.util.*;

public class Funcionario {
	private double matricula, salario, departamento;
	private String nome, funcao;

	Funcionario(double matricula, String nome, double departamento, double salario, String funcao) {
		this.matricula = matricula;
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.funcao = funcao;
	}

	public double getMatricula() {
		return matricula;
	}

	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDepartamento() {
		return departamento;
	}

	public void setDepartamento(double departamento) {
		this.departamento = departamento;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
