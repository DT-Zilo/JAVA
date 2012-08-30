


public class Inventory {
	public  Inventory(){
		int num=0;
		String product[] = new String[3];
				 product[0] = "Iphone";
				 product[1] = "Ipad";
				 product[2] = "Ipod";}
				 
	 public void call(int x){
		 if(x==1){
			 System.out.println("Iphone");
		 }
		 else if (x==2){
			 System.out.println("Ipad");
		 }
		 else if (x==3){
			 System.out.println("Ipod");
		 }
			 
		 public void rename(int x,String[] product, String y){
			
			 if (x==1){
				 product[0]= y;
			}
			 if (x==2){
				 product[1]=y;
			 }
			 if (x==3){
				product [2]=y; 
			 }
			 
		public void add (int x,String[] num){
			if (x==1){
				System.out.println(num[0]);
			}
			if (x==2){
				System.out.println(num[1]);
			}
			if (x==3){
				System.out.println(num[2]);
			}
		}
		 }
		 }
	 }
		