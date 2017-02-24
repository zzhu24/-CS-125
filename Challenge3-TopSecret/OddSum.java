//UIUC CS125 FALL 2014 MP. File: OddSum.java, CS125 Project: Challenge3-TopSecret, Version: 2014-09-22T23:37:26-0500.071507207
/**
 * Prints sum of odd numbers in a specific format.
 * TODO: add your netid to the line below
 * @author zzhu24
 */
public class OddSum { 
/**
Example output if user enters 10:
Max?
1 + 3 + 5 + 7 + 9 = 25
25 = 9 + 7 + 5 + 3 + 1

Example output if user enters 11:
Max?
1 + 3 + 5 + 7 + 9 + 11 = 36
36 = 11 + 9 + 7 + 5 + 3 + 1

 */

   public static void main(String[] args){
         TextIO.putln("Max?");
         int userInput = TextIO.getlnInt();
         int total = 0; 
         
         if(userInput % 2 == 0){
         for(int count = 1; count < userInput; count += 2){
	     total += count;
         if( count != userInput - 1 )
         TextIO.put(count + " + ");
         else
         TextIO.putln( count + " = " + total);}
         TextIO.put(total + " = ");
         
         for(int count = userInput - 1; count >= 1; count -= 2 ){
         if(count != 1)
         TextIO.put(count + " + ");
         else
         TextIO.putln(count);}}
         else{
         
         for(int count = 1; count <= userInput; count += 2){
	     total += count;
         if(count != userInput) TextIO.put(count + " + ");
         else  TextIO.putln(count + " = " + total);}
         TextIO.put(total + " = ");
         
         for(int count = userInput; count >= 1; count -= 2){
         if(count != 1)
         TextIO.put(count + " + ");
         
         else
         TextIO.putln(count);}}
         } // end of main method
         } // end of class 