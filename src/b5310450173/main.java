package b5310450173;

import java.util.Scanner;

public class main {
public static void main(String[] args){
int number1 = 0;
String name ;
int sum = 0 ;
int count = 1000 ;
Scanner sc = new Scanner(System.in);
for(int i = 0 ; i < 3 ;i++){
	System.out.println("Enter Name product = ");
	name = sc.next();
	count = count + 1;
	System.out.println(name+" number "+count);
	System.out.println("How many product = ");
	number1 = sc.nextInt();
	sum = sum + number1;
}

Inventory  s = new Inventory(count,number1,sum);  
s.getprint();
	}

}




