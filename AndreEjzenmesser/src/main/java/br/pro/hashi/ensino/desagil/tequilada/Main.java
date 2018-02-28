package br.pro.hashi.ensino.desagil.tequilada;

import java.io.*;

public class Main {
	public static void main (String[] args) throws IOException {
		System.out.println("Projeto 1");
		
		InputStream is = new FileInputStream("tabuleiro.txt");
		InputStreamReader arquivo = new InputStreamReader(is);
		BufferedReader leitura = new BufferedReader(arquivo);
		
		System.out.println(leitura.readLine());
		
		String conteudo = leitura.readLine();
		
		String textoFinal = "";
        while (conteudo != null) {
        	if (conteudo == "#"){
        		conteudo = "X";
        		textoFinal += conteudo;
        	}
        	else{
        		textoFinal += conteudo;
        	}
            conteudo = leitura.readLine();
        }
		
        System.out.println(textoFinal);
		leitura.close();
	}
}