
import java.util.Scanner;

/**
 * @version 4.0
 * 
 * @author Shodmon Babakhanzoda
 */

// Program that offers to buy one cup of coffee, to fill up the ingredients, or to take its money.
// At the same time, the program should calculate how many ingredients it has left.
// And also display the number of ingredients before and after purchase.
public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		giveStorageInfo();
		System.out.println();
		System.out.println("Write action (buy, fill, take):");
		String option = scanner.nextLine();
		switch (option) {
		case "buy":
			sellCoffee();
			break;
		case "fill":
			fillMachine();
			break;
		case "take":
			takeMoney();
			break;
		}

//		System.out.println("Write how many cups of coffee you will need:");
//		int reqCoffeeCups = scanner.nextInt();
		// calculateIngredients(reqCoffeeCups);

//		if (reqCoffeCups*200 == Storage.milk && reqCoffeCups*200 == Storage.milk && reqCoffeCups*200 == Storage.milk) {
//			
//		}

//		calculate(Storage.water, Storage.milk, Storage.coffeeBeans, reqCoffeeCups);

	}

	private static void giveStorageInfo() {
		// TODO Auto-generated method stub
		System.out.println("The coffee machine has:\r\n" + Storage.water + " ml of water\r\n" + Storage.milk
				+ " ml of milk\r\n" + Storage.coffeeBeans + " g of coffee beans\r\n" + Storage.disposableCups
				+ " disposable cups\r\n" + "$" + Storage.money + " of money");
	}

	static void sellCoffee() {
		// Sell coffee. It can make different varieties of coffee: espresso, latte, and
		// cappuccino.
		// Of course, each variety requires a different amount of supplies,
		// except that all of them require only one disposable cup.
		int option = 0;
		System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
		option = scanner.nextInt();

		switch (option) {
		// espresso
		case 1:
			Storage.water -= 250;
//			Storage.milk -= 540;
			Storage.coffeeBeans -= 16;
			Storage.disposableCups -= 1;
			Storage.money += 4;
			break;
		// latte
		case 2:
			Storage.water -= 350;
			Storage.milk -= 75;
			Storage.coffeeBeans -= 20;
			Storage.disposableCups -= 1;
			Storage.money += 7;
			break;
		// cappuccino
		case 3:
			Storage.water -= 200;
			Storage.milk -= 100;
			Storage.coffeeBeans -= 12;
			Storage.disposableCups -= 1;
			Storage.money += 6;
			break;
		}
		
		System.out.println();
		giveStorageInfo();
	}

	static void fillMachine() {
		System.out.println("Write how many ml of water you want to add:");
		Storage.water += scanner.nextInt();
		System.out.println("Write how many ml of milk you want to add:");
		Storage.milk += scanner.nextInt();
		System.out.println("Write how many grams of coffee beans you want to add:");
		Storage.coffeeBeans += scanner.nextInt();
		System.out.println("Write how many disposable cups of coffee you want to add:");
		Storage.disposableCups += scanner.nextInt();
		System.out.println();
		giveStorageInfo();
	}

	static void takeMoney() {
		System.out.println("I gave you $" + Storage.money + "\n");
		Storage.money -= Storage.money;
		giveStorageInfo();
	}

	static void calculateIngredients(int reqCoffeeCups) {
		int water, milk, cBeans;
		water = reqCoffeeCups * 200;
		milk = reqCoffeeCups * 50;
		cBeans = reqCoffeeCups * 15;

//		System.out.println("For " + reqCoffeeCups + " cups of coffee you will need:" + "\n" + water + " ml of water"
//				+ "\n" + milk + " of milk" + "\n" + cBeans + " g of coffee beans");
	}

	static void calculate(int waterStorage, int milkStorage, int coffeeBeansStorage, int reqCoffeeCups) {
//		water = reqCoffeeCups * 200;
//		milk = reqCoffeeCups * 50;
//		cBeans = reqCoffeeCups * 15; 

		int waterEnoughForACoffeCup = waterStorage / 200;
		int milkEnoughForACoffeCup = milkStorage / 50;
		int coffeeBeansEnoughForACoffeCup = coffeeBeansStorage / 15;

		int numberOfIngredientsForSingleCup[] = { waterEnoughForACoffeCup, milkEnoughForACoffeCup,
				coffeeBeansEnoughForACoffeCup };
		Storage.availableCupsOfCoffee = numberOfIngredientsForSingleCup[0];

		for (int ingredient : numberOfIngredientsForSingleCup) {
			if (ingredient < Storage.availableCupsOfCoffee) {
				Storage.availableCupsOfCoffee = ingredient;
			}
		}

//		System.out.println(waterEnoughForACoffeCup);
//		System.out.println(milkEnoughForACoffeCup);
//		System.out.println(coffeeBeansEnoughForACoffeCup);

		if (Storage.availableCupsOfCoffee == reqCoffeeCups) {
			System.out.println("Yes, I can make that amount of coffee");
		} else if (Storage.availableCupsOfCoffee > reqCoffeeCups) {
			System.out.println("Yes, I can make that amount of coffee (and even + "
					+ (Storage.availableCupsOfCoffee - reqCoffeeCups) + " more than that)");
		} else
			System.out.println("No, I can make only " + Storage.availableCupsOfCoffee + " cup(s) of coffee");

	}

}