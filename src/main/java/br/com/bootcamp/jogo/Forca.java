package br.com.bootcamp.jogo;

import java.util.Random;
import java.util.Scanner;

public class Forca {

	private static String[] dica;
	
	public static void main(String[] args) {
		
		String palavraChave = null;
		int qtdLetras = 0;

		System.out.println("Bem vindo ao jogo!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual dificuldade do jogo? F(Fácil); N(Normal); D(Difícil): ");
		String dificuldadeJogo = sc.next().toUpperCase();

		switch (dificuldadeJogo) {
		case "F":
			palavraChave = listaPalavraFacil();
			break;
		case "N":
			palavraChave = listaPalavraNormal();
			break;
		case "D":
			palavraChave = listaPalavrasDificeis();
			break;
		default:
			System.out.println("Nenhuma tecla valida.");
		}
		
		String listaEmString ="";
		montaDica(palavraChave.length());
		for(String s : dica) {
			listaEmString = listaEmString + s;
		}
		
		System.out.println("Qual letra voce chuta? --> ");
		String letraDigitada = sc.next().toLowerCase();
		
		String[] listaLetrasCorretas = palavraChave.split("");
		
		int i = 0;
		qtdLetras = palavraChave.length();
		while(i < qtdLetras) {
			if(listaLetrasCorretas[i].equals(letraDigitada)) {
				dica[i] = letraDigitada;
			}
			i++;
		}
		
		String novaDica ="";
		
		for(String s: dica) {
			novaDica += s;
		}
		
		System.out.println(novaDica);
		
		
		System.out.println(palavraChave);
		System.out.println(listaEmString);
		sc.close();
	}

	public static String[] montaDica(int qdtLetras) {
		dica = new String[qdtLetras];

		for (int i = 0; i < dica.length; i++) {
			dica[i] = " __ ";
		}
		return dica;
	}

	public static String listaPalavrasDificeis() {
		String[] palavras = { "carambola", "lichia", "jatoba" };
		Random random = new Random();
		return palavras[random.nextInt(palavras.length)];
	}

	public static String listaPalavraNormal() {
		String[] palavras = { "abacaxi", "melancia", "melao" };
		Random random = new Random();
		return palavras[random.nextInt(palavras.length)];
	}

	public static String listaPalavraFacil() {
		String[] palavras = { "uva", "banana", "maca" };
		Random random = new Random();
		return palavras[random.nextInt(palavras.length)];
	}

}
