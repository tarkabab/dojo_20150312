def last(l: List[Int]) = {
  def lastOf(l: List[Int]): Int = l match {
    case Nil => -1
    case i :: Nil => i
    case _ :: t => lastOf(t)
  }
  lastOf(l)
}

def last2(l: List[Int]) = {
  if (l.isEmpty) -1 else l(l.size-1)
}

def last3(l: List[Int]) = {
  l.foldLeft(-1)(i :: Nil)
}

val l = List(1, 1, 4, 8)
assert (last2(List()) ==  -1)
assert(last2(l) == 8)
