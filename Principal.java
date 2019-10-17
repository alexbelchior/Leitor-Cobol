import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal {

	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
		
		Painel painel,painelSaida;
		
		painel = new Painel();
	
		String teste = "0REBN00019122019";
		int valor = 0;
		String resultado;
		
		String stringCobol = javax.swing.JOptionPane.showInputDialog("Cole aqui a String Cobol");
		String parametro = javax.swing.JOptionPane.showInputDialog("Digite aqui a quantidade de campos da saída");
		
		valor = Integer.parseInt(parametro);
		
		String[] variavel = new String[valor];
		int[]posicao = new int[valor];
		
		
		for(int i = 0; i < valor; i++) {
			variavel[i] = javax.swing.JOptionPane.showInputDialog("variavel");
			String size = javax.swing.JOptionPane.showInputDialog("tamanho");
			posicao[i] = Integer.parseInt(size);
			painel.insereTexto(variavel[i],posicao[i]);
			painel.revalidate();
			painel.repaint();
		}
		
		painelSaida = new Painel();
        
		
		for(int i = 0; i < valor; i++) {
			System.out.print(variavel[i] + ": ");
				resultado = stringCobol.substring(0, posicao[i]);
				System.out.println(resultado);
				stringCobol = stringCobol.substring(posicao[i]);
				painelSaida.insereTexto(variavel[i], resultado);
				painelSaida.revalidate();
				painelSaida.repaint();
				Utils.escreveArquivo(variavel[i],resultado);

		}

	}

}
