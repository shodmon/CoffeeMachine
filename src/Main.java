
import java.util.Scanner;

// return - builder - noun
// void - manipulator - verb
public class Main {

//	private static int water;
//	private static int milk;
//	private static int cBeans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Write how many ml of water the coffee machine has:");
		Storage.water = scanner.nextInt();
		System.out.println("Write how many ml of milk the coffee machine has:");
		Storage.milk = scanner.nextInt();
		System.out.println("Write how many grams of coffee beans the coffee machine has");
		Storage.coffeeBeans = scanner.nextInt();

		System.out.println("Write how many cups of coffee you will need:");
		int reqCoffeeCups = scanner.nextInt();
		// calculateIngredients(reqCoffeeCups);

//		if (reqCoffeCups*200 == Storage.milk && reqCoffeCups*200 == Storage.milk && reqCoffeCups*200 == Storage.milk) {
//			
//		}

		calculate(Storage.water, Storage.milk, Storage.coffeeBeans, reqCoffeeCups);
		
	}

//	static void checkWithTheAmount() {
//		int water = 200;
//		int milk = 50;
//		int coffeeBeans = 5;
//
////		for 
////		int coffeeCup = 1;
//	}
	
	static void sellCoffee() {
		//It can make different varieties of coffee: espresso, latte, and cappuccino. 
		// Of course, each variety requires a different amount of supplies, 
		// except that all of them require only one disposable cup.
		
	}
	
	static void fill () {
		
	}
	static void takeMoney () {
		
	}
	
	static void calculateIngredients(int reqCoffeeCups) {
		int water, milk, cBeans;
		water = reqCoffeeCups * 200;
		milk = reqCoffeeCups * 50;
		cBeans = reqCoffeeCups * 15;

//		System.out.println("For " + reqCoffeeCups + " cups of coffee you will need:" + "\n" + water + " ml of water"
//				+ "\n" + milk + " of milk" + "\n" + cBeans + " g of coffee beans");
	}

	static void calculate (int waterStorage, int milkStorage, int coffeeBeansStorage, int reqCoffeeCups) {
//		water = reqCoffeeCups * 200;
//		milk = reqCoffeeCups * 50;
//		cBeans = reqCoffeeCups * 15; 
		
		int waterEnoughForACoffeCup = waterStorage / 200;
		int milkEnoughForACoffeCup = milkStorage / 50;
		int coffeeBeansEnoughForACoffeCup = coffeeBeansStorage / 15;

		int numberOfIngredientsForSingleCup[] = { waterEnoughForACoffeCup, milkEnoughForACoffeCup, coffeeBeansEnoughForACoffeCup };
		Storage.availableCupsOfCoffee = numberOfIngredientsForSingleCup[0];
		
		for (int ingredient: numberOfIngredientsForSingleCup) {
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
			System.out.println("Yes, I can make that amount of coffee (and even + " + (Storage.availableCupsOfCoffee - reqCoffeeCups)
					+ " more than that)");
		} else
			System.out.println("No, I can make only " + Storage.availableCupsOfCoffee + " cup(s) of coffee");

	}

}
