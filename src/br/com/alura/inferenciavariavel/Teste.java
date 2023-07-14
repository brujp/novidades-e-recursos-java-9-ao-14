package br.com.alura.inferenciavariavel;

import java.util.HashMap;

public class Teste {

	public static void main(String[] args) {

		HashMap<String, String> cpfPorNomes = new HashMap<>();
		cpfPorNomes.put("João", "04813189");
		System.out.println(cpfPorNomes);

		var cpfPorNomesDois = new HashMap<String, String>();
		cpfPorNomesDois.put("Bruno", "4625253");
		System.out.println(cpfPorNomesDois);
	}
}
