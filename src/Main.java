
import java.util.Scanner;

/**
 * @version 5.0
 * 
 * @author Shodmon Babakhanzoda
 */

// Program that will work endlessly to make coffee for all 
// interested persons until the shutdown signal is given.

class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();

//		System.out.println("Write how many cups of coffee you will need:");
//		int reqCoffeeCups = scanner.nextInt();
		// calculateIngredients(reqCoffeeCups);

//		if (reqCoffeCups*200 == Storage.milk && reqCoffeCups*200 == Storage.milk && reqCoffeCups*200 == Storage.milk) {
//			
//		}

//		calculate(Storage.water, Storage.milk, Storage.coffeeBeans, reqCoffeeCups);

	}

	static void menu() {
		// TODO Auto-generated method stub
		boolean repeatMenu = true;

		while (repeatMenu) {
			System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
			String option = scanner.next();
			switch (option) {
			case "buy":
				makeCoffee();
				break;
			case "fill":
				fillMachine();
				break;
			case "take":
				takeMoney();
				break;
			case "remaining":
				giveStorageInfo();
				break;
			case "exit":
				repeatMenu = false;
				break;
			default:
				System.out.println("Invalid entry");
				break;
			}
		}
	}

	static void giveStorageInfo() {
		// TODO Auto-generated method stub
		System.out.println("\nThe coffee machine has:\r\n" + Storage.water + " ml of water\r\n" + Storage.milk
				+ " ml of milk\r\n" + Storage.coffeeBeans + " g of coffee beans\r\n" + Storage.disposableCups
				+ " disposable cups\r\n" + "$" + Storage.money + " of money");
	}

	static void makeCoffee() {
		// Sell coffee. It can make different varieties of coffee: espresso, latte, and
		// cappuccino.
		// Of course, each variety requires a different amount of supplies,
		// except that all of them require only one disposable cup.
		String option = "";
		System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
		option = scanner.next();

		switch (option) {
		// espresso
		case "1":
			if (espressoChecker()) {
				Storage.water -= 250;
				Storage.coffeeBeans -= 16;
				Storage.disposableCups -= 1;
				Storage.money += 4;
			}
			break;
		// latte
		case "2":
			if (latteChecker()) {
				Storage.water -= 350;
				Storage.milk -= 75;
				Storage.coffeeBeans -= 20;
				Storage.disposableCups -= 1;
				Storage.money += 7;
				
			}
			break;
			// cappuccino
		case "3":
			if (cappuccinoChecker()) {
				Storage.water -= 200;
				Storage.milk -= 100;
				Storage.coffeeBeans -= 12;
				Storage.disposableCups -= 1;
				Storage.money += 6;
			}
			break;
		case "back":
			break;
		default: 
			System.out.println("Invalid entry");
		} 
			
		
	}

	static boolean espressoChecker() {
		// TODO Auto-generated method stub

		// Ingredients needed:
		// Storage.water -= 250;
		// Storage.coffeeBeans -= 16;
		// Storage.disposableCups -= 1;

		boolean espreIsAvailable = true;
		while (espreIsAvailable) {
			if (Storage.water >= 250) {
				espreIsAvailable = true;
			} else {
				espreIsAvailable = false;
				System.out.println("Sorry, not enough water!");
				break;
			}
			if (Storage.coffeeBeans >= 16) {
				espreIsAvailable = true;
			} else {
				espreIsAvailable = false;
				System.out.println("Sorry, not enough coffee beans!");
				break;
			}
			if (Storage.disposableCups >= 1) {
				espreIsAvailable = true;
				break;
			} else {
				espreIsAvailable = false;
				System.out.println("Sorry, not enough disposable cups!");
				break;
			}
		}
		if (espreIsAvailable) {
			System.out.println("I have enough resources, making you a coffee!");
		}
		return espreIsAvailable;
	}

	static boolean latteChecker() {
		// TODO Auto-generated method stub

		// Ingredients needed:
		// Storage.water -= 350;
		// Storage.milk -= 75;
		// Storage.coffeeBeans -= 20;
		// Storage.disposableCups -= 1;

		boolean latteIsAvailable = true;
		while (latteIsAvailable) {
			if (Storage.water >= 350) {
				latteIsAvailable = true;
			} else {
				latteIsAvailable = false;
				System.out.println("Sorry, not enough water!");
				break;
			}
			if (Storage.milk >= 75) {
				latteIsAvailable = true;
			} else {
				latteIsAvailable = false;
				System.out.println("Sorry, not enough milk!");
				break;
			}
			if (Storage.coffeeBeans >= 20) {
				latteIsAvailable = true;
			} else {
				latteIsAvailable = false;
				System.out.println("Sorry, not enough coffee beans!");
				break;
			}
			if (Storage.disposableCups >= 1) {
				latteIsAvailable = true;
				break;
			} else {
				latteIsAvailable = false;
				System.out.println("Sorry, not enough disposable cups!");
				break;
			}
		}
		if (latteIsAvailable) {
			System.out.println("I have enough resources, making you a coffee!");
		}
		return latteIsAvailable;
	}

	static boolean cappuccinoChecker() {
		// TODO Auto-generated method stub

		// Ingredients needed:
		// Storage.water -= 200;
		// Storage.milk -= 100;
		// Storage.coffeeBeans -= 12;
		// Storage.disposableCups -= 1;

		boolean capucIsAvailable = true;
		while (capucIsAvailable) {
			if (Storage.water >= 200) {
				capucIsAvailable = true;
			} else {
				capucIsAvailable = false;
				System.out.println("Sorry, not enough water!");
				break;
			}
			if (Storage.milk >= 100) {
				capucIsAvailable = true;
			} else {
				capucIsAvailable = false;
				System.out.println("Sorry, not enough milk!");
				break;
			}
			if (Storage.coffeeBeans >= 12) {
				capucIsAvailable = true;
			} else {
				capucIsAvailable = false;
				System.out.println("Sorry, not enough coffee beans!");
				break;
			}
			if (Storage.disposableCups >= 1) {
				capucIsAvailable = true;
				break;
			} else {
				capucIsAvailable = false;
				System.out.println("Sorry, not enough disposable cups!");
				break;
			}
		}

		if (capucIsAvailable) {
			System.out.println("I have enough resources, making you a coffee!");
		}
		return capucIsAvailable;
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
	}

	static void takeMoney() {
		System.out.println("I gave you $" + Storage.money + "\n");
		Storage.money -= Storage.money;
	}

