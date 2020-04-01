package _02_More_Algorithms;

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
int count=0;
	for (int i = 0; i < oysters.size(); i++) {
		if (oysters.get(i)) {
			count++;
		}
		
}
return count;
}

public static double findTallest(List<Double> peeps) {
	double largest=0.0;
	for (int i = 0; i < peeps.size(); i++) {
		
		if (peeps.get(i)>largest) {
			largest=peeps.get(i);
		}
}
	
	return largest;
}
public static String findLongestWord(List<String> words) {
	int length1=0;
	String longest="";
	for (int i = 0; i < words.size(); i++) {
		if (words.get(i).length()>length1) {
			length1=words.get(i).length();
			longest=words.get(i);
		}
	}
	return longest;
}






















}
