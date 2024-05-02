package lvt;

public class PicaFromMenu{
	private String name;
	private int diam; //piccas izmers
	private int cena, skaits;
	private String toppings;
	
	public  PicaFromMenu(String name, int diam, int cena, int skaits, String toppings) {
		this.name = name;
		this.diam = diam;
		this.cena = cena;
		this.skaits = skaits;
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
	
	public int getSkaits() {
		return skaits;
	}
	
	void setSkaits(int skaits) {
		this.skaits = skaits;
	}
	
	public String getToppings() {
		return toppings;
	}
	
	void setToppings(String toppings){
        this.toppings = toppings;
    }
	
    public String toString() {
		return  "\n\nNosaukums: "+getName()+
				"\nPiedavas: "+getToppings()+
				"\nIzmers: "+getDiam()+" cm"+
				"\nCena: "+getCena()+" euro"+
				"\nSkaits: "+getSkaits();
    }
}