//
//	static void calculateIngredients(int reqCoffeeCups) {
//		int water, milk, cBeans;
//		water = reqCoffeeCups * 200;
//		milk = reqCoffeeCups * 50;
//		cBeans = reqCoffeeCups * 15;
//
////		System.out.println("For " + reqCoffeeCups + " cups of coffee you will need:" + "\n" + water + " ml of water"
////				+ "\n" + milk + " of milk" + "\n" + cBeans + " g of coffee beans");
//	}
//
//	static void calculate(int waterStorage, int milkStorage, int coffeeBeansStorage, int reqCoffeeCups) {
////		water = reqCoffeeCups * 200;
////		milk = reqCoffeeCups * 50;
////		cBeans = reqCoffeeCups * 15; 
//
//		int waterEnoughForACoffeCup = waterStorage / 200;
//		int milkEnoughForACoffeCup = milkStorage / 50;
//		int coffeeBeansEnoughForACoffeCup = coffeeBeansStorage / 15;
//
//		int numberOfIngredientsForSingleCup[] = { waterEnoughForACoffeCup, milkEnoughForACoffeCup,
//				coffeeBeansEnoughForACoffeCup };
//		Storage.availableCupsOfCoffee = numberOfIngredientsForSingleCup[0];
//
//		for (int ingredient : numberOfIngredientsForSingleCup) {
//			if (ingredient < Storage.availableCupsOfCoffee) {
//				Storage.availableCupsOfCoffee = ingredient;
//			}
//		}
//
////		System.out.println(waterEnoughForACoffeCup);
////		System.out.println(milkEnoughForACoffeCup);
////		System.out.println(coffeeBeansEnoughForACoffeCup);
//
//		if (Storage.availableCupsOfCoffee == reqCoffeeCups) {
//			System.out.println("Yes, I can make that amount of coffee");
//		} else if (Storage.availableCupsOfCoffee > reqCoffeeCups) {
//			System.out.println("Yes, I can make that amount of coffee (and even + "
//					+ (Storage.availableCupsOfCoffee - reqCoffeeCups) + " more than that)");
//		} else
//			System.out.println("No, I can make only " + Storage.availableCupsOfCoffee + " cup(s) of coffee");
//
//	}

}