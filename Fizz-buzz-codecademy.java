/* Fizz Buzz is a common developer interview question; so common it’s almost cliché!

The challenge is designed to weed out 99.5% programming job candidates who cannot creatively use their coding knowledge to solve coding problems.

Want to give it a shot?

Write a FizzBuzz.java program that outputs numbers from 1 to 100… with a catch:

For multiples of 3, print Fizz instead of the number.
For the multiples of 5, print Buzz.
For numbers which are multiples of both 3 and 5, print FizzBuzz.

“After a fair bit of trial and error I’ve come to discover that people who struggle to code don’t just struggle on big problems, or even smallish problems (i.e. write an implementation of a linked list). They struggle with tiny problems.

So I set out to develop questions that can identify this kind of developer and came up with a class of questions I call “FizzBuzz Questions” named after a game children often play (or are made to play) in schools in the UK.” -- Imran Ghory
*/



//compile: javac FizzBuzz.java
//run: java FizzBuzz


class FizzBuzz {

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++){
      if ((i % 3) == 0) {
      System.out.println("Fizz");
      } else if ((i % 5) == 0) {
        System.out.println("Buzz");
      } else if (((i % 3) == 0) && ((i % 5) == 0)) {
        System.out.println("FizzBuzz");
    } else {
      System.out.println(i);
      }
    } 
  } 

}
