  val l4 = List(List(1, 1), 2, List(3, List(5, 8)))                           
  val r = List(1, 1, 2, 3, 5, 8)                  

  def flatten[Any](list: List[Any]): List[Any] = list match {
    case Nil                   => Nil
    case (ls: List[Any]) :: tail => flatten(ls) ::: flatten(tail)
    case h :: tail             => h :: flatten(tail)
  }                                               

  assert(flatten(l4) == r)
