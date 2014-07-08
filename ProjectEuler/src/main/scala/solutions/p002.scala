package solutions

/** Even Fibonacci numbers
 *  
 *  Each new term  in the Fibonacci sequence is generated by adding the
 *  previous two terms. By starting with 1 and 2, the first 10 terms will be:
 *  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *  By considering the terms in the Fibonacci sequence whose values do not
 *  exceed four million, find the sum of the even-valued terms.
 *  
 */

object p002 {
  
  def fib(threshold: Int): List[Int] = {
    def loop(x: Int, y: Int): List[Int] = {
      if (x + y > threshold) Nil else (x + y) :: loop(y, x + y)
    }
    loop(0, 1)
  }
  

  def main(args: Array[String]): Unit = {
    val terms = fib(4000000)
    println("Largest Fibonacci number below four millions: " + terms.last)
    val sum = (terms filter (_ % 2 == 0)).sum
    println("Sum of even-valued terms: " + sum)
  }

}