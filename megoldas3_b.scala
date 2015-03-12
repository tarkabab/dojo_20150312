val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val r = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
  def encode[A](list: List[Symbol]): List[(Int, Symbol)] = {
    def group[A](list: List[Symbol]): List[List[Symbol]] = list match {
      case h :: t => (h :: t.takeWhile { h == }) :: group(t.dropWhile { h == })
      case Nil    => Nil
    }
    group(list).map { l => (l.length, l.head) }
  }
  assert(encode(l) == r)
