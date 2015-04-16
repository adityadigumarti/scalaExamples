package recfun

object ListTest {
  def s = "0123456789"                            //> s: => String

	println(s.toList.splitAt(5))              //> (List(0, 1, 2, 3, 4),List(5, 6, 7, 8, 9))
}