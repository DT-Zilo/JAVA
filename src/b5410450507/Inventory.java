
public class Inventory {
	private static int firstid = 1001;
	private int id;
	private String name;
	private int number;
	
	
	

	public Inventory(String name,int number){
		this.id = firstid;
		this.name = name;
		this.number = number;
		firstid++;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
		
	}
	public void setNumber(int number){
		this.number = this.number+number;
		
	}
	public void getNumber(){
		System.out.println("Number of "+name+"is "+number);
	}

}
