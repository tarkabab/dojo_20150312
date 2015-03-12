val l = List(List(1, 1), 2, List(3, List(5, 8)))
val r = List(1, 1, 2, 3, 5, 8)

def flatten(ll: List[Any]) = {
  def f(lr:List[Any], la:List[Any]): List[Any] = lr match {
    case Nil => la
    case h :: t => h match {
      case i: Int => f(t, la :+ i)
      case ml: List[Any] => f(t, la ++ f(ml, Nil))
    }
  }
  f(ll, Nil)
}

flatten(l)
assert(flatten(l) == r)
