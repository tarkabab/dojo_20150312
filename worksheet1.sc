object worksheet1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def flatten(l: Any): List[Int] = {
    l match {
      case Nil                => List()
      case number: Int        => List(number)
      case numbers: List[Any] => flatten(numbers.head) ::: flatten(numbers.tail)
    }
  }                                               //> flatten: (l: Any)List[Int]

  val l = List(List(1, 1), 2, List(3, List(5, 8)))//> l  : List[Any] = List(List(1, 1), 2, List(3, List(5, 8)))
  val r = List(1, 1, 2, 3, 5, 8)                  //> r  : List[Int] = List(1, 1, 2, 3, 5, 8)

  assert(flatten(l) == r)

}