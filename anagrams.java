/**
 * Source: Hackerearth.com
 * 
 * Anagrams
 * Max. Marks 50
 * Two words are said to be anagrams of each other if they contain the same characters in different order
 * 
 * e.g. "silent" and "listen" are anagrams "potato" and "tomato" are not anagrams, but they are delicious
 * 
 * Given two string arguments, determine if they are an anagram and return the result
 * Focus on producing an efficient, elegant solution using relevant data structures where necessary
 * 
 * Unit tests will be run on the output, simply return a boolean from the provided method.
 * 
 * If the hidden test cases are failing, consider all edge cases and re-read the question. We hide the tests to gauge your analytical thinking and requirements gathering skills.
 * For the sake of this exercise we can assume all inputs will be given in lower case.
 * 
 */

/**
 * Here I have multiple set of solution to this problem
 * As all of the solution solves the problem but some fails on either of the unit test
 * There were 5 unit tests 
 */


=== Answer 1 === Passed: 4, failed: 1
import java.util.*;
import java.io.*;
public class Solution 
{
    static boolean isAnagram(String wordA, String wordB) 
    {
    	wordA = wordA.replaceAll("\\s","");
    	wordB = wordB.replaceAll("\\s", "");
    	if(wordA.length() != wordB.length()) {
    		return false;
    	}
    	
    	char[] wordACharacter = wordA.toCharArray();
    	char[] wordBCharacter = wordB.toCharArray();
    	
    	Arrays.sort(wordACharacter);
    	Arrays.sort(wordBCharacter);
    	
    	if(Arrays.equals(wordACharacter, wordBCharacter)) {
    		return true;
    	}
    	
    	return false;
	}
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String wordA = in.nextLine();
        String wordB = in.nextLine();
        
        boolean res = isAnagram(wordA, wordB);
        
        System.out.println(res);
    }
}

====Answer 2==== Passed: 4, failed: 1
import java.util.*;
import java.io.*;
public class Solution 
{
    static boolean isAnagram(String wordA, String wordB) 
    {
    	wordA = wordA.replaceAll("\\s","");
    	wordB = wordB.replaceAll("\\s", "");
    	
    	if(wordA.length() != wordB.length()) {
    		return false;
    	}
    	
    	char[] wordACharacter = wordA.toCharArray();
    	char[] wordBCharacter = wordB.toCharArray();
    	
    	int length = wordACharacter.length;
    	long sumA=0, sumB =0;
    	long productA = 1, productB = 1;
    	
    	for(int i= 0; i<length; i++) {
    		sumA += (int) wordACharacter[i];
    		sumB += (int) wordBCharacter[i];
    		productA *= (int) wordACharacter[i];
    		productB *= (int) wordBCharacter[i];
    	}
    	
    	if(sumA == sumB && productA == productB) {
    		return true;
    	}
    	
    	return false;
	}
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String wordA = in.nextLine();
        String wordB = in.nextLine();
        
        boolean res = isAnagram(wordA, wordB);
        
        System.out.println(res);
    }
}