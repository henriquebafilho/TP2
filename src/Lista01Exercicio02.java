
/*Uma das m´etricas mais tradicionais de qualidade subjetiva de servi¸co em telecomunica¸c˜oes
´e o escore de opini˜ao m´edia, ou Mean Opinion Score (MOS). Nesta m´etrica, cada avaliador
julga a qualidade t´ecnica de uma transmiss˜ao em uma escala de 1 a 5, onde 1 ´e a pior qualidade
percebida e 5 ´e a melhor. Em geral, as avalia¸c˜oes s˜ao valores inteiros correspondendo
a avalia¸c˜oes de qualidade excelente (5), boa (4), razo´avel (3), fraca (2) e ruim (1). O MOS
do servi¸co ´e calculado agregando o resultado de todos os avaliadores pela m´edia aritm´etica.
(a) Considere que uma s´erie de avalia¸c˜oes de um servi¸co foram coletadas e armazenadas
em um array. Implemente uma fun¸c˜ao que calcule o MOS deste servi¸co. Esta fun¸c˜ao
deve possuir o prot´otipo:
public static float calculaMOS (int [] avaliacoes )
(b) Vocˆe decidiu inventar uma nova m´etrica de avalia¸c˜ao subjetiva: a fatia de boa transmiss˜ao,
ou Good Transmission Share (GTS). Esta m´etrica mant´em as avalia¸c˜oes individuais,
mas agrega os dados calculando a propor¸c˜ao de avalia¸c˜oes (entre 0 = 0% e 1
= 100%) que foram boas ou excelentes (valor 4 ou 5). Implemente uma fun¸c˜ao que
calcula o GTS do servi¸co do item anterior. Esta fun¸c˜ao deve possuir o prot´otipo:
public static float calculaGTS (int [] avaliacoes )
(c) Agora, vocˆe gostaria de demonstrar que GTS tem utilidade, isto ´e, que ela ´e diferente
de MOS em cen´arios com muitas avalia¸c˜oes. Crie uma fun¸c˜ao que gera artificialmente
um array com muitas avalia¸c˜oes, de tal forma que o MOS calculado sobre essas avalia¸c˜oes
seja baixo, mas o GTS calculado sobre essas mesmas avalia¸c˜oes seja alto. Mais
especificamente, implemente uma fun¸c˜ao com o prot´otipo
public static int [] geraOpinioes (int tamanho )
que gera um array com tamanho avalia¸c˜oes, que tenha um MOS menor ou igual a 3
e um GTS maior ou igual a 50%. Para simplificar, suponha que tamanho seja par e
maior ou igual a 2.
Para testar o seu c´odigo, utilize as seguintes chamadas na sua fun¸c˜ao main:
int TAMANHO = 2000;
int [] arrayOpinioes = geraOpinioes ( TAMANHO ) ;
boolean mosBaixo = ( calculaMOS ( arrayOpinioes ) <= 3.0 f ) ;
boolean gtsAlto = ( calculaGTS ( arrayOpinioes ) >= 0.5 f ) ;
System . out . println ( mosBaixo && gtsAlto ) ;
Este trecho de c´odigo deve imprimir True no terminal, mesmo que vocˆe modifique o valor
da vari´avel TAMANHO (desde que este n´umero seja par e maior ou igual a 2).*/
import java.util.*;

public class Lista01Exercicio02 {
	public static void main(String[] args) {
		int TAMANHO = 2000;
		int[] arrayOpinioes = geraOpinioes(TAMANHO);
		boolean mosBaixo = (calculaMOS(arrayOpinioes) <= 3.0f);
		boolean gtsAlto = (calculaGTS(arrayOpinioes) >= 0.5f);
		System.out.println(mosBaixo && gtsAlto);
	}

	public static float calculaMOS(int[] avaliacoes) {
		int somaMOS = 0;
		for (int i = 0; i <= avaliacoes.length - 1; i++) {
			somaMOS += avaliacoes[i];
		}
		float mos = somaMOS / avaliacoes.length;
		return mos;
	}

	public static float calculaGTS(int[] avaliacoes) {
		float divideGTS = 0;
		for (int i = 0; i <= avaliacoes.length - 1; i++) {
			if (avaliacoes[i] == 4 || avaliacoes[i] == 5)
				divideGTS += 1;
		}
		float unidade = avaliacoes.length / 100;

		float gts = divideGTS / unidade;
		gts /= 100;
		return gts;
	}

	public static int[] geraOpinioes(int tamanho) {
		int[] opinioes = new int[tamanho];
		for (int i = 0; i <= opinioes.length - 1; i++) {
			if (i == 0 || i % 2 == 0) {
				opinioes[i] = 1;
			} else {
				opinioes[i] = 4;
			}
		}
		return opinioes;
	}
}