# dojo_20150312

exercises for the budapest.scala coding dojo

##exercise 0:

Find the last element of a list.

```scala
  def last(l: List[Int]) = {
    null
  }

  val l = List(1, 1, 2, 3, 5, 8)

  assert(last(l) == 8)
```

##exercise 1:

Find out whether a list is a palindrome.

```scala
  def isPalindrome(l: List[Int]) = {
    false
  }

  val l = List(1, 2, 3, 2, 1)

  assert(isPalindrome(l) == true)
```

##exercise 2:

Flatten a nested list structure.

```scala
    val l = List(List(1, 1), 2, List(3, List(5, 8)))
    val r = List(1, 1, 2, 3, 5, 8)

    assert(flatten(l) == r)
```
