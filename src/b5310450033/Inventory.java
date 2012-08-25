package b5310450033;

import java.util.Scanner;

public class Inventory 
{
    Scanner sc = new Scanner(System.in);

    int[] code = new int[3]; // 2 point


    String name; // 6 point
    int total ; // 6 point


    public Inventory(String x,int y)
    {
        code[0] = 1001; // 2 point
        
        this.name = x; // 6 point
        this.total = y; // 6 point
        
        for(int i=0;i<y;i++)
        {
            code[i]= code[0]+i; // 0 คะแนน ไม่มีทางกำหนดค่าได้อย่างถูกต้อง
            System.out.println(code[i]);
        }
    }

    public String callname() // 13 point
    {
        return this.name;
    }

    public String editname() // 4.33333333333333333333 point
    {
        this.name = sc.next();
        return this.name;
    }
    public int edittotal() // 5 point
    {
        int addtotal = sc.nextInt();
        this.total = this.total+addtotal;
        
        return this.total;
    }
    
    public int calltotal() // 13 point
    {
        return this.total;
    }
}
