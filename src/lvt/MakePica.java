package lvt;

import java.util.ArrayList;

public class MakePica implements Pica{
	private String nosaukums;
	private int izmers;
	private ArrayList<String> piedavas;
	private String merce;
	
	public MakePica(String nosaukums ,int izmers, ArrayList<String> piedavas, String merce){
		this.izmers = izmers;
		this.piedavas = piedavas;
		this.merce = merce;
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
	
	@Override
    public String toString() {
		return  "\n\nNosaukums: "+getNosaukums()+
				"\nIzmers: "+getIzmers()+
				"\nPiedavas: "+getPiedavas()+
				"\nMerce: "+getMerce();
    }
	
	public String izvadit() {
			return  "\n\nNosaukums: "+getNosaukums()+
					"\nIzmers: "+getIzmers()+
					"\nPiedavas: "+getPiedavas()+
					"\nMerce: "+getMerce();
		}	
	}
