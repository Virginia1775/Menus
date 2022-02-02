import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuBar extends JFrame {

	private JPanel contentPane;
	private JMenuItem mntmHola;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuBar frame = new MenuBar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuBar() {
		setTitle("Menu");
		setFont(new Font("Dialog", Font.BOLD, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 484);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.BOLD, 20));
		setJMenuBar(menuBar);
		
		JMenu mnHablar = new JMenu("Hablar");
		mnHablar.setHorizontalAlignment(SwingConstants.LEFT);
		mnHablar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnHablar);
		
		 mntmHola = new JMenuItem("Decir hola");
		 mntmHola.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		JOptionPane.showMessageDialog(null, "Holi!!");
		 	}
		 });
		mntmHola.setHorizontalAlignment(SwingConstants.LEFT);
		mnHablar.add(mntmHola);
		
		JMenuItem mntmAdios = new JMenuItem("Decir Adios");
		mntmAdios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hasta luego!!");
			}
		});
		mnHablar.add(mntmAdios);
		
		JSeparator separador1 = new JSeparator();
		mnHablar.add(separador1);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnHablar.add(mntmSalir);
		
		JMenu mnColores = new JMenu("Colores");
		mnColores.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnColores);
		
		JMenuItem mntmAzul = new JMenuItem("Azul");
		mntmAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.BLUE);
			}
		});
		mnColores.add(mntmAzul);
		
		JMenuItem mntmVerde = new JMenuItem("Verde");
		mntmVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.GREEN);
			}
		});
		mnColores.add(mntmVerde);
		
		JMenuItem mntmRojo = new JMenuItem("Rojo");
		mntmRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.RED);
			}
		});
		mnColores.add(mntmRojo);
		
		JSeparator separador2 = new JSeparator();
		mnColores.add(separador2);
		
		JMenuItem mntmReiniciarColor = new JMenuItem("Reiniciar Color");
		mntmReiniciarColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(null);
			}
		});
		mnColores.add(mntmReiniciarColor);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
	}

}
