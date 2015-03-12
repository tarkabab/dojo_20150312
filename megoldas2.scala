val l = List(List(1, 1), 2, List(3, List(5, 8)))
val r = List(1, 1, 2, 3, 5, 8)

def flatten(l: List[Any]): List[Any] = {
	l.foldLeft(List.empty[Any]) { (acc, item) =>
		item match {
			case l: List[Any] => acc ++ flatten(l)
			case i => acc :+ i
		}
	}
}

assert(flatten(l) == r)
