package lobolandia;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;


public class Principal {

	private JFrame frmauuuuuuu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Principal window = new Principal();
					window.frmauuuuuuu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmauuuuuuu = new JFrame();
		frmauuuuuuu.setTitle("#AUUUUUUU");
		frmauuuuuuu.setBounds(100, 100, 781, 520);
		frmauuuuuuu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmauuuuuuu.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton northButton = new JButton("Lobo do Norte");
		northButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Lobo(TipoLobo.NORTE).setVisible(true);
			}
		});
		frmauuuuuuu.getContentPane().add(northButton, BorderLayout.NORTH);
		
		JButton southButton = new JButton("Lobo do Sul");
		southButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Lobo(TipoLobo.SUL).setVisible(true);
			}
		});
		frmauuuuuuu.getContentPane().add(southButton, BorderLayout.SOUTH);
		
		JButton westButton = new JButton("Lobo do Oeste");
		westButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Lobo(TipoLobo.OESTE).setVisible(true);
			}
		});
		frmauuuuuuu.getContentPane().add(westButton, BorderLayout.WEST);
		
		JButton eastButton = new JButton("Lobo do Leste");
		eastButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Lobo(TipoLobo.LESTE).setVisible(true);
			}
		});
		frmauuuuuuu.getContentPane().add(eastButton, BorderLayout.EAST);
		
		JTextPane apresentacao = new JTextPane();
		apresentacao.setEditable(false);
		apresentacao.setFont(new Font("Monospaced", Font.PLAIN, 12));
		apresentacao.setText("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'~~~     ~~~`@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@@@@@@@@@@'                     `@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@@@@@@@'                           `@@@@@@@@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@@@@@'                               `@@@@@@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@@@'                                   `@@@@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@@'                                     `@@@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@'                                       `@@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@                                         @@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@'                                         `@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@                                           @@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@                                           @@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@                       n,                  @@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@                     _/ | _                @@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@                    /'  `'/                @@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@a                 <~    .'                a@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@                 .'    |                 @@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@a              _/      |                a@@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@@a           _/      `.`.              a@@@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@@@a     ____/ '   \\__ | |______       a@@@@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@@@@@a__/___/      /__\\ \\ \\     \\___.a@@@@@@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@@@@@/  (___.'\\_______)\\_|_|        \\@@@@@@@@@@@@@@@@@@@@@@@@\n"
							+"@@@@@@@@@@@@@@@@@@|\\________                       ~~~~~\\@@@@@@@@@@@@@@@@@@\n"
							+"~~~\\@@@@@@@@@@@@@@||       |\\___________________________/|@/~~~~~~~~~~~\\@@@\n"
							+"    |~~~~\\@@@@@@@/ |  |    | |                         | ||\\____________|@@");
		frmauuuuuuu.getContentPane().add(apresentacao, BorderLayout.CENTER);
	}
}
