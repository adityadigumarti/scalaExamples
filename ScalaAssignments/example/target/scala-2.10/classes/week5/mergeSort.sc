package week5

object mergeSort {
  def mergeSort(xs : List[Int]) : List[Int] = {
  	val n = xs.length/2
  	if(n == 0) xs
  	else {
  	  def merge(xs : List[Int], ys : List[Int]) : List[Int] = (xs, ys) match {
  	     case (xs, Nil) => xs
  	     case (Nil, ys) => ys
  	     case (x :: xs1, y :: ys1) => if(x < y) x :: merge(xs1, ys) else y :: merge(xs, ys1)
  	  }
  	  
  	  val(fst, snd) = xs splitAt n
  	  merge(mergeSort(fst), mergeSort(snd))
  	}
  
  }                                               //> mergeSort: (xs: List[Int])List[Int]
  
  
  
  val nums = List(2, -3, 5, -7, 9, 3)             //> nums  : List[Int] = List(2, -3, 5, -7, 9, 3)
  mergeSort(nums)                                 //> res0: List[Int] = List(-7, -3, 2, 3, 5, 9)
}