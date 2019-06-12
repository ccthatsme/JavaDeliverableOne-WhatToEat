
package javaDeliverable1;

import java.util.Scanner;

public class Eat {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String eventType;
		int partySize;
		String result;
		String mealSuggest;
		String prepSuggest;

		System.out.println("Please select an event type(do not enter the quotation marks): Type \"c\" for casual");
		System.out.println("                                                               Type \"s\" for semi-formal");
		System.out.println("                                                               Type \"f\" formal");

		eventType = scnr.nextLine();
		mealSuggest = "something";
		prepSuggest = "something";

		while (eventType.length() >= 0) {
			if (eventType.equals("c") || eventType.equals("C")) {
				eventType = "Casual";
				mealSuggest = "Sandwiches";
				break;
		}
			else if (eventType.equals("s") || eventType.equals("S")) {
				eventType = "Semi-Formal";
				mealSuggest = "Fried Chicken";
				break;
		}
			else if (eventType.equals("f") || eventType.equals("F")) {
				eventType = "Formal";
				mealSuggest = "Chicken Parmesan";
				break;
		}
			else {
				System.out.println(
						"I'm sorry, please enter again. Be sure to use only the mentioned letters, no quotations necessary :)");
				eventType = scnr.nextLine();
			}
		}

		System.out.println("Next, enter the number of people in your party(whole numbers please): ");
		partySize = scnr.nextInt();

		while (partySize > 0) {

			if (partySize == 1) {
				prepSuggest = "in the microwave";
				break;
			} else if (partySize >= 2 && partySize <= 12) {
				prepSuggest = "in your kitchen";
				break;
			}
			else if (partySize >= 13) {
				prepSuggest = "by a caterer";
				break;
		}

		}

		result = "You are having a " + eventType + " event for " + partySize + "." + "\r\n"
				+ "We suggest you serve " + mealSuggest + " " + prepSuggest + ".";
		System.out.println(result);
		
	}
		
	}


