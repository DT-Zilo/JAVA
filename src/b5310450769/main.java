// Attribute        12
// Constructor      0
// Methods          0
// Main Program     0
//
// Total            12#

package b5310450769;
import java.util.Scanner;
public class main{
 public static void main(String[] args){
  }
   String Name;
   int count1,count2,z,r,sum=0;

    Scanner id = new Scanner(System.in);
     for(r=0;r<3;r++){
		 System.out.println("You Choose NumBer 1001 1002 1003");
		  count1  = id.nextInt();
		
		       
	     System.out.println("You put your nameProduct ");
		 Name = id.next();
		 
		 
		 System.out.println("You put your countproduct");
	      count2  = id.nextInt();
	         sum = sum+count2 ;
	      
		 Invectory a = new Invectory(count1,Name,sum); //constructor 
		 
		 
}
}
}