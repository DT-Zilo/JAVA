package junen;

public class Inventory {
	 private int codeProduct = 1001;
	 private String nameProduct;
	 private int numberProduct;
	 
	 public Inventory(int m,String n){
		 this.codeProduct = codeProduct+m;
		 this.nameProduct = n;
		 this.numberProduct =0;
		 
	 }
	 public String doName(){
		 return this.nameProduct;
	 }
	 public void edit(String n){
		 this.nameProduct = n;
	 }
	public void add(int m){
		this.numberProduct = numberProduct+m;
	}
	public int doProduct(){
		return this.numberProduct;
	}
	public int docode(){
		return this.codeProduct;
	}
}
