package 200-b5310450165;

import java.util.Scanner; 
//ort java.util.ArrayList;
public class Inventory {
       public Scanner sc;
       public String namep;
       public int num = 0;
       public int ID = 1001;
       public int i;
       
       public Inventory(){
    	   for(int i=0;i<3;i++){//name
               String []arry = new String[3];
               Scanner sc = new Scanner(System.in);
               this.namep = sc.next();
    		   arry[i] = this.namep;
    	   }
    	   
    	   for(int i=0;i<3;i++){
    		   Integer []ary = new Integer[3];
    		   ary[i] = 1001+i;
    		   ID = ary[i];
    	   }
    	   
    	   for(int i=0;i<3;i++){//Count
    		   Integer [] arr = new Integer[3];
    		   Scanner sc = new Scanner(System.in);
    		   arr[i] = sc.nextInt();
    	     
    	   }
       }
/*public void getName(){
    	 ArrayList<String> arry = new ArrayList<String>(3);
    	 arry.get(0);
    	arry.get(1);
    	arry.get(2);
     }
  public void editP(){
	  
  }*/
    public void printResult(){
    	   for(int i=0;i<3;i++){
    	   System.out.println(namep);
    	   }
     }
}
