
public class Inventory {
public Inventory(){
	String product[] = new String[3];
	product[0] = "soap";
	product[1] = "shampoo";
	product[2] = "toothpaste";
}
	public void call(int x){
	if(x==1)System.out.println("soap");
	if(x==2)System.out.println("shampoo");
	if(x==3)System.out.println("toothpaste");
}

	public void rename (int x,String[] product, String y){	
		if(x==1)product[0] = y;
			if(x==2)product[1] = y;
				if(x==3)product[2] = y;
					
	}
	
	public void add(int x, int[] num){
		if(x==1)num[0]++;
			if(x==2)num[1]++;
				if(x==3)num[2]++;
		
	}
	
	public void number(int x, String[] num){
		if(x==1)System.out.println(num[0]);
		if(x==2)System.out.println(num[1]);
		if(x==3)System.out.println(num[2]);
	}
	
}
