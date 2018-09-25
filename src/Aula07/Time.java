package Exercicio4; 
import java.util.*;
public class Time {
	
	//Feito por João Victor Antunes Figueira, Leonardo Vartuli Negreiros, Henrique Borges de Almeida Filho
	
	protected static String[] Posicoes = {"GOLEIRO","ZAGUEIRO","MEIOCAMPO","ATACANTE"};
	protected String Nome;
	protected ArrayList<Atleta> Jogadores = new ArrayList<Atleta>();
	protected int NumIntegrantes;
	
	//METODOS
	
	public void imprimirNome(){
		System.out.println("O nome do time é "+Nome );
	}
	
	public void imprimirNomeDosJogadores(){
		System.out.println("Lista de Jogadores do time:");
		for(int i = 0;i<Jogadores.size();i++){
			System.out.print(Jogadores.get(i).Nome);
			System.out.print(" ");
			System.out.println(Jogadores.get(i).Posicao);
			System.out.println(" ");
		}
	}
	
	
	
	private void mudarNome(){
		Scanner entrada = new Scanner(System.in);
		String nome;
		
		System.out.println("Insira o novo nome do time");
		nome = entrada.nextLine();
		
		Nome = nome;
		System.out.println("Nome Alterado :D");
	}
	
	private void contratarJogador(){
		Scanner entrada =  new Scanner(System.in);
		int ajuda = 0;
		
		String nome;
		int idade;
		String posicao = "nulo";
		
		System.out.println("Insira o nome do Jogador que quer contratar");
		nome = entrada.nextLine();
		
		System.out.println("Insira a idade do Jogador que quer contratar");
		idade = entrada.nextInt();
		
		do {
			System.out.println("Insira a posição do Jogador que quer contratar");
			System.out.println("GOLEIRO ZAGUEIRO MEIOCAMPO ATACANTE");
			posicao = entrada.nextLine();
			if(!posicao.equals("nulo")){
				for(int i = 0;i<Posicoes.length;i++){
			
					if(posicao.equals(this.Posicoes[i])){
						ajuda = 1;
						System.out.println("Jogador Contratado");
					}else {
						System.out.println("Posição invalida");
					}
				}
			}
		}while(ajuda == 0);

		
		Atleta jogador = new Atleta(nome, idade, posicao);
		
		int aux = 0;
		for(int i = 0; i<Jogadores.size();i++){
			if(jogador.equals(Jogadores.get(i))){
				aux +=1;
				System.out.println("Jogador já está no time");
				break;
			}
		}
		if(aux == 0){
			NumIntegrantes += 1;
			Jogadores.add(jogador);
			System.out.println("Jogador Contratado");
		}
	}
	
	private void demitirJogador(){
		Scanner entrada = new Scanner(System.in);
		int aux = 0;
		String nome;
		
		System.out.println("Insira o nome do Jogador que quer Demitir");
		nome = entrada.nextLine();
		
		for(int i = 0; i<Jogadores.size();i++){
			if(nome==Jogadores.get(i).Nome){
				aux += 1;
				System.out.println("Tem certeza disso ? S OU N");
				if((entrada.nextLine().equals("S")||entrada.nextLine().equals("s"))){
					NumIntegrantes -= 1;
					Jogadores.remove(i);
					System.out.println("Jogador Demitido");
					break;
				}else if((entrada.nextLine().equals("N")||entrada.nextLine().equals("n"))){
					System.out.println("Jogador não demitido");
					break;
				}
			}
		}
		if(aux==0){
			System.out.println("Jogador não encontrado");	
		}
	}
	
	private void gerenciarTime(){
		int menu;
		Scanner entrada = new Scanner(System.in);
		System.out.println("O que deseja fazer?");
		System.out.println("1 Exibir Nome");
		System.out.println("2 Exibir Lista de Jogadores");
		System.out.println("3 Contratar Novo Jogador");
		System.out.println("4 Demitir Jogador");
		System.out.println("5 Mudar Nome do Time");
		System.out.println("6 Sair do gerenciamento de time");
		menu = entrada.nextInt();
		
		switch(menu){
		
		case 1: 
			this.imprimirNome();
			break;
		case 2: 
			this.imprimirNomeDosJogadores();
			break;
		case 3: 
			this.contratarJogador();
			break;
		case 4:
			this.demitirJogador();
			break;
		case 5:
			this.mudarNome();
			break;
		case 6:
			break;
		default:
			System.out.println("Opção Invalida");
			break;
		}
	}
	
//CONSTRUTOR
	Time(String nome){
		this.Nome = nome;
	}
//CONTROLE PRINCIPAL
	public static void main(Time novo) {
		
		int aux = 0;
		Scanner entrada = new Scanner(System.in);
		String continuar;
		System.out.println("Insira o nome do seu time");
		novo.Nome = entrada.nextLine();
		while(aux == 0){
			novo.gerenciarTime();
			System.out.println("Deseja continuar a gerenciar o time? N para parar QQ coisa pra continuar");
			continuar = entrada.nextLine();
			if((continuar.equals("N"))||(continuar.equals("n"))){
				break;
			}
		}
	}
		
	
		
	}

