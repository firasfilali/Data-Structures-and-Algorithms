package main;

import java.util.Arrays;

public class Main {
	public static void main (String[] args) {
		
		Array numbers = new Array(2);
		numbers.insert(69);
		numbers.insert(70);
		numbers.insert(5);
		numbers.removeAt(4);
		numbers.print();
	}

}
