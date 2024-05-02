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
		
		String[] darbibas = {"User information", "Menu", "Pasūtīt picu", "Paskatities pasūtījumu","Aizvert Menu"};
		String[] piccas = {"Peperoni", "Studentu", "Pikantā"};
		String[] izvele1 = {"Cenas", "Menu", "\"Izveidojiet savu picu\" info"};
		String[] izvele2 = {"No menu", "Izveidojiet savu picu"};
		String[] piegade = {"Piegādāt uz adresi", "Izņemt uz vietas"};
		ArrayList<Object> picaFromMenu = new ArrayList<Object>();
		ArrayList<Object> YourOwnPicca = new ArrayList<Object>();
		ArrayList<Object> User = new ArrayList<Object>();
		ArrayList<Object> order = new ArrayList<Object>();
		
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
		
		//User info input
		 do {
	            vards = JOptionPane.showInputDialog("Ievadiet vardu:");
	        } while (vards == null || vards.trim().isEmpty());
		 
		 do {
	            uzvards = JOptionPane.showInputDialog("Ievadiet uzvardu: ");
	        } while (uzvards == null || uzvards.trim().isEmpty());
		
		 do {
	            adresse = JOptionPane.showInputDialog("Ievadiet savu adressi: ");
	        } while (adresse == null || adresse.trim().isEmpty());
		
		do {
			numurs = JOptionPane.showInputDialog("Ievadiet savu numuru: ");
			numLength = numurs.length();
		}while(numLength != 8);
		
		User cilveks = new User(vards, uzvards, adresse, numurs);
		
		
		
		
		//IZVELE
		do {
			izvele = (String)JOptionPane.showInputDialog(null, "Izvēlies darbību", "Izvēle", 
					JOptionPane.QUESTION_MESSAGE, null, darbibas, darbibas[0]);
			izvelesIndekss = Arrays.asList(darbibas).indexOf(izvele);
			
			switch(izvelesIndekss) {
			//user info display
			case 0:
				JOptionPane.showMessageDialog(null, cilveks.izvadit());
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
					JOptionPane.showMessageDialog(null, "20 cm = 7 eur\n30 cm = 12 eur\n50cm = 20 eur", "Cenas", JOptionPane.INFORMATION_MESSAGE);
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
				case 2:
					JOptionPane.showMessageDialog(null, "Pieejamie picu izmēri: 20, 30 un 50 cm"
							+ "\nPieejamas piedavas: \"Peperoni\", \"Sēnes\", \"Pipari\", \"Olīvas\", \"Sīpoli\", \"Tomāti\", \"Šķiņķis\", \"Vairs nevajag\""
							+ "\nPieejamās mērces: \"Ķiploki\", \"Majonēze\", \"Kečups\"", "Informacija", JOptionPane.PLAIN_MESSAGE);
					break;
				}
				break;
			case 2:
				
				izvele = (String)JOptionPane.showInputDialog(null, 
						"Izvēlies ko tu gribi paskatities", "Izvēle", 
						JOptionPane.QUESTION_MESSAGE, null, 
						izvele2, izvele2[0]);
				izvelesIndekss = Arrays.asList(izvele2).indexOf(izvele);
				
				switch(izvelesIndekss) {
				case 0:
					izvele = (String)JOptionPane.showInputDialog(null, 
							"Izvēlies ko tu gribi paskatities", "Izvēle", 
							JOptionPane.QUESTION_MESSAGE, null, 
							piccas, piccas[0]);
					izvelesIndekss = Arrays.asList(piccas).indexOf(izvele);
					
					if(izvelesIndekss == 0) {
						order.add(pepperoni);
					}else if(izvelesIndekss == 1) {
						order.add(studentu);
					}else if(izvelesIndekss == 2) {
						order.add(pikanta);
					}
					
					break;
				case 1:
					int izmers = choosePicaIzmers();
					ArrayList<String> piedavas = choosePiedavas();
					String merce = chooseMerce();
					
					MakePica myPica= new MakePica(izmers, piedavas, merce);
					order.add(myPica);
					
					JOptionPane.showMessageDialog(null, myPica.izvadit_ManaPica());
					
					try {
			            BufferedWriter writer = new BufferedWriter(new FileWriter("order.txt"));
			            
			            writer.write("Jūsu pasūtījums:");
			            writer.newLine();
			            
			            for (Object obj : order) {
			                if (obj instanceof Pica) {
			                    writer.write(obj.toString());
			                    writer.newLine();
			                }
			            }
			            writer.close();
			            
			            System.out.println("Dati veiksmīgi ierakstīti failā.");
			        } catch (IOException e) {
			            System.out.println("Kļūda, rakstot failā: " + e.getMessage());
			        }
					
					break;
				}
				break;
			case 3:
				try {
				    BufferedReader reader = new BufferedReader(new FileReader("order.txt"));
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
			case 4:
				JOptionPane.showMessageDialog(null, "Uz redzēšanos!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE); 
				System.exit(0);
				break;
			}
		}while(izvelesIndekss != 4);
		
	}
}
