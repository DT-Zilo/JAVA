
public class Inventory {

	private String nameProduct;
	private int numProduct;
	private int idProduct = 1001;
	
	public Inventory(int x, String name){
		idProduct += x;
		nameProduct = name ;
		numProduct = 0;
	}
	
	public String viewName(){
		return nameProduct;
	}
	
	public void editName(String name){
		nameProduct = name;
	}
	public void plusPro(int num){
		numProduct += num;
	}
	public int getPro(){
		return numProduct;
	}
	
	public int viewNum(){
		return idProduct;
	}
	
}
