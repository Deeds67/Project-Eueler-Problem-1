package main

object Problem5 extends App {
  def isEvenlyDivisibleByAllNumbersInRange(num: Int, end: Int = 20): Boolean = {
    (1 to end).forall(i => num % i == 0)
  }

  def findSmallestEvenlyDivisible(i: Int): Int = {
    if(isEvenlyDivisibleByAllNumbersInRange(i)) i
    else findSmallestEvenlyDivisible(i + 1)
  }

  println(findSmallestEvenlyDivisible(1))
}
