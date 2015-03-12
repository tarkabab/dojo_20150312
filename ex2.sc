object ex2 {
  def flatten(l: List[Any]): List[Any] = l match {
    case x :: xs => x match {
      case ll: List[Any] => flatten(ll) ++ flatten(xs)
      case _ => x :: flatten(xs)
    }
    case Nil => Nil
  }

  val l = List(List(1, List(1, 2, 3), 1), 2, List(3, List(5, 8)))
  val e = List(1, 1, 2, 3, 1, 2, 3, 5, 8)
  val a = flatten(l)

  assert(a == e)
}
