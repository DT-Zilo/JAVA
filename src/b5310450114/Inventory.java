import java.util.Scanner ;
public class Inventory {
	
	
	public Inventory() {
		// TODO Auto-generated constructor stub	
		System.out.print(" ");
		
	}
	
	public void code () {
		System.out.println("Code of Product : ")
		
	}

	public static void main(String[] args) {
	
		int code ;
		String name  ;
		int count = 0 ;
		int i ;
		
		Scanner sc = new Scanner (System.in) ;
		for (i=0;i<=3;i++){           // loop of �Ѻ����Թ��Ҩӹǹ 3 ��� //
			System.out.println("Please enter name of product : ");  
			name = sc.next() ;
			count++ ;		
		}
	
			
	System.out.println(" ���ͧ͢�Թ��� " + name );
	System.out.println(" �ӹǹ�Թ��Ҥ������ "  ) ;
	
		
	}
	
}
