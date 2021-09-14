package DivideFibonaci

import scala.collection.mutable.ListBuffer

class divide_fibonacci extends Divide with Fibonacci {

  @Override
  override def divide(divisor: Int, dividend: Int) = divisor / dividend

  @Override
  override def fibonacci(numberOfTerms: Int): ListBuffer[Int] = {

    if (numberOfTerms < 0) throw new IllegalArgumentException("Number of Terms which are Negative not Allowed in Fibonacci Series")

    var firstTerm: Int = 0
    var secondTerm: Int = 1
    var summation: Int = 0
    val fibonacciSeries = new ListBuffer[Int]
    if (numberOfTerms == 1) return (fibonacciSeries += firstTerm)

    fibonacciSeries +=(firstTerm, secondTerm)
    if (numberOfTerms == 2) return fibonacciSeries
    for (i <- 3 to numberOfTerms) {

      summation = firstTerm + secondTerm
      fibonacciSeries.append(summation)
      firstTerm = secondTerm
      secondTerm = summation
    }

    fibonacciSeries
  }


}