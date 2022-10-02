/* A very clever math trick of using mod (%) to chop off a digit...number by number. For example, 123 would be chopped off as 1, 2, and 3 using mod. 

You're buying a lot of burritos. 
We want to calculate how much tip to give the cashier, which is the largest digit in your budget multiplied by 900.
In the .getTip() method, set maxDigit to the largest digit in budget. For example, if the budget is 281, then the maxDigit should be 8.

HINTS: This can be done by iterating through each digit to determine which number is the largest.

HINTS: Since we want to iterate through each digit in the number, we could grab the last digit in the number, remove it, and repeat until the budget is 0.

HINTS: We could use the modulo operator to isolate each digit. When you take a number and mod it by 10, then it returns the last digit.
number % 10; // returns the last digit in the number

HINTS: One way to remove a digit is to divide the number by 10. Example: number = number / 10; // removes the last digit in number

Remember Java floor divides by DEFAULT.
*/


public class BurritoCalculator {
  public static int getTip(int budget) {
    int maxDigit = 0;

    while (budget > 0) {

      int num = budget % 10;

      if (num > maxDigit) {

        maxDigit = num;
      } 
      
      budget /= 10;
    
    } 
        
    return maxDigit * 900;
  }
    
  
  
  
  
  public static void main(String []args) {
    // Try passing different arguments for your budget with varying numbers of digits, like 62, 374, 599, etc
    System.out.println(getTip(123));
  }
}
