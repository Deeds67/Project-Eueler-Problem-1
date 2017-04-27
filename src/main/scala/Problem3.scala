package main
import Utils.PrimeUtility.isPrime
import scala.annotation.tailrec

object Problem3 extends App {
//  The prime factors of 13195 are 5, 7, 13 and 29.
//  What is the largest prime factor of the number 600851475143 ?

  def largestPrime(num: Long): Long = {
    @tailrec
    def increment(n: Long, currentPrime: Long = 2, largestPrime: Long = 0): Long = {
      if (currentPrime > n) largestPrime
      else if (n % currentPrime == 0 && isPrime(currentPrime)) {
        increment(n / currentPrime, currentPrime + 1, currentPrime)
      } else increment(n, currentPrime + 1, largestPrime)
    }
    increment(num)
  }

  println(largestPrime(600851475143l))

}
