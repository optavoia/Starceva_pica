package lvt;

import java.util.ArrayList;

public class MakePica {
	private int izmers;
	private ArrayList<String> piedavas;
	private String merce;
	
	public MakePica(int izmers, ArrayList<String> piedavas, String sauce){
		this.izmers = izmers;
		this.piedavas = piedavas;
		this.merce = merce;
	}
	
	public String izvadit_ManaPica() {
		StringBuilder apraksts= new StringBuilder();
		apraksts.append("Izmērs: ").append(izmers).append(" cm\n");
		apraksts.append("Piedevas: ").append(String.join(", ", piedavas)).append("\n");
		apraksts.append("Mērce: ").append(merce).append("\n");
		return apraksts.toString();	
	}
}
