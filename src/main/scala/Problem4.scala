package main

import scala.annotation.tailrec

object Problem4 extends App {
  def isPalindrome(num: Int): Boolean = {
    val productArray = num.toString.toArray
    val split = productArray.splitAt(productArray.length / 2)
    split._1.sameElements(split._2.reverse)
  }

  @tailrec
  def largestPalindromeProduct(p1: Int = 999, p2: Int = 999, largest: Int = 0): Int = {
    val prod = p1 * p2
    if (p1 == 100 && p2 == 100) largest
    else if (p1 == 100) {
      largestPalindromeProduct(p2, p2 - 1, if(prod > largest && isPalindrome(prod)) prod else largest)
    }
    else {
      largestPalindromeProduct(p1 - 1, p2, if(prod > largest && isPalindrome(prod)) prod else largest)
    }
  }


  println(largestPalindromeProduct())
}
