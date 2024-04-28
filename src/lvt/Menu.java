package lvt;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		String izvele;
		int izvelesIndekss;
		String vards, uzvards, adresse, numurs;
		int vecums;
		int diam = 0, cena = 0; //pie piccas
		
		String[] darbibas = {"User information", "Menu", "Order picca", "Make your own picca","Information","Aizvert Menu"};
		String[] piccas = {"Peperoni", "Studentu", "Pikantā"};
		String[] izvele1 = {"Cenas", "Menu"};
		ArrayList<Object> picaFromMenu = new ArrayList<Object>();
		ArrayList<Object> YourOwnPicca = new ArrayList<Object>();
		ArrayList<Object> User = new ArrayList<Object>();
		
		vards = JOptionPane.showInputDialog("Ievadiet vardu: ");
		uzvards = JOptionPane.showInputDialog("Ievadiet uzvardu: ");
		adresse = JOptionPane.showInputDialog("Ievadiet savu adressi: ");
		
		int numLength;
		do {
			numurs = JOptionPane.showInputDialog("Ievadiet savu numuru: ");
			numLength = numurs.length();
		}while(numLength != 8);
		
		User cilveks = new User(vards, uzvards, adresse, numurs);
		User.add(cilveks);
		JOptionPane.showMessageDialog(null, "Jūs esat veiksmīgi izveidojis kontu!","Paziņojums", JOptionPane.INFORMATION_MESSAGE);
		
		do {
			izvele = (String)JOptionPane.showInputDialog(null, "Izvēlies darbību", "Izvēle", 
					JOptionPane.QUESTION_MESSAGE, null, darbibas, darbibas[0]);
			izvelesIndekss = Arrays.asList(darbibas).indexOf(izvele);
			
			switch(izvelesIndekss) {
			case 0:
				String bum ="";
				bum += cilveks.izvadit();
				JOptionPane.showMessageDialog(null, bum, "User",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}
		}while(izvelesIndekss != 5);
		
	}
}
