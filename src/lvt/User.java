package lvt;


public class User {
	private String vards;
	private String uzvards;
	private String adresse;
	private String number;
	
	
	public User(String vards, String uzvards, String adresse, String number) {
		this.vards = vards;
		this.uzvards = uzvards;
		this.adresse = adresse;
		this.number = number;
	}
	
	public String getVards() {
		return vards;
	}
	
	void setVards(String vards){
        this.vards = vards;
    }
	
	public String getUzvards() {
		return vards;
	}
	
	void setUzvards(String uzvards){
        this.uzvards = uzvards;
    }
	
	public String getAdresse() {
		return vards;
	}
	
	void setAdresse(String adresse){
        this.adresse = adresse;
    }
	
	public String getNumber() {
		return number;
	}
	
	void setNumber(String number){
        this.number = number;
    }
}
