def encode(l: List[Symbol]) = l.foldLeft(List[(Int, Symbol)]())( (acc, sim) =>
	if (acc.length > 0 && acc.last._2 == sim) 
		acc.updated(acc.length - 1, (acc(acc.length - 1)._1 + 1, sim))
	else 
		acc :+ (1, sim)
) 