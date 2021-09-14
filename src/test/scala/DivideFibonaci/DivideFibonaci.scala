package DivideFibonaci

import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable.ListBuffer

class DivideFibonaci extends AnyFunSuite {

  val obj = new divide_fibonacci

  test("Divide two numbers- where Divdiend=6 and Divisor= 2") {
    val expectedResult = 3
    val resultingValue = obj.divide(6, 2)
    assert(expectedResult == resultingValue)
  }
  test("Dividing a Number by 0 throws Arithmetic Exception") {
    intercept[ArithmeticException] {
      obj.divide(40, 0)
    }
  }

  test("Return a Fibonacci Series if the Number of Terms 5"){

    val expectedResult = new ListBuffer[Int]
    expectedResult += (0,1,1,2,3)
    val resultingValue = obj.fibonacci(5)
    assert(expectedResult == resultingValue)
  }

  test("If No. of Terms in a Fibonacci Series is Negative it throws Exception"){
   intercept[IllegalArgumentException]{
      obj.fibonacci(-10)
    }
  }
}