package b5310450441;
import java.util.Scanner;

public class lnventory 
{
    private Scanner sc = new Scanner(System.in);
    private int code [] = new int[100]; // 2 point
    private int x = 1000; // 6 point
    private String name[] = new String[100]; // 2 point
    private int count[] = new int[100];
    private int c;
    
    public lnventory() // 0 point
    {
        int i =0;
        int h=1;
        
        while(i<3)
        {
                System.out.println("Name"); //�����Թ���
                name[i] =sc.next();
                code[i] =x+h;
                System.out.println("Count"); //�ӹǹ�Թ���
                count[i]=sc.nextInt();	
                h++;
                i++;
        }
    }
	
    public void printname() // 4.33 point
    {
        int i=0;
        int o = 1;

        while(i<3)
        {
                System.out.println(o+":" + name[i]);
                o++;
                i++;

        }
    }
    
    public void editname() // 4.33 point
    {
        int j=0;
        
        while(j<3)
        {
            System.out.println("Edit name");
            String d = sc.next();
            name[j] = d;
            j++;
        }
    }
    
    public void Buy() // 5 point
    {
        int i =0;
        System.out.println("You want buy"); // ��ͧ��ë���������
        this.printname();
        int n = sc.nextInt();
        System.out.println("how must"); // �Ы����������
        int s = sc.nextInt();
        
        switch (n)
        {
            case 1: System.out.println("waiting");
                    if(s>count[0])
                    {
                        count[0] = count[0]+s;
                    }
                    else
                    {
                        count[0]=count[0]-s;
                    }
                    break;
            case 2: System.out.println("waiting");
                    if(s>count[1])
                    {
                        count[1] = count[1]+s;
                    }
                    else
                    {
                        count[1]=count[1]-s;
                    }
                    break;
            case 3: System.out.println("waiting");
                    if(s>count[2])
                    {
                        count[2] = count[2]+s;
                    }
                    else
                    {
                        count[2]=count[2]-s;
                    }
                    break;
        }
    }
	
    public void Checkstock() // 4.33 point
    {
        System.out.println("Stock");
        int i =0;
        System.out.println("Name   code   count");
        while(i<3)
        {
            System.out.println(name[i]+" "+code[i]+ " "+count[i]);
            i++;
        }
    }
    
}
	

