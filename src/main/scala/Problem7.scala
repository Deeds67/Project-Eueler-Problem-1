package main

import scala.annotation.tailrec

object Problem7 extends App {
  def isPrime(n: Long): Boolean = !(2 +: (3 to Math.sqrt(n).toInt by 2) exists (n%_ == 0))

  def findNthPrime(primeIndexToFind: Int): Int = {
    @tailrec
    def iterate(currentNumber: Int = 1, currentIndex: Int = 1): Int = {
      val numberIsPrime = isPrime(currentNumber)
      if(currentIndex == primeIndexToFind && numberIsPrime) currentNumber
      else if (numberIsPrime) iterate(currentNumber + 1, currentIndex + 1)
      else iterate(currentNumber + 1, currentIndex)
    }

    iterate()
  }

  println(findNthPrime(10001))

}
