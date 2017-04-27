package Utils

object PrimeUtility {
  def isPrime(n: Long): Boolean = if (n == 2) true else !(2 +: (3 to Math.sqrt(n).toInt by 2) exists (n%_ == 0))
}
