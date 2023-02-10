package com.codewithme.Basics
import scala.annotation.tailrec
object Recap {
  def main(args: Array[String]): Unit = {
 //Differnce betwoeen statement and expression
 val letitbevalue = false
 //Expression
 val checkinganExpression = if(letitbevalue) "the result is false" else "the result is true"

 val aCodeBlock = {
   if(letitbevalue) "We are checking the statment"
   56
 }
    //In the above though the return of ifstatement is string the last line we have int so the string return type is useless
  }

  //REcursion : Stack and tail
  @tailrec def factorial(n : Int,acc: Int) : Int =
    if(n<=0) acc
    else factorial(n-1,n*acc)
}

//OOP
