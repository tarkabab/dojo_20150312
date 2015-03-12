object worksheet2 {
  def encode[T](l: List[T]): List[(Int, T)] = {
    def loop(l: List[T], acc: List[(Int, T)], currentValue: T, count: Int): List[(Int, T)] = {
      l match {
        case `currentValue` :: t => loop(t, acc, currentValue, count + 1)
        case n :: t              => loop(t, (count, currentValue) :: acc, n, 1)
        case Nil                 => ((count, currentValue) :: acc).reverse
      }
    }
    l match {
      case Nil    => Nil
      case x :: l => loop(l, Nil, x, 1)
    }
  }                                               //> encode: [T](l: List[T])List[(Int, T)]

  val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
                                                  //> l  : List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e,
                                                  //|  'e)
  val r = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
                                                  //> r  : List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'
                                                  //| e))

  assert(encode(l) == r)

}