// 48.66

import java.util.Scanner;
public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Inventory m = new Inventory();
		for(int i=0; i<3; i++){
			m.Add(i);
			m.Item(sc.nextInt(),i);
		}
		m.Name();
		}

}
