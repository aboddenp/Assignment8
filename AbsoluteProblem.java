import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator; 
import java.lang.Math; 

public class AbsoluteProblem{

	public static void main(String[] args){

		Comparator<Integer> byAbsolute= 
		(Integer x,  Integer y)-> { // create Comparator using lambda expressions 
			x = Math.abs(x.intValue());
			y = Math.abs(y.intValue());
			return x.compareTo(y); 
		};

		TreeSet<Integer> treeSet = new TreeSet<Integer>(byAbsolute); // need to create a new TreeSet with a comperator 
		HashSet<Integer>  hashSet = new HashSet<Integer>();

		// add the same numbers to both TreeSet and HashSet 
		for (int i = -1 ; i < 2; i++){ // -1 , 0  and 1 to the set 
			treeSet.add(i);
			hashSet.add(i);
		}

		// since these two are Sets they both should have the same value !! [-1, 0, 1] 
		boolean equality = treeSet.equals(hashSet);
		System.out.println(equality); // outputs False  

		// show what values each treeSet have:  
		System.out.println(treeSet.toString()); // outputs [-1, 0]
		System.out.println(hashSet.toString()); // outputs [-1,0,1]


		/*
			PROBLEM EXPLANATION AND SUMMARY: 

				In the code above we have created two sets, a HashSet and and a TreeSet that store Integers. 
				The Tree Set has been created with a passed in Comparator<Integer> as a parameter. The Comparator 
				defines the ordering of the TreeSet(sorted) elements. The Comparator is implemented by a lambda expression
				and it gives the natural order for absolute numbers. 

				What is the problem in terms of the Comparator Contract: 
					(javadoc for comperator )
					The ordering imposed by a comparator c on a set of elements S is said to be consistent with equals 
						if and only if c.compare(e1, e2)==0
						has the same boolean value as e1.equals(e2) for every e1 and e2 in S.

					**Missing explanation of how this apply to the example with absolute values **
		*/

	}

}