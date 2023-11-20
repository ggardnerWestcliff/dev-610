package assignments.week4.chapter11;

/*
--Exercise 1--
Modify the Sieve program developed in Section 11.1 to make two optimizations. First, instead of storing all integers up
to the maximum in the numbers list, store only 2 and all odd numbers from 3 upward. Second, write code to ensure that
if the first number in the numbers list ever reaches the square root of the maximum, all remaining values from the
numbers list are moved into the primes list. (Why is this a valid operation?)
*/

import java.util.*;

public class Sieve {
    public static void main(String[] args) {
        System.out.println("This program will tell you all prime");
        System.out.println("numbers up to a given maximum.");
        System.out.println();

        Scanner console = new Scanner(System.in);
        System.out.print("Maximum number? ");
        int max = console.nextInt();

        LinkedList<Integer> primes = sieve(max);
        System.out.println("Prime numbers up to " + max + ":");
        System.out.println(primes);
    }

    // Returns a list of all prime numbers up to the given maximum
    // using the Sieve of Eratosthenes algorithm.
    public static LinkedList<Integer> sieve(int max) {
        LinkedList<Integer> primes = new LinkedList<>();
        double sqrtMax = Math.sqrt(max);

        // add all odd numbers from 2 to max to a list
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 2; i <= max; i++) {
            if (i % 2 == 1 || i == 2) {
                numbers.add(i);
            }
        }

        while (!numbers.isEmpty()) {
            // remove a prime number from the front of the list
            int front = numbers.remove(0);
            primes.add(front);

            // remove all multiples of this prime number
            Iterator<Integer> itr = numbers.iterator();
            while (itr.hasNext()) {
                int current = itr.next();
                if (current % front == 0) {
                    itr.remove();
                }
            }

            // if front = sqrt of max, then move all remaining numbers into primes.
            if (front == sqrtMax) {
                Iterator<Integer> primeItr = numbers.iterator();
                while (primeItr.hasNext()) {
                    primes.add(primeItr.next());
                    primeItr.remove();
                }
            }
        }

        return primes;
    }
}
