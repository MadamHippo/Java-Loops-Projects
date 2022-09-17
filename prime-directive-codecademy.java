// to compile: javac PrimeDirective.java
// to run: java PrimeDirective

// Import statement:
import java.util.ArrayList;

// A prime number is an integer greater than 1 that is only divisible by 1 and itself.

class PrimeDirective {
  
  // Add your method 1 here:
  // Create an empty public method isPrime():
  public static boolean isPrime(int number){
    if (number > 1) {
      // Imagine we have a number n. If n is prime, then n should not be divisible by any integers between 2 and n-1...
      // Inside isPrime(), create a for loop: construction goes...
      // initalize counter
      // put the condition 
      // increment i  
      for (int i = 2; i < number; i++){
        // you want to check if number is divisible by it. if it's divisible, it's not a prime number so return false.
        if (number % i == 0){
          return false;
      }
    } return true;
    // else covers edge cases for numbers less than 2 (automatic primes)
  } else {
      return false;
    }


  }

  // Add your method 2 here: 
  // building an ArrayList of the prime numbers in the numbers...to store all the prime numbers from the numbers array in main()
  public ArrayList<Integer>onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<Integer>();
    // find all of the primes in an array...using a for each loop...
    for (int i : numbers){
      // Because .isPrime() is another public method in PrimeDirective, you can access it inside onlyPrimes() to check if number is prime:
      if (isPrime(i) == true){
        primes.add(i);
      }
    }
    return primes;
  }

  /* Notes: Why is the methods static? Because we can run it because it's static, if not static, we would have had to create an object of this isPrime() class in order to access it. Static allows us to access a method inside the method and on that object we can use the method using the dot notation (delcare within our class) 
  */
  
  
  public static void main(String[] args) {

    // an instance of PrimeDirective (pd) has been instantiated
    PrimeDirective pd = new PrimeDirective();
    // and you'll see an int array called numbers that has a series of integers.
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    // trying out if Prime method works...
    System.out.println(isPrime(7));
    System.out.println(isPrime(28));

    // In main(), test out pd.onlyPrimes() on the numbers array.
    System.out.println(pd.onlyPrimes(numbers));
    // should print [29, 11, 101, 43, 89]

  }  

}
