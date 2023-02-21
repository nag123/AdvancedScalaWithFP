package com.codewithme.Basics


object ExerciceOptionCreator {

  /**
   *
   * Our own simplified implementation of Option type
   *
   *
   */
  trait MyOption[+T] {
    def get: T
    /**
     *
     * Method to implement here
     *
     * Note: U :> T says that B type parameter must be a supertype of T
     * hint: implements the methods of MySome and MyNone before
     */
    def getOrElse[U >: T](e: U): U = { if (isEmpty) e else get}
    def isEmpty: Boolean
  }

  class MySome[T](x: T) extends MyOption[T] {
    def get: T = x
    def isEmpty: Boolean = false
  }

  object MySome {
    def apply[T](e: T): MySome[T] = new MySome(e)
  }

  object MyNone extends MyOption[Nothing] {
    def get : Nothing = throw new NoSuchElementException("None.get")
    def isEmpty: Boolean = true
  }
}