
package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import model.*;
public class Fen_4_Ach_NewC extends JFrame   {

	Magasin magasin;
	
	private JPanel p = new JPanel();
	private JTextField t_nom;
	private JTextField t_prenom;
	private JTextField t_adresse;
	private JTextField t_tel;
	private JTextField t_sexe;
	private JTextField t_mail;
	private JTextField t_dateN;

	JButton b_effacer = new JButton("EFFACER");
	JButton b_valider = new JButton("VALIDER");
	JButton b_retour = new JButton("RETOUR");
	public Fen_4_Ach_NewC( Magasin m) {
		
		magasin=m;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setResizable(false);
		setLocationRelativeTo(null);
	    setVisible(true);
		
	    setContentPane(p);
		p.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ajoutez un nouveau client");
		lblNewLabel.setBounds(350, 21, 912, 48);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 39));
		p.add(lblNewLabel);
		
		//JLabel nom
		JLabel l_nom = new JLabel("Nom :");
		l_nom.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 34));
		l_nom.setBounds(115, 119, 147, 37);
		p.add(l_nom);
		
		//JLabel pr�nom
		JLabel l_prenom = new JLabel("Pr�nom :");
		l_prenom.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 34));
		l_prenom.setBounds(115, 237, 147, 37);
		p.add(l_prenom);
		
		//JLabel adresse
		JLabel l_adresse = new JLabel("Adresse :");
		l_adresse.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 34));
		l_adresse.setBounds(115, 353, 147, 37);
		p.add(l_adresse);
		
		//JLabel t�l�phone
		JLabel l_tel = new JLabel("T�l�phone :");
		l_tel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 34));
		l_tel.setBounds(115, 477, 207, 37);
		p.add(l_tel);
		
		//JLabel sexe
		JLabel l_sexe = new JLabel("Sexe :");
		l_sexe.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 34));
		l_sexe.setBounds(643, 119, 147, 37);
		p.add(l_sexe);
		
		//JLabel mail
		JLabel l_mail = new JLabel("Mail :");
		l_mail.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 34));
		l_mail.setBounds(643, 237, 147, 37);
		p.add(l_mail);
		
		//JLabel date de naissance
		JLabel l_dateN = new JLabel("Date de naissance :");
		l_dateN.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 34));
		l_dateN.setBounds(643, 353, 326, 37);
		p.add(l_dateN);
		
		
		//JTextfield nom 
		t_nom = new JTextField();
		t_nom.setBounds(115, 154, 389, 58);
		p.add(t_nom);
		
		//JTextfield prenom 
		t_prenom = new JTextField();
		t_prenom.setBounds(115, 272, 389, 58);
		p.add(t_prenom);
		
		//JTextfield adresse 
		t_adresse = new JTextField();
		t_adresse.setBounds(115, 392, 389, 58);
		p.add(t_adresse);
		
		//JTextfield t�l�phone
		t_tel = new JTextField();
		t_tel.setBounds(115, 513, 389, 58);
		p.add(t_tel);
		
		//JTextfield sexe 
		t_sexe = new JTextField();
		t_sexe.setBounds(643, 154, 389, 58);
		p.add(t_sexe);
		
		//JTextfield mail
		t_mail = new JTextField();
		t_mail.setBounds(643, 272, 389, 58);
		p.add(t_mail);
		
		//JTextfield date de naissance 
		t_dateN = new JTextField();
		t_dateN.setBounds(643, 392, 389, 58);
		p.add(t_dateN);
		
		//JButton effacer
		//effacer tous les champs 
		b_effacer.setForeground(new Color(255, 255, 255));
		b_effacer.setBackground(new Color(0, 0, 0));
		b_effacer.setFont(new Font("Tahoma", Font.BOLD, 30));
		b_effacer.setBounds(739, 502, 207, 64);
		b_effacer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		p.add(b_effacer);
		
		//JButton valider
		//ajouter un nouveau client � la liste client du magasin
		b_valider.setBackground(new Color(0, 128, 0));
		b_valider.setForeground(new Color(255, 255, 255));
		b_valider.setFont(new Font("Tahoma", Font.BOLD, 30));
		b_valider.setBounds(739, 619, 207, 64);
		b_valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		p.add(b_valider);
		
		//JButton retour
		//retour � la fen�tre pr�c�dente 
		b_retour.setForeground(new Color(255, 255, 255));
		b_retour.setBackground(new Color(255, 215, 0));
		b_retour.setFont(new Font("Tahoma", Font.BOLD, 30));
		b_retour.setBounds(208, 619, 207, 64);
		b_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		p.add(b_retour);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Fen_4_Ach_NewC frame = new Fen_4_Ach_NewC(new Magasin("tfyuf", "viui"));
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
