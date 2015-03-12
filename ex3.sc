object ex3 {
	def encode[T](l: List[T]): List[(Int,T)] = {
		def encode2(t: T, n: Int, l: List[T]): List[(Int,T)] = l match {
			case x :: xs  => if (x == t) encode2(t, n+1, xs) else (n, t) :: encode2(x, 1, xs)
			case x :: Nil => if (x == t) (n+1, t) :: Nil else (n,t) :: (1, x) :: Nil
			case Nil => List((n,t))
		}
		
		if (l.isEmpty) Nil
		else encode2(l.head, 1, l.tail)
	}

  val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val e = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
	val a = encode(l)

  assert(a == e)
}
