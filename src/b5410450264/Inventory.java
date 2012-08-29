//Attribute: 0 	เหมือน 329
//Constructor: 0
//Method: 0
//Main: 0

package b5410450264;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	private static int startId = 1001;
	private int id;
	private String name;
	private int amount;

	public Inventory(String name) {
		this.id = startId;
		this.startId++;
		this.name = name;
		this.amount = 0;

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addAmount(int amount) {
		this.amount += amount;
	}

	public int getAmount() {
		return this.amount;
	}

	public int getId() {
		return this.id;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Inventory> data = new ArrayList<Inventory>();
		String name;

		// Input name product 3 product, Create Object 3 Object
		for (int i = 1; i <= 3; i++) {
			System.out.print("Input name product " + i + " => ");
			name = sc.next();
			data.add(new Inventory(name));
		}

		System.out.println();

		// addAmountProduct
		for (int i = 0; i < 3; i++) {
			System.out.print("Input addAmountProduct " + (i + 1) + " => ");
			data.get(i).addAmount(sc.nextInt());
		}

		System.out.println();

		// show name product, show amount product
		for (int i = 0; i < 3; i++) {
			System.out.println("< Product : " + (i + 1) + " >");
			System.out.println("Id Product is " + data.get(i).getId());
			System.out.println("Name product is " + data.get(i).getName());
			System.out.println("Amount product is " + data.get(i).getAmount());
			System.out.println();
		}

	}

}
