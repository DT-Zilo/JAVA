import java.util.Scanner;


public class Inventory {
	
	public int[] item = new int[3],code = new int[3];
	public String[] ItemName = new String[3];
	public int num;
	Scanner sc = new Scanner(System.in);
	
	public Inventory(){
		code[num] = 1001;
		item[num] = 0;          
	}
	
	public void FixItem(int i, int x){
		item[i] = x;
	}
	public void Fix(int i,String x){
		ItemName[i] = x;
	}
	
	public void Name(){
		for(int i = 0; i<3;i++){
		System.out.println("Name : "+ItemName[i]+"	"+"Code : "+code[i]+"	"+"Stock : "+item[i]);
		}
	}
	
	public void Item(int x,int i){
		item[i] = item[i]+x;
	}
	
	public void Add(int x){
		System.out.print("Name : ");
		ItemName[x] =sc.nextLine();
		code[x] = 1001+x;
	}
}