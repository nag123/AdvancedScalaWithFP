
/*OPTIONS IN SCALA - A function may not return a result always in those cases
* we go with Options
*
* Option can be defined -> which in case will be Some
* Option can be undefined -> which in case will be None
* */

def mean(xs : Seq[Double]) : Double = {
  if(xs.isEmpty) throw new ArithmeticException("Mean of empty list")
  else xs.sum/xs.length
}

//After adding option[Double] -> it either returns Double or None

def meanwithOption(xs : Seq[Double]) : Option[Double] = {
  if(xs.isEmpty) None
  else Some(xs.sum/xs.length)
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

/*METHODS OF OPTIONS
* GET
* GETORELSE
* */

//GET HAVE SOME AND NONE AS RETURNS
//example :
/*
* Some(5).get => 5
* None.get    => java.util.NoSuchElementException: None.get
*
* getorelse
Some(5).getOrElse(2) // 5
None.getOrElse(2) // 2

Option(1) // Some(1)
Option(null) // None

Some(1).isEmpty // false
None.isEmpty // true
*
* List(e1) => e1
Option(e1) => e1

List() => Nil
Option(null) => None
* */

//MAP,FLATMAP , OPTION
val name : List[String] = List("John Sena")
val namelength = name.map(x => x.length)

val nametodofunctions : List[String]  = List("John Sena","Big Show")
val nametodofunctionssplitmap = nametodofunctions.map(x => x.split(" "))
val nametodofunctionsflatmap = nametodofunctions.flatMap(x=> x.split(" "))

val nameusingoption : Option[String] = Option("Under Taker")
val namelengthofoption = nameusingoption.map(x => x.length)
val namesofoptionforfunctions :Option[String] = Option("Hari Haran")
val namesofoptionforfunctionssplitmap = namesofoptionforfunctions.map(x => Option(x))
val namesofoptionforfunctionsflatmap = namesofoptionforfunctions.flatMap(x=>Option(x))





def f(n: Int): Int = if (n > 1) n * f(n-1) else 1
f(5)

//Tailrec of fibonacci series

