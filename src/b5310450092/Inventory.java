package b5310450092;

public class Inventory {

private String name;
private int count;
int id;

public Inventory(String name,int count,int id){
	this.id=id;
	this.name = name;
	this.count = count;
	
}

public String outName(){
	return this.name;
}

public void editName(String name){
	this.name = name;
	System.out.println("To success.");
}

public void addCount(int countAdd){
	this.count = this.count+countAdd;
	System.out.println("This "+this.name+" Outstanding = "+this.count);
}
public int showCount(){
	return this.count;
}


}
