package controller;

import java.time.*;

import javax.swing.*;
import model.*;
import view.*;

public class NewClient_Gest {
	
	Magasin m;
	Client c;
	public int status;
	JTextField nom;
	JTextField prenom;
	JTextField adresse;
	JTextField dateN;
	JTextField tel;
	JTextField mail;
	JTextField sexe;
	
	public NewClient_Gest(Magasin m, JTextField nom, JTextField prenom, JTextField adresse, JTextField tel, JTextField mail, JComboBox<String> sexe, JComboBox jour, JComboBox mois, JTextField annee) {
		int checksum = 1;
		LocalDate dateTemp = null;
		if (nom.getText().isEmpty()) {
			JFrame a = new JFrame();
		    JOptionPane.showMessageDialog(a, "Nom vide. Veuillez saisir un nom.", "Erreur", 2);
		} else if (prenom.getText().isEmpty()) {
			JFrame a = new JFrame();
		    JOptionPane.showMessageDialog(a, "Prénom vide. Veuillez saisir un prénom.", "Erreur", 2);
		} else if (adresse.getText().isEmpty()) {
			JFrame a = new JFrame();
		    JOptionPane.showMessageDialog(a, "Adresse vide. Veuillez saisir une adresse.", "Erreur", 2);
		} else if (tel.getText().isEmpty()) {
			JFrame a = new JFrame();
		    JOptionPane.showMessageDialog(a, "Aucun numéro de téléphone renseigné. Veuillez en renseigner un.", "Erreur", 2);
		} else if (mail.getText().isEmpty()) {
			JFrame a = new JFrame();
		    JOptionPane.showMessageDialog(a, "Aucune adresse mail renseignée. Veuillez en renseigner une.", "Erreur", 2);
		} else if (annee.getText().isEmpty()) {
			JFrame a = new JFrame();
			JOptionPane.showMessageDialog(a, "Aucune année de naissance renseignée. Veuillez en sélectionner une.", "Erreur", 2);
		} else {
			if(checksum > 0) {
				try {
					if(1910 <= Integer.parseInt(annee.getText()) && Integer.parseInt(annee.getText()) <= 2010) {
					    dateTemp = LocalDate.of(Integer.parseInt(annee.getText()), mois.getSelectedIndex() + 1, jour.getSelectedIndex() + 1);
					} else {
						JFrame a = new JFrame();
						JOptionPane.showMessageDialog(a, "Veuillez saisir une année comprise entre 1910 et 2010.", "Erreur", 2);
						checksum = -1;
					}
				} catch (Exception e) {
					JFrame a = new JFrame();
				    JOptionPane.showMessageDialog(a, "Date invalide. Veuillez réessayer.", "Erreur", 2);
				    checksum = -1;
				}
			}
			if (checksum > 0) {
		      c = new Client(nom.getText(), prenom.getText(), adresse.getText(), tel.getText(), mail.getText(), (String) sexe.getSelectedItem(), dateTemp);
		      m.addCli(c);
		      new Fen3_Gest_Cli(m);
		      status = 1;
			}
		}
	}
} 