package main

object Problem6 extends App {
  def squareOfSum(num: Int) = {
    BigDecimal(Math.pow((1 to num).foldLeft(0d)((acc, n) => acc + n), 2))
  }

  def sumOfSquares(num: Int) = {
    (1 to num).foldLeft(BigDecimal(0))((acc, n) => acc + Math.pow(n, 2))
  }

  println(squareOfSum(100) - sumOfSquares(100))
}
