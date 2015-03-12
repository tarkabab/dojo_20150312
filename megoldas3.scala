val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
val r = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))

def encode(l: List[Symbol]): List[(Int, Symbol)] = {

	case class SymbolCounter(symbol: Symbol, count: Int)

	val result = l.foldLeft(List.empty[SymbolCounter]) { (acc, symbol) =>

		acc match {
			case x :: xs if symbol == x.symbol => x.copy(count = x.count + 1) +: xs
			case x :: xs => SymbolCounter(symbol, 1) +: (x +: xs)
			case _ => List(SymbolCounter(symbol, 1))
		}

	}

	result.reverse.map(sc => (sc.count, sc.symbol))

}

assert(encode(l) == r)
