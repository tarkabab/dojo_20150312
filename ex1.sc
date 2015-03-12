object ex1 {
  def isPalindrome1[T](l: List[T]) = l.reverse == l

  def isPalindrome2[T](list: List[T]): Boolean = {
  	def check(rev: List[T], revLength: Int, list: List[T], listLength: Int): Boolean = {
  		if (revLength > listLength) false
  		else if (revLength == listLength) rev == list
  		else if (revLength == listLength - 1) check(rev, revLength, list.tail, listLength - 1)
  		else list match {
  			case x::xs => check(x::rev, revLength+1, xs, listLength-1)
  			case Nil => false
  		}
  	}
  	check(Nil, 0, list, list.length)
  }

  assert(isPalindrome1(List(1,2,3,2,1)))
  assert(isPalindrome1(Nil))
  assert(isPalindrome1(List(1)))
  assert(isPalindrome1(List(1,2,3,3,2,1)))
  assert(!isPalindrome1(List(1,2,3,2,4)))
  assert(!isPalindrome1(List(1,2,3,4)))

  assert(isPalindrome2(List(1,2,3,2,1)))
  assert(isPalindrome2(Nil))
  assert(isPalindrome2(List(1)))
  assert(isPalindrome2(List(1,2,3,3,2,1)))
  assert(!isPalindrome2(List(1,2,3,2,4)))
  assert(!isPalindrome2(List(1,2,3,4)))

}
