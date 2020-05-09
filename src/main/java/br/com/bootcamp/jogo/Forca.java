package br.com.bootcamp.jogo;

import java.util.Random;
import java.util.Scanner;

public class Forca {
	
	public static void main(String[] args) {
		
		System.out.println("Bem vindo ao jogo!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual dificuldade do jogo? F(Fácil); N(Normal); D(Difícil): ");
		String dificuldadeJogo = sc.next();
		
		switch(dificuldadeJogo) {
		case "F":
			System.out.println(listaPalavraFacil());
			break;
		case "N":
			System.out.println(listaPalavraNormal());
			break;
		case "D":
			System.out.println(listaPalavrasDificeis());
			break;
		default:
			System.out.println("Nenhuma tecla valida.");
		}
		sc.close();
	}
	
	public static String listaPalavrasDificeis() {
		String[] palavras = {"carambola","lichia","jatoba"};
		Random random = new Random();
		return palavras[random.nextInt(palavras.length-1)];
	}
	
	public static String listaPalavraNormal() {
		String[] palavras = {"abacaxi","melancia","melao"};
		Random random = new Random();
		return palavras[random.nextInt(palavras.length-1)];
	}
	
	public static String listaPalavraFacil() {
		String[] palavras = {"uva","banana","maca"};
		Random random = new Random();
		return palavras[random.nextInt(palavras.length-1)];
	}

}
