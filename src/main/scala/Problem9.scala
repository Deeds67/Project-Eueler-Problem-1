package main

object Problem9 extends App {
  def findPythagoreanTripletEqualsTo(target: Int): Unit= {
    (0 to 1000).foreach { c =>
      (0 until c).foreach { b =>
        (0 until b).foreach { a =>
          if (isPythagoreanTriplet(a, b, c)) {
            if (a + b + c == target) {
              println(a * b * c)
            }
          }
        }
      }
    }
  }

  def isPythagoreanTriplet(a: Int, b: Int, c: Int): Boolean = a * a + b * b == c * c

  findPythagoreanTripletEqualsTo(1000)

}