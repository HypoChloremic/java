/*Doing clocks
Ali Rassolie*/

import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("[Running]");
		int parArray[] = new int[3];

		for (int i=0; i < 3; i++) {
		parArray[i] = scanner.nextInt();
		}

		ClockDisplay clock = new ClockDisplay();

		clock.setTime(parArray[0], parArray[1]);
		for (int i=0; i<parArray[2]; i++) {
			clock.timeTick();
		}

		System.out.println(clock.getTime());
		System.out.println("[Finished]");
	}
}