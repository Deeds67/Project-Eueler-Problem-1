package main

object Problem5 extends App {
  def isDivisibleByAllNumbersTo(num: Int, end: Int = 20): Boolean = {
    (1 to end).forall(i => num % i == 0)
  }

  def findSmallest(i: Int): Int = {
    if(isDivisibleByAllNumbersTo(i)) i
    else findSmallest(i + 1)
  }

  println(findSmallest(1))
}
