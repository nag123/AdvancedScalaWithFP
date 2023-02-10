
/*OPTIONS IN SCALA - A function may not return a result always in those cases
* we go with Options
*
* Option can be defined -> which in case will be Some
* Option can be undefined -> which in case will be None
* */

def mean(xs : Seq[Double]) : Double = {
  if(xs.isEmpty) throw new ArithmeticException("Mean of empty list")
  else xs.sum/length
}

//After adding option[Double] -> it either returns Double or None

def mean(xs : Seq[Double]) : Option[Double] = {
  if(xs.isEmpty) None
  else xs.sum/xs.length
}

/*Another Example*/
//SQRT PROBLEM
/*
* Give the positive square root of x
* If the argument is less than zero, the result is None
* hint: You can use Math.sqrt
*/
def squareRoot(x: Int): Option[Double] = if(x < 0) None else Some(Math.sqrt(x))


/*
*  * Without using l.take nor l(index), create a function that will return the Some(element) at index n
   * otherwise None
* */
def getOption[T](l: List[T], index: Int): Option[T] =  l.lift(index)


def f(n: Int): Int = if (n > 1) n * f(n-1) else 1
f(5)

//Tailrec of fibonacci series

