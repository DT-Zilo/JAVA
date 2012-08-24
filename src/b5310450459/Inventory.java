package b5310450459;

import java.util.ArrayList;
import java.util.Scanner;


public class Inventory {
 private Scanner sc;
 private String name;
 int code = 1001;
 ArrayList<String> x = new ArrayList<String>();
 ArrayList<Integer> n = new ArrayList<Integer>();
 
 public void Constructor(){
	 Scanner sc = new Scanner(System.in);
	 for(int i=0;i<3;i++){
		 System.out.print("Please enter Name: ");
		 name = sc.next();
		 x.add(name);
		System.out.print("Please enter Number: ");
		 int num = sc.nextInt();
		 n.add(num);
	 }
   }
 
 public void Callname(){
	 for(int i=0;i<3;i++){
		 System.out.println(i+"."+x.get(i));
	 }
 }
 
 public void Editname(){
	 for(int i=0;i<3;i++){
	 System.out.print("Please enter Editname: ");
	 name = sc.next();
	 x.set(i,name);
  }
 }
 
public void Addstore(){
	 for(int i=0;i<3;i++){
	 System.out.print("Please enter Number: ");
	 int num = sc.nextInt();
	 n.set(i+1,num);
   }
 }

 public void Callstore(){
	 for(int i=0;i<3;i++){
	  System.out.print((i+1)+"."+x.get(i)+" have "+(n.get(i)+1)+"  ");
	 }
 }
 
}
