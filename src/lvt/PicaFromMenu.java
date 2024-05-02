package lvt;

public class PicaFromMenu implements Pica{
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
	
	@Override
    public String toString() {
		return  "\n\nNosaukums: "+getName()+
				"\nToppings: "+getToppings();
    }
	
	public String izvadit() {
		return  "\n\nNosaukums: "+getName()+
				"\nPiedavas: "+getToppings();
	}
}
