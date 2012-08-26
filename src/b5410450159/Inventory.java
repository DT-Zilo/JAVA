package b5410450159;


public class Inventory {
	private int[] numberItem ;
	private String[] nameItem ;
	private int[] item ;
	public Inventory(int n) {
		numberItem = new int[n]; 
		nameItem = new String[n];
		item = new int[n];
		
		
	}
	public void setName(int index,String nameItem){
		this.nameItem[index] = nameItem ;
		
		
	}
	public String getName(int index){
		return this.nameItem[index];
	}
	public void setItem(int index,int item){
		this.item[index] = item ;
	}
	public int getItem(int index){
		return this.item[index];
	}
	public void setNumberItem(int index,int numberItem){
		this.numberItem[index] = numberItem ;
	}
	public int getNumberItem(int index){
		return this.numberItem[index];
	}
	public void editItem(int editNumberItem,int editItem){
		int addess = editNumberItem-1000;
		this.item[addess] = editItem ;
		
	}
	public void editNameItem(int editNumberItem,String editNameItem){
		int addess = editNumberItem-1000;
		this.nameItem[addess] = editNameItem ;
	}
}
