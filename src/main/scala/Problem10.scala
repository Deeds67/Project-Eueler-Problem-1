package main
import Utils.PrimeUtility.isPrime

object Problem10 extends App {
  def sumOfPrimes(till: Int): BigInt = {
    (2 until till).foldLeft(BigInt(0)) { (acc, num) =>
      if (isPrime(num)) {
        acc + num
      } else acc
    }
  }

  println(sumOfPrimes(2000000))
}
