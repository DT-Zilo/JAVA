
public class Inventory {
	private int code=1001;
	private String name[]=new String[3];
	private int number[]=new int[3];
	private int i;
	
	public Inventory(String name,int number){
		
		this.name[i] = name;
		this.number[i] = number;
		this.code++;
	}
	
	public void getName(){
		for(i=0;i<3;i++)
		System.out.println(name[i]);
	}
	
	public void setName(String name){
		this.name[i] = name;
	}
	
	public void setNumber(int number){
		this.number[i] = this.number[i]+number;

	}
	
	public void getNumber(){
		for(i=0;i<3;i++)
		System.out.println(number[i]);
	}
	
	
	public void print(){
		for(int i=0;i<3;i++){
			System.out.println(this.name[i]+this.number[i]);
		}
	}
	
	
}
