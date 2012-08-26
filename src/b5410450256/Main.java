package b5410450256;


import java.util.Scanner;


public class Main {

/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
Inventory[] petz = new Inventory[3];
for(int i = 0 ; i<3 ;i++){ 

System.out.print("Enter name Product "+(i+1)+" : ");
String n ;
n = sc.next();
petz[i] = new Inventory(i,n);

System.out.print("Edit Name Product (y/n) : "); 
String c ;
c = sc.next();
if(c.equals("y")){
System.out.print("New name :");
String n1;
n1 = sc.next();
petz[i].editName(n1);
}

System.out.print("Add Number Product :"); 
int add;
add = sc.nextInt();
petz[i].addProdouct(add);

System.out.print("Add Product (y/n) :");
String d;
d = sc.next();
if(d.equals("y")){
System.out.print("Add Number Product :");
int add1;
add1 = sc.nextInt();
petz[i].addProdouct(add1);
}
System.out.println("*************************************");
}//for
System.out.println("*********** SHOW LIST ***************");
for(int i=0 ; i<3 ; i++){ 

System.out.println("Name Product "+(i+1)+" : "+petz[i].newName());
System.out.println("Code Product "+(i+1)+" : "+petz[i].newcode());
System.out.println("Amount Product "+(i+1)+" : "+petz[i].newProduct());
System.out.println("-----------------------------------------");


}

}

}