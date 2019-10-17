import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	
	public static void escreveArquivo(String texto, String resultado) throws IOException {
		
		File diretorio = new File("C:\\temp");
		
		if(!diretorio.exists()){
	    	diretorio.mkdir();
	    }
		
	    File arquivo = new File ("C:\\temp\\saida_cobol.txt");
	    
	    Date data = new Date();  
	    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy"); 
	    formatador.format(data);
	    
	    //System.out.println(data);
	    
	    try {
	
	    	if (!arquivo.exists( ) ) {
	    		arquivo.createNewFile( );
	    	}
	    	
	    	FileWriter fw = new FileWriter (arquivo,true);//escreve no final do arquivo, sem sobrescreve-lo
	    	BufferedWriter bw = new BufferedWriter(fw);
	    	bw.write(texto + ": " + resultado);
	    	bw.newLine();
	    	bw.close( );
	    	fw.close( );
	
	    }catch(FileNotFoundException e){
	    	
	    	System.out.println(e.getStackTrace());
	    }
	}

}
