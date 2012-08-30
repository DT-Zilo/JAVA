
public class Inventory {
	private int code = 1001;
	private String name;
	private int count = 0;
	public Inventory(String x,int i,int y){
		this.code += i;
		this.name = x;
		this.count = y;
	}
	public void list(){
		System.out.print("Code : "+code+" | Name : "+name);
	}
	public void edit(String newName){
		this.name = newName;
	}
	public void add(int x){
		this.count += x;
	}
	public void stock(){
		System.out.println(" | Stock : "+count);
	}
}
