package week5

object mergeSort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(461); 
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
  
  };System.out.println("""mergeSort: (xs: List[Int])List[Int]""");$skip(47); 
  
  
  
  val nums = List(2, -3, 5, -7, 9, 3);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(18); val res$0 = 
  mergeSort(nums);System.out.println("""res0: List[Int] = """ + $show(res$0))}
}
