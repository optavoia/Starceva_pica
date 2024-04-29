package lvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Menu {
	
	private static int choosePicaIzmers() {
		String [] veidi = {"20", "30", "50"};
		int size = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Izvēlieties picas izmēru (cm):", 
				"Picas izmērs", JOptionPane.PLAIN_MESSAGE, null, veidi, veidi[0]));
		return size;
	}
	
	private static ArrayList<String> choosePiedavas(){
	    ArrayList<String> izveletasPiedavas = new ArrayList<String>();
	    String[] piedavas = {"Peperoni", "Sēnes", "Pipari", "Olīvas", "Sīpoli", "Tomāti", "Šķiņķis", "Vairs nevajag"};
	    boolean izvele = true;
	    while (izvele) {
	        String izveletaPiedava = (String) JOptionPane.showInputDialog(null, "Izvelies picas piedavas:", 
	                "Izveleties piedavas", JOptionPane.PLAIN_MESSAGE, null, piedavas, piedavas[0]);
	        
	        if (izveletaPiedava != null) {
	            if (!izveletaPiedava.equals("Vairs nevajag")) {
	                izveletasPiedavas.add(izveletaPiedava);
	            } else {
	                izvele = false;
	            }
	        } else {
	            izvele = false; 
	        }
	    }
	    return izveletasPiedavas;
	}
	
	private static String chooseMerce() {
	    String[] merces1 = {"Ķiploki", "Majonēze", "Kečups"};
	    String izveletaMerce = (String) JOptionPane.showInputDialog(null, "Izvēleties picas mērci: ", 
	            "Izvēleties mērci", JOptionPane.PLAIN_MESSAGE, null, merces1, merces1[0]);
	    if (izveletaMerce != null) {
	        return izveletaMerce;
	    } else {
	        return "";
	    }
	}
	
	public static void main(String[] args) {
		String izvele;
		int izvelesIndekss;
		String vards, uzvards, adresse, numurs;
		int diam = 0, cena = 0; //pie picas
		int numLength;
		
		String[] darbibas = {"User information", "Menu", "Make your own picca", "Order picca", "Information","Aizvert Menu"};
		String[] piccas = {"Peperoni", "Studentu", "Pikantā"};
		String[] izvele1 = {"Cenas", "Menu"};
		ArrayList<Object> picaFromMenu = new ArrayList<Object>();
		ArrayList<Object> YourOwnPicca = new ArrayList<Object>();
		ArrayList<Object> User = new ArrayList<Object>();
		
		ImageIcon peperoniImage = new ImageIcon("peperoni.png");
		ImageIcon studentuImage = new ImageIcon("Studentu.png");
		ImageIcon pikantaImage = new ImageIcon("Pikanta.png");
		
		//Picas
		PicaFromMenu pepperoni = new PicaFromMenu("Pepperoni", diam, cena,"\"Pepperoni\" desa, mocarella, kūpināts kausētais\n"
				+ "siers, \"Taco\" mērce, sīpolu čipsi, rukola,\ntomātu mērce, ķiploku mērce, oregano");
		picaFromMenu.add(pepperoni);
		
		PicaFromMenu studentu = new PicaFromMenu("Studentu", diam, cena,"\"Studentu\" Cūkgaļas šķiņķis, cīsiņi,"
				+ "mocarella\n, tomātu mērce, eļļas un ķiploku mērce, oregano");
		picaFromMenu.add(studentu);
		
		PicaFromMenu pikanta = new PicaFromMenu("Pikantā", diam, cena,"\"Pikantā\" Vistas gaļa, mocarella, konservēti ananasi,\n "
				+ "tomātu mērce, eļļas un ķiploku mērce, oregano");
		picaFromMenu.add(pikanta);
		
		//User info
		vards = JOptionPane.showInputDialog("Ievadiet vardu: ");
		uzvards = JOptionPane.showInputDialog("Ievadiet uzvardu: ");
		adresse = JOptionPane.showInputDialog("Ievadiet savu adressi: ");
		do {
			numurs = JOptionPane.showInputDialog("Ievadiet savu numuru: ");
			numLength = numurs.length();
		}while(numLength != 8);
		
		//BufferredWriter USER_INFO
		try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("user_info.txt"));
            
            writer.write("Vards: " + vards);
            writer.newLine();
            writer.write("Uzvards: " + uzvards);
            writer.newLine();
            writer.write("Adrese: " + adresse);
            writer.newLine();
            writer.write("Numurs: " + numurs);
            writer.close();
            
            System.out.println("Dati veiksmīgi ierakstīti failā.");
        } catch (IOException e) {
            System.out.println("Kļūda, rakstot failā: " + e.getMessage());
        }
		
		
		
		//IZVELE
		do {
			izvele = (String)JOptionPane.showInputDialog(null, "Izvēlies darbību", "Izvēle", 
					JOptionPane.QUESTION_MESSAGE, null, darbibas, darbibas[0]);
			izvelesIndekss = Arrays.asList(darbibas).indexOf(izvele);
			
			switch(izvelesIndekss) {
			//user info
			case 0:
				try {
				    BufferedReader reader = new BufferedReader(new FileReader("user_info.txt"));
				    StringBuilder content = new StringBuilder();
				    String line;
				    while ((line = reader.readLine()) != null) {
				        content.append(line).append("\n");
				    }
				    reader.close();
				    JOptionPane.showMessageDialog(null, content.toString());
				} catch (IOException e) {
				    System.out.println("Kļūda, lasot no faila: " + e.getMessage());
				}

				break;
			//Menu
			case 1:
				izvele = (String)JOptionPane.showInputDialog(null, 
						"Izvēlies ko tu gribi paskatities", "Izvēle", 
						JOptionPane.QUESTION_MESSAGE, null, 
						izvele1, izvele1[0]);
				izvelesIndekss = Arrays.asList(izvele1).indexOf(izvele);
				switch(izvelesIndekss) {
				
				
				//izvada cenas par piccam
				case 0:
					JOptionPane.showMessageDialog(null, "20 cm = 7 eur\n30 cm = 12 eur\n40cm = 16 eur\n50cm = 20 eur", "Cenas", JOptionPane.INFORMATION_MESSAGE);
					break;
				//picas
				case 1:	
					izvele = (String)JOptionPane.showInputDialog(null, 
							"Izvēlies picu kuru gribu paskatites", "Izvēle", 
							JOptionPane.QUESTION_MESSAGE, null, 
							piccas, piccas[0]);
					izvelesIndekss = Arrays.asList(piccas).indexOf(izvele);
					
					
					String bum1 ="";
					switch(izvelesIndekss) {
					case 0:
						bum1 += ((PicaFromMenu)picaFromMenu.get(izvelesIndekss)).izvadit();
						JOptionPane.showMessageDialog(null, bum1, "Pepperoni",
								JOptionPane.INFORMATION_MESSAGE, peperoniImage);
						break;
					case 1:
						bum1 += ((PicaFromMenu)picaFromMenu.get(izvelesIndekss)).izvadit();
						JOptionPane.showMessageDialog(null, bum1, "Studentu", 
								JOptionPane.INFORMATION_MESSAGE, studentuImage);
						break;
					case 2:
						bum1 += ((PicaFromMenu)picaFromMenu.get(izvelesIndekss)).izvadit();
						JOptionPane.showMessageDialog(null, bum1,"Pikanta",
								JOptionPane.INFORMATION_MESSAGE, pikantaImage);
						break;
					}
					break;

				}
				break;
			case 2:
				int izmers = choosePicaIzmers();
				ArrayList<String> piedavas = choosePiedavas();
				String merce = chooseMerce();
				MakePica myPica= new MakePica(izmers, piedavas, merce);
				
				JOptionPane.showMessageDialog(null, myPica.izvadit_ManaPica());
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
