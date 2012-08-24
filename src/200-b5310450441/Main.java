package 200-b5310450441;
import java.util.Scanner;

import Test.lnventory;
public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to vending");
			lnventory c = new lnventory();
			c.printname();
			c.editname();
			c.Buy();
			c.Checkstock();
	}
}
