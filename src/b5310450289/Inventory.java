package b5310450289;

import java.util.Scanner;


public class Inventory 
{
    public Inventory() // 0 point
    {
        int[]ID 	= 	new int[100]; 
        String[]product	=	new String [3]; 
        int[]numpro 	= 	new int[100]; 
        int i=0;

        System.out.println("Please Enter ProductName :");
        Scanner bz	= new Scanner(System.in);
        product[i] 	= bz.next();
        ID[i] 		= bz.nextInt();
        numpro[i] 	= bz.nextInt();

        System.out.println("Please Change ProductName :");
        product[i] = bz.next();

        while(i<=3)
        {
            product[i] = product[i] + i;
            i++;
        }

        System.out.println("ProductName :" 	+ product[i]);
        System.out.println("Product :" 		+ numpro[i]);

    }
}
	

