package br.pro.hashi.ensino.desagil.tequilada;

import java.io.*;

public class Main {
	public static void main (String[] args) {
		System.out.println("Projeto 1");
		
		File arquivo = new File("tabuleiro.txt");				
		BufferedReader leitura = new BufferedReader(new FileReader(arquivo));
		
		System.out.println(leitura.readLine());
		
		String textoFinal;
		String conteudo;
		while (conteudo = leitura.readLine() != null) {
			if (conteudo == "#"){
				textoFinal = "X";
			}
			else {
				textoFinal = " ";
			}
			System.out.println(conteudo);
		}
		
		System.out.println(textoFinal);
		leitura.close();
	}
}