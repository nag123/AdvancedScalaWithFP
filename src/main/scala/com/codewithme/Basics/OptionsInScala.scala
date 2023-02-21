package com.codewithme.Basics

import com.codewithme.Basics.OptionsInScala.PersonDao.persons


object OptionsInScala {

  /**
   *
   * email is not mandatory
   *
   */
  class Person(val name: String, val age: Int, val email: Option[String]) {
    override def toString = s"Person($name, $age, $email)"
  }

  object Person { def apply(name: String, age: Int, email: Option[String]) = new Person(name, age, email) }

  object PersonDao {

      val persons = Map(
      1 -> Person("John Snow", 25, Some("john.snow@winterfell.we")),
      2 -> Person("Tyrion Lannister", 30, Some("theimp@CasterlyRock.we")),
      3 -> Person("Sandor Clegane", 40, None))

    def findById(id: Int): Option[Person] = persons.get(id)
    def findAll = persons.values
  }

  /**
   *
   * return the name of p otherwise "N/A"
   * using only if, else and Option methods
   */

  def getName(p: Option[Person]): String =
    p.map(x => x.name) match {
      case Some(i) => i
      case None => "N/A"
    }
  /**
   *  Write the same function that bellow using only map and getOrElse
   */
  def getNameUsingMap(p: Option[Person]): String = p.map(x => x.name).getOrElse("N/A")


  /**
   *
   * return the email of the persons
   *
   * Watch out: email in already an Option[String]
   */
  def getEmail(p: Option[Person]): Option[String] = p.map(x => x.email.get)
}