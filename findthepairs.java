/**
 * Source: Hackerearth.com
 * 
 * Find the pairs
 * Max. Marks 50
 * Given an array of integers, find the number of unique pairs that have a given difference
 * Focus on producing an efficient, elegant solution using relevant data structures where necessary
 * e.g. array: 1, 4, 5, 7, 8, 9 difference: 3
 * Pairs: { (1, 4), (4, 7), (5, 8) } return: 3
 * Unit tests will be run on the output, simply return an integer from the provided method identifying the number of unique pairs for the given array
 * If the hidden test cases are failing, consider all edge cases and re-read the question. We hide the tests to gauge your analytical thinking and requirements gathering skills.
 */
/**
 * Here I have different methods to solve the problem
 * As all of the solution solves the problem but some fails on either of the unit test
 * There were 5 unit tests 
 */

========== Answer 1============== Passed: 3, failed: 2
import java.util.*;
import java.io.*;
public class Solution 
{
    static int numberOfPairs(int[] numbers, int difference) 
    {
    	//if size of array is smaller to 2
    	if(numbers.length < 2) {
    		return 0;
    	}
    	
    	int count = 0;
    	Set<Integer> hash = new HashSet<Integer>();
    	
    	//Add all the item to hash and cross check the different with each number
    	for(int i = 0 , ii=numbers.length; i<ii; i++) {
    		hash.add(numbers[i]);
    	}
    	
    	for(int i = 0 , ii=numbers.length; i<ii; i++) {
    		if(hash.contains(numbers[i]+difference)){
    			count++;
    		}
    	}
    	
    	return count;
	}
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arraySize = Integer.parseInt(in.nextLine());
        int[] numbers = new int[arraySize];
        
        for(int i=0; i<arraySize; ++i)
        {
        	numbers[i] = Integer.parseInt(in.nextLine());
        }
        
        int	difference = Integer.parseInt(in.nextLine());
        int res = numberOfPairs(numbers, difference);
        
        System.out.println(res);
    }
}

=======Answer 2 =========== Passed: 3, failed: 2
import java.util.*;
import java.io.*;
public class Solution 
{
    static int numberOfPairs(int[] numbers, int difference) 
    {
    	//if size of array is smaller to 2
    	if(numbers.length < 2) {
    		return 0;
    	}
    	
    	int length = numbers.length;
    	Arrays.sort(numbers);
    	// int absDiff = Math.abs(difference);
    	int count= 0;
    	
    	for(int i=0; i<length; i++) {
    		for(int j = i+1; j<length; j++) {
    			if(numbers[i]-numbers[j] == -difference) {
    					count++;
    					break;
				}
    		}
    	}
    	
    	return count;
	}
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arraySize = Integer.parseInt(in.nextLine());
        int[] numbers = new int[arraySize];
        
        for(int i=0; i<arraySize; ++i)
        {
        	numbers[i] = Integer.parseInt(in.nextLine());
        }
        
        int	difference = Integer.parseInt(in.nextLine());
        int res = numberOfPairs(numbers, difference);
        
        System.out.println(res);
    }
}
====== Answer 3 ========== passed :3 , failed : 2
import java.util.*;
import java.io.*;
public class Solution 
{
    static int numberOfPairs(int[] numbers, int difference) 
    {
    	//if size of array is smaller to 2
    	if(numbers.length < 2 || difference < 1) {
    		return 0;
    	}
    	
    	int length = numbers.length;
    	Arrays.sort(numbers);
    	// int absDiff = Math.abs(difference);
    	int count= 0;
    	
    	for(int i=0; i<length; i++) {
    		for(int j = i+1; j<length; j++) {
    			if(numbers[i]-numbers[j] == -difference) {
    					count++;
    					break;
				}
    		}
    	}
    	
    	return count;
	}
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arraySize = Integer.parseInt(in.nextLine());
        int[] numbers = new int[arraySize];
        
        for(int i=0; i<arraySize; ++i)
        {
        	numbers[i] = Integer.parseInt(in.nextLine());
        }
        
        int	difference = Integer.parseInt(in.nextLine());
        int res = numberOfPairs(numbers, difference);
        
        System.out.println(res);
    }
}

======Answer 4 ====== Passed: 5, failed : 0
import java.util.*;
import java.io.*;
public class Solution 
{
    static int numberOfPairs(int[] numbers, int difference) 
    {
    	//if size of array is smaller to 2
    	if(numbers.length < 2) {
    		return 0;
    	}
    	
    	int count =0;
    	
    	Set<Integer> hash = new HashSet<Integer>();
    	for(int i =0, length = numbers.length; i < length; i++) {
    		if(!hash.contains(numbers[i])) {
    			hash.add(numbers[i]);
    		}
    	}
    	
    	Iterator<Integer> iterator  = hash.iterator();
    	while(iterator.hasNext()) {
    		if(hash.contains(iterator.next()+difference)) {
    			count++;
    		}
    	}
    	
    	return count;
	}
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arraySize = Integer.parseInt(in.nextLine());
        int[] numbers = new int[arraySize];
        
        for(int i=0; i<arraySize; ++i)
        {
        	numbers[i] = Integer.parseInt(in.nextLine());
        }
        
        int	difference = Integer.parseInt(in.nextLine());
        int res = numberOfPairs(numbers, difference);
        
        System.out.println(res);
    }
}