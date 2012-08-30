public class Inventory {

	private int code = 1001;
	private int a;
	private String Name;
	
	
	public Inventory(int b , String c){
	this.code += b;
	this.Name = c;
	this.a = 0;
	
			
	}
		
		
	public String getName(){
		return this.Name;
		}
	
	public void setName(String c){
		this.Name = c;
	}
	
	public int getNumber(){
		return this.a;
	}
	
	public void setInventory(int b){
	this.a += b;
	}
	
	public int getCode(){
		return this.code;
	}
	
}

