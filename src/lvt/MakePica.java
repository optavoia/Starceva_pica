package lvt;

import java.util.ArrayList;

public class MakePica{
	private String nosaukums;
	private int izmers;
	private int cena, skaits;
	private ArrayList<String> piedavas;
	private String merce;
	
	public MakePica(String nosaukums ,int izmers, int cena , int skaits,ArrayList<String> piedavas, String merce){
		this.izmers = izmers;
		this.cena = cena;
		this.piedavas = piedavas;
		this.merce = merce;
		this.skaits = skaits;
		this.nosaukums = nosaukums;
	}
	
	public String getNosaukums() {
		return nosaukums;
	}
	
	void setNosaukums(String nosaukums){
        this.nosaukums = nosaukums;
    }
	
	public int getIzmers() {
		return izmers;
	}
	
	void setIzmers(int izmers){
        this.izmers = izmers;
    }
	
	public int getSkaits() {
		return skaits;
	}
	
	void setSkaits(int skaits){
        this.skaits = skaits;
    }
	
	public int getCena() {
		return cena;
	}
	
	void setCena(int cena){
        this.cena = cena;
    }
	
	public ArrayList<String> getPiedavas() {
        return piedavas;
    }

    public void setPiedavas(ArrayList<String> piedavas) {
        this.piedavas = piedavas;
    }
    
    public String getMerce() {
		return merce;
	}
	
	void setMerce(String merce){
        this.merce = merce;
    }
	
    public String toString() {
		return  "\n\nNosaukums: "+getNosaukums()+
				"\nPiedavas: "+getPiedavas()+
				"\nMerce: "+getMerce()+
				"\nIzmers: "+getIzmers()+" cm"+
				"\nCena: "+getCena()+" euro"+
				"\nSkaits: "+getSkaits();
    }
}
