import java.util.ArrayList;
import java.util.Scanner;


public class Constructor {

	public int Sum;
	Scanner sc = new Scanner(System.in);
	
	public void name(ArrayList<String> a,ArrayList<Integer> b,ArrayList<Integer> c){
		for(int i=0;i<=2;i++){
			System.out.println(b.get(i) +":" +a.get(i));
		}
	}
public void addName(ArrayList<String> a,ArrayList<Integer> b,ArrayList<Integer> c){
	for(int i=0;i<=2;i++){
		System.out.printf("Enter Name" +b.get(i) +":" );
	String name = sc.nextLine();
		a.add(name);}
	}
public void addNum(ArrayList<String> a,ArrayList<Integer> b,ArrayList<Integer> c){
	for(int i=0;i<=2;i++){
		System.out.printf("Plus Num" +b.get(i) +":" );
		
		int num = sc.nextInt();
		Sum = c.get(i);
			c.add(num+Sum);}
}
public void num(ArrayList<String> a,ArrayList<Integer> b,ArrayList<Integer> c){
	for(int i=0;i<=2;i++){
		System.out.println(b.get(i) +":" +a.get(i)+"="+c.get(i));
	}
}
}
