/* Oh no! You handed the cashier $819287624, but they entered it backwards as $426782918. While we wait for them to fix the number, we could write some code to do it for us. 

In the .getReverseBudget() method, iterate through each digit in budget. Create a new integer, reverseBudget, where every digit appears in the opposite order as the digits in budget.

HINT: One way to break down the original number one digit at a time is to use the modulo operator and division.
In order to reconstruct the reverse number, we can perform the reverse operation of division on the reversed number: multiplication.

HINT: We can grab the last digit in the number, remove it, and repeat until the original budget is 0.
number % 10; // returns the last digit in the number
number = number / 10; // removes the last digit in number

HINT: Multiplying the reverse number by 10 and adding the mod result moves the previous mod result one digit to the left and the current mod result will takes the ones digit place.
number * 10; // adds a 0 to the right of number
number + modResult; // replaces the 0 with the result from mod 10

*/

public class BurritoCalculator {
  public static int getReverseBudget(int budget) {
    int reverseBudget = 0;
    while (budget > 0) {
      int digit = budget % 10;
      // 123 % 10 = 3
      budget /= 10;
      // 123 floor divide 10 = 12
      reverseBudget = (reverseBudget * 10) + digit;
      // 3 (first round)
      // 2 (second round)
      // 1 (third round)
    }
        
    return reverseBudget;
  }
  
  /* Why this works:
  This uses a similar strategy as the last problem. We use % 10 and / 10 to get the ones digit and then cut off the ones digit. The difference here is what we do with that digit. We want to add that digit as the ones digit of our new number. To do that we multiply our number by 10 and then add the digit. For example, if our number were 32, and we wanted to add the digit 5 to the ones place, we would do (32 * 10) + 5 to give us a total of 325. We keep doing this until we have no more digits to add.
  */
  
    
  public static void main(String []args) {
    // Try passing different arguments for your budget with varying numbers of digits, like 62, 374, 599, etc
    System.out.println(getReverseBudget(123));
  }
}
