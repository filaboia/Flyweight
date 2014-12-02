package lobolandia;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;


public class Lobo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private LoboFactory loboFactory = LoboFactory.getInstance();

	/**
	 * Create the frame.
	 * @param sul 
	 */
	public Lobo(TipoLobo sul) {
		setBounds(100, 100, 400, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("Monospaced", Font.PLAIN, 12));
		String lobo = loboFactory.getLobo(sul);
		textPane.setText(lobo + Integer.toString(System.identityHashCode(lobo)));
		contentPane.add(textPane, BorderLayout.CENTER);
	}

}
