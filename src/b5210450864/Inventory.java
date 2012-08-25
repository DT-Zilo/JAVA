
package b5210450864;

import java.io.InputStream;
import java.util.Scanner;

public class Inventory 
{
    private Scanner sc;

    String name1,name2,name3; // 2 point
    int id1,id2,id3; // 2 point
    int value1,value2,value3; // 2 point
    
    // มี attribute ครบ 3 ตัว 6 point

    public int idInventory()
    {
        for (int i = 0; i <= 2; i++) 
        {
                sc = new Scanner(System.in); // ไม่ได้ใช้อะไร
                sc = name(i); // Error

        }
    }
	
    public String nameInventory()
    {
        int[] name = new int[2];
        
        for (int j = 0; j <= 2; j++) 
        {
            sc = new Scanner(System.in);
            
            // ไม่ได้ทำอะไรเลย
            
        }
    }
	
    public int valueInventory()
    {
        int[] value = new int[2];
        
        for (int k = 0; k <=2; k++) 
        {
            sc = new Scanner(System.in);
            
            // ไม่ได้ทำอะไรเลย
        }	
    }

	


	
	
}