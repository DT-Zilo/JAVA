package b5310450165;

import java.util.Scanner; 
//ort java.util.ArrayList;
public class Inventory 
{
    public Scanner sc;
    public String namep; // 6 point
    public int num = 0; // 6 point
    public int ID = 1001; // 6 point
    public int i;

    public Inventory() // 0 point
    {
        for(int i=0;i<3;i++)
        {
            String []arry = new String[3];
            Scanner sc = new Scanner(System.in);
            this.namep = sc.next();
            arry[i] = this.namep;
        }

        for(int i=0;i<3;i++)
        {
            Integer []ary = new Integer[3];
            ary[i] = 1001+i;
            ID = ary[i];
        }

        for(int i=0;i<3;i++)
        {
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
    
    public void printResult() // 0 point
    {
        for(int i=0;i<3;i++)
        {
            System.out.println(namep);
        }
     }
}
