package b5410450256;

public class Inventory {
	
		private int codeProduct = 1001 ;

		private String name;
		private int numberProduct;
		public Inventory(int x,String n ){
		this.codeProduct += x ;
		this.name = n;
		this.numberProduct = 0;

		}
		
		public String newName(){
		return this.name;
		}
		
		public void editName(String n){
		this.name = n;
		}
		
		public void addProdouct(int x){
		this.numberProduct += x;
		}
		
		public int newProduct(){
		return this.numberProduct;
		}

		public int newcode(){
		return this.codeProduct;
		}


	}

