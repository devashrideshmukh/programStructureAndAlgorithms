package test;

import java.util.BitSet;

import arraysAndStrings.Anagrams;
import arraysAndStrings.OccurancesOfCharacter;
import arraysAndStrings.PalindromeString;
import arraysAndStrings.PrintMissingNumbers;
import arraysAndStrings.Problem1_CTCI;
import arraysAndStrings.Problem2_CTCI;
import arraysAndStrings.Problem3_CTCI;
import arraysAndStrings.Problem4_CTCI;
import arraysAndStrings.Problem5_CTCI;
import arraysAndStrings.Problem6_CTCI;
import arraysAndStrings.Problem7_CTCI;
import arraysAndStrings.Program9_CTCI;
import arraysAndStrings.RemoveDuplicatesFromArray;
import arraysAndStrings.StringComputations;
import arraysAndStrings.TwoSum;

public class RunnerArraysAndStrings {

	public static void main(String[] args) {
		
		
		//===================ARRAYS AND STRINGS===============================================//
		
		System.out.println("Problem 1: "+Problem1_CTCI.isCharacterUnique("Devashri"));
		System.out.println("Problem 1: "+Problem1_CTCI.isCharacterUnique("DevashriD"));
		System.out.println("Problem 1: "+Problem1_CTCI.isCharacterUnique(""));
		
		System.out.println("Problem 2: "+Problem2_CTCI.checkPermutations1("Devashri", "irhsaveD"));
		System.out.println("Problem 2: "+Problem2_CTCI.checkPermutations2("Devasasd", "irhsaveD"));
		
		System.out.println("Problem 3: "+Problem3_CTCI.urlify1("Deva shri"));
		System.out.println("Problem 3: "+Problem3_CTCI.urlify2("Deva shri"));
		
		System.out.println("Problem 4: "+Problem4_CTCI.checkIfPermuationOfPalindrome("taco cat"));
		System.out.println("Problem 4: "+Problem4_CTCI.checkIfPermuationOfPalindrome("amyamalla"));
		System.out.println("Problem 4: "+Problem4_CTCI.checkIfPermuationOfPalindrome("Devashri"));
		System.out.println("Problem 4: "+Problem4_CTCI.checkIfPermuationOfPalindrome(" "));
		System.out.println("Problem 4: "+Problem4_CTCI.checkIfPermuationOfPalindrome("DevkkkaaaveD"));
		
		System.out.println("Problem 5: "+Problem5_CTCI.checkIfStringIfOneEditAway("pale", "ple"));
		System.out.println("Problem 5: "+Problem5_CTCI.checkIfStringIfOneEditAway("pales", "pale"));
		System.out.println("Problem 5: "+Problem5_CTCI.checkIfStringIfOneEditAway("pale", "bale"));
		System.out.println("Problem 5: "+Problem5_CTCI.checkIfStringIfOneEditAway("pale", "bae"));
		
		System.out.println("Problem 6: "+Problem6_CTCI.returnCompressedString("firefoxthunderbirddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"));
		
		System.out.println("Problem 9:"+Program9_CTCI.isStringRotation("waterbottle", "bottlewater"));
		System.out.println("Problem 9:"+Program9_CTCI.isStringRotation("waterbottle", "ottlewatebr"));
		
		TwoSum ts = new TwoSum();
		int[] nums = {2, 7, 11, 15};
		int[] result=ts.twoSum(nums,9);
		int[] result1=ts.twoSum(nums,9);
		System.out.println("The indices are:"+result[0]+","+result[1]);
		System.out.println("The indices are (one pass):"+result1[0]+","+result1[1]);
		
		Anagrams anagrams = new Anagrams();
		System.out.println("Is anagram ? "+anagrams.isAnagram("devashri", "irhsaved"));
		System.out.println("Is anagram ? "+anagrams.isAnagram("Mother In Law", "Hitler Woman"));
		System.out.println("Is anagram ? "+anagrams.isAnagram("keEp", "peeK"));
		System.out.println("Is anagram ? "+anagrams.isAnagram("SiLeNt CAT", "LisTen AcT"));
		System.out.println("Is anagram ? "+anagrams.isAnagram("Debit Card", "Bad Credit"));
		System.out.println("Is anagram ? "+anagrams.isAnagram("School MASTER", "The ClassROOM"));
		System.out.println("Is anagram ? "+anagrams.isAnagram("DORMITORY", "Dirty Room"));
		System.out.println("Is anagram ? "+anagrams.isAnagramUsingArrays("ASTRONOMERS", "NO MORE STARS"));
		System.out.println("Is anagram ? "+anagrams.isAnagram("joy", "enjoy"));
		System.out.println("Is anagram ? "+anagrams.isAnagramUsingArrays("Toss", "Shot"));
		
		PalindromeString ps = new PalindromeString();
		System.out.println("madam is palindrome : "+ ps.isTextPalindrome("ma,dam"));
		System.out.println("mada is palindrome : "+ ps.isTextPalindrome("mada"));
		System.out.println("devashriirhsaved is palindrome : "+ ps.isTextPalindrome("devashriirhsaved"));
		System.out.println("devashri8rhsaved is palindrome : "+ ps.isTextPalindrome("devashri8rhsaved"));
		
		OccurancesOfCharacter occ = new OccurancesOfCharacter();
		System.out.println("Count of D in 'DevashriDeshmukh' "+occ.countOccurances("DevashriDeshmukh",'D'));
		
		StringComputations stringComputations = new StringComputations();
		System.out.println("'122' converted to integer : "+stringComputations.returnConvertedInteger("   122"));
		System.out.println("'-122' converted to integer : "+stringComputations.returnConvertedInteger("-122"));
		System.out.println("'-122a' converted to integer : "+stringComputations.returnConvertedInteger("-122a"));
		System.out.println("'-aaaa' converted to integer : "+stringComputations.returnConvertedInteger("-aaaa"));
		System.out.println("First non-repeating character "+stringComputations.getFirstNonRepeatingCharacter("devashri"));
		System.out.println("First non-repeating character "+stringComputations.getFirstNonRepeatingCharacter("ddeevvaasshri"));
		System.out.println("First non-repeating character "+stringComputations.getFirstNonRepeatingCharacter("ddeevvaa"));
		//===================================================================================//
		
		System.out.println("Missing Numbers");
		PrintMissingNumbers.printMissingNumbers(new int[]{1,2,3,5,6},7);
		System.out.println("Missing Number");
		PrintMissingNumbers.printMissingNumber(new int[]{1,2,3,5,6},6);
		
		int[] inputArray = {2,3,4,5,2,3,4,5,6,7,8,9,2};
		int[] resultant = RemoveDuplicatesFromArray.removeDuplicatesFromArrayWithoutUsingCollection(inputArray);
		System.out.println("\n");
		for(int i=0;i<resultant.length;i++){
			System.out.print(resultant[i]);
		}
		
		Integer[] inputArray1 = {2,3,4,5,2,3,4,5,6,7,8,9,2};
		Integer[] resultant1 = RemoveDuplicatesFromArray.removeDuplicatesFromArrayUsingCollection(inputArray1);
		System.out.println("\n");
		for(int i=0;i<resultant1.length;i++){
			System.out.print(resultant1[i]);
		}
		
		System.out.println("\n");
		System.out.println("==================================================");
		
		Problem7_CTCI prob7 = new Problem7_CTCI();
		int[][] matrix = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}};
		for(int i=0;i<matrix.length;i++){
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("==========Clockwise========================================");
		prob7.rotateClockwise(matrix, 6);
		
		for(int i=0;i<matrix.length;i++){
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("==========Anticlockwise=================================");
		prob7.rotateAnticlockwise(matrix, 6);
		
		for(int i=0;i<matrix.length;i++){
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		
	}
	
}
