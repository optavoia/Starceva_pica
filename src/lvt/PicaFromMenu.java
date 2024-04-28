package lvt;

public class PicaFromMenu {
	private String name;
	private int diam; //piccas izmers
	private int cena;
	private String toppings;
	
	public  PicaFromMenu(String name, int diam, int cena, String toppings) {
		this.name = name;
		this.diam = diam;
		this.cena = cena;
		this.toppings = toppings;
	}
	
	public String getName() {
		return name;
	}
	
	void setName(String name){
        this.name = name;
    }
	
	public int getDiam() {
		return diam;
	}
	
	void setDiam(int diam) {
		this.diam = diam;
	}
	
	public int getCena() {
		return cena;
	}
	
	void setCena(int cena) {
		this.cena = cena;
	}
	
	public String getToppings() {
		return toppings;
	}
	
	void setToppings(String toppings){
        this.toppings = toppings;
    }
	
	public String izvadit() {
	    String name = getName();
	    String toppings = getToppings();
	    
	    // Calculate the length of the longest line
	    int maxLength = Math.max(name.length(), toppings.length());

	    // Calculate the number of spaces needed to center-align the text
	    int spaces = (maxLength - name.length()) / 2;

	    // Construct the centered output
	    String centeredOutput = String.format("%" + (spaces + name.length()) + "s", name) +
	                            "\n" +
	                            String.format("%" + (spaces + toppings.length()) + "s", toppings);

	    return centeredOutput;
	}

}
