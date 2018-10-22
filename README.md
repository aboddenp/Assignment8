CS/SWE 332 Assignment 8 
Due Wednesday, October 24, 2018

Goal: Polymorphic Abstraction 
Submit via Blackboard. 

Assignment:

In the in-class exercise of Monday, October 22, we will determine that a Comparator based on absolute values is problematic. Code up the comparator and then write client code that illustrates the problem. Explain what is wrong in a brief summary statement. Your explanation of the problem must be phrased in terms of a violation of the contract for Comparator.

To emphasize that this contract problem is real, your code should create two Java sets, one a HashSet, and the other a TreeSet. The TreeSet should order items with your absolute value comparator. Your example should add the same integers to both sets, yet still end up with sets that are different. Your summary statement should explain why. 

Grading Criteria:

Code compiles (without warnings) and runs.
Solution complies with instructions.
Clear summary statement
Solutions that use a Java 8 lambda function to implement the comparator earn a bonus point.
