// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Assignment12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws FileNotFoundException {
		//Reading the file and spliting it into 2 lists.
		String dataline = "";
		Scanner fileScnr = new Scanner(new File("Assignment12/index.html"));
		ArrayList<String> words = ScanList(fileScnr);
		List[] newList = SplitList(words);
		
		// Threads
		HelperClass tws1 = new HelperClass(newList[0]);
		HelperClass tws2 = new HelperClass(newList[1]);
		
		int choice = 1;
		Scanner scnr = new Scanner(System.in);
		do {
			System.out.println("Choose the function you would like to run:\n1-No Thread Test\n2-Thread Test");
			choice = scnr.nextInt();

			switch (choice) {
				case 1:
					NoThreadTest(newList[0], newList[1]);
					break;
				case 2:
					ThreadTest(tws1, tws2);
					break;
			}

			System.out.println("Enter 0 to exit any other key to continue");
			choice = scnr.nextInt();

		} while (choice != 0);

		fileScnr.close();
		scnr.close();
	}
	
	//Removes the html characters without using threads.
    private static void NoThreadTest(List<String> tws1, List<String> tws2) {
		//start timer
		long startTime = System.currentTimeMillis();

		HelperClass.ReplaceHTML(tws1);
		HelperClass.ReplaceHTML(tws2);
		
		//stop times
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		
		System.out.println("Without Thread Runtime in miliseconds: "+elapsedTime);
    }
    
    //Removes the html characters using threads.
    private static void ThreadTest(HelperClass tws1, HelperClass tws2) {
		//start timer
		long startTime = System.currentTimeMillis();

		tws1.run();
		tws2.run();

		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Thread Runtime in miliseconds: "+elapsedTime);
	}
	
	static ArrayList<String> ScanList(Scanner s) {
		ArrayList<String> words = new ArrayList<String>();
		
		while (s.hasNextLine()) {
			while (s.hasNext()) {
				words.add(s.next());
			}
		}

		return words;
	}

	static List[] SplitList(ArrayList<String> words) {
		int half = words.size() / 2;

		List<String> head = new ArrayList<String>();
		List<String> tail = new ArrayList<String>();
		
		for (int i = 0; i < half; i++) {
			head.add(words.get(i));
		}

		for (int i = half; i < words.size(); i++) {
			tail.add(words.get(i));
		}

		List[] listArr = new List[2];
		listArr[0] = head;
		listArr[1] = tail;

		return listArr;
	}
}
