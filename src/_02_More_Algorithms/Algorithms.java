package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i <= 12; i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}

		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)) {
				count++;
			}

		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		double largest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {

			if (peeps.get(i) > largest) {
				largest = peeps.get(i);
			}
		}

		return largest;
	}

	public static String findLongestWord(List<String> words) {
		int length1 = 0;
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > length1) {
				length1 = words.get(i).length();
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			if (message1.contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		int i = 0;
		for (int j = 0; j < results.size(); j++) {
			for (i = 0; i < results.size() - 1; i++) {
				if (results.get(i) > results.get(i + 1)) {
					double x = results.get(i);
					results.set(i, results.get(i + 1));
					results.set(i + 1, x);
				}

			}

		}
		return results;
	}

	public static List<String> sortDNA(List<String> us) {

		for (int j = 0; j < us.size(); j++) {
			for (int i = 0; i < us.size() - 1; i++) {
				if (us.get(i).length() > us.get(i + 1).length()) {
					String x = us.get(i);
					us.set(i, us.get(i + 1));
					us.set(i + 1, x);
				}
			}
		}
		return us;
	}

	
	public static List<String> sortWords(List<String> words) {
		for (int j = 0; j < words.size(); j++) {
		for (int i = 0; i < words.size()-1; i++) {
			if (words.get(i).compareTo(words.get(i+1))>0) {
				String x=words.get(i);
				words.set(i, words.get(i+1));
				words.set(i+1, x);
			}
			else {
				
			}
		}
		}
		return words;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
