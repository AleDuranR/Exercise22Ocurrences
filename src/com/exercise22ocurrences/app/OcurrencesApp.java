package com.exercise22ocurrences.app;

//import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
public class OcurrencesApp {

	public static void main(String[] args) {
		// Constants declaration
		final int ELEMENTS = 100000;
		// Variables declaration
		
		// Objects declaration
		//Scanner scan = new Scanner(System.in);
		Random randomNumbers = new Random(System.nanoTime());
		HashMap <Integer,Integer> myHash = new HashMap<Integer,Integer>();
		
		int[] myArray = new int [ELEMENTS];
		for(int i = 0; i < ELEMENTS; i++) {
			myArray[i] = randomNumbers.nextInt(101);
		}
		
		// Process
		for(int element : myArray) {
			if(myHash.containsKey(element)) {
				// Obtain the element add 1 and the save it into the 'HashMap'
				myHash.put(element, myHash.get(element)+1);
			}
			myHash.putIfAbsent(element, 1);
		}
		// Output
		for(int i : myArray) {
			System.out.format("%d ",i);
		}
		System.out.println(myHash);
		
	}
}
