package br.com.alura.factorymethod;

import java.util.*;

public class Teste {

	public static void main(String[] args) {

		//Com a linha abaixo, eu consigo fazer a mesma coisa que todas as linhas da 17 até 22
		List<String> nomes = List.of("primeiroNome", "segundoNome", "terceiroNome");
		System.out.println(nomes);

		System.out.println(Set.of("terceiroNome"));
		System.out.println(Map.of("nome", "Bruno")); //Chave-valor

		/*
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);
		 */
	}
}
