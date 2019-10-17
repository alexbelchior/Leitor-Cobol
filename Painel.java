import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel extends JFrame{
	JPanel painel;

	public Painel(){
		super("Teste Painel");
		//seta o layout do frame como nulo, assim tem mais liberdade
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setSize(100,600);
	
		configuraPainel();
	
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void configuraPainel(){
		painel = new JPanel();
		//cor apenas para notar a diferença entre o frame e o painel
		//seta o tamanho do painel
		painel.setSize(100,100);
		//seta a localização - layout é null
		painel.setLocation(10,10);
		add(painel);
	}
	
	public void insereTexto(String texto, int tamanho) {
		JLabel label = new JLabel(texto + "(" + tamanho + ")");
		painel.add(label);
		
	}
	
	public void insereTexto(String texto, String resultado) {
		JLabel label = new JLabel(texto + ": " + resultado);
		painel.add(label);
	}

}