package b5410450604;

	public class Inventory {
		private int codeProduct = 1001 ;
		
		private String name;
		private int numProduct;
		public Inventory(int x,String n ){
			this.codeProduct += x ;
			this.name = n;
			this.numProduct = 0; 
			
		}
		public String dooName(){
			return this.name;	
		}
		public void editName(String n){
			this.name = n;
		}
		public void addProdouct(int x){
			this.numProduct += x;
		}
		public int dooProduct(){
			return this.numProduct;
			
		}
		
		public int doocode(){
			return this.codeProduct;
			
		}
		
		
		

	}


