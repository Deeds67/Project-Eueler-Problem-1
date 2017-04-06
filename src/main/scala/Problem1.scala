package main

object Problem1 extends App {
//  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//  Find the sum of all the multiples of 3 or 5 below 1000.
  def sumOfMultiples(fromNumber: Int, toNumber: Int, numbers: List[Int]): Int = {
    (fromNumber until toNumber) reduce { (acc, num) =>
      val sum = if(numbers.exists(num % _ == 0)) num else 0
      acc + sum
    }
  }
  val answer = sumOfMultiples(0, 1000, List(3, 5))
  println(answer)
}



