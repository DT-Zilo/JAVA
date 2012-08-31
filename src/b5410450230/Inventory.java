public class Inventory {
	private int code = 1001; // 6
	private String name; // 6
	private int count = 0; // 6
	public Inventory(String x,int i,int y){
		this.code += i; // 6
		this.name = x; // 6
		this.count = y; // 6
	}
	public void list(){ // 13
		System.out.print("Code : "+code+" | Name : "+name);
	}
	public void edit(String newName){ // 13
		this.name = newName;
	}
	public void add(int x){ // 15
		this.count += x;
	}
	public void stock(){ // 13
		System.out.println(" | Stock : "+count);
	}
}
