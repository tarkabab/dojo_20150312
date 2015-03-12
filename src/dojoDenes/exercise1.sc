def isPalindrome(l: List[Int]) = {
  l.reverse == l
}

val l = List(1, 2, 3, 2, 1)

assert(isPalindrome(l) == true)
