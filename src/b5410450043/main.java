package Tests;

import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Inventory a = new Inventory();
		for (int i = 0; i < 3; i++) {
			a.add(i);
			a.addItem(sc.nextInt(),i);
		}
		a.showName();
	}

}
