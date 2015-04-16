package week5

object HigherOrderList {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(182); 
  
  
  def squareList(xs : List[Int]) : List[Int] = xs match {
        case Nil => List()
        case y :: ys => y * y :: squareList(ys)
  };System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(63); 
  
  
  def squareListMap(xs : List[Int]) = xs map (y => y* y);System.out.println("""squareListMap: (xs: List[Int])List[Int]""");$skip(37); 
  
  
  var list = List(1,2,3,4,5,6);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(63); 
  
  
  def sum(xs : List[Int]) = (0 :: xs) reduceRight(_ + _);System.out.println("""sum: (xs: List[Int])Int""");$skip(60); 
  def product(xs : List[Int]) = (1 :: xs) reduceLeft(_ * _);System.out.println("""product: (xs: List[Int])Int""");$skip(15); val res$0 = 
  
  sum(list);System.out.println("""res0: Int = """ + $show(res$0));$skip(16); val res$1 = 
  product(list);System.out.println("""res1: Int = """ + $show(res$1));$skip(22); val res$2 = 
  
  squareList(list);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(22); val res$3 = 
  squareListMap(list);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(36); val res$4 = 
  
  
  list filter (x => x%2 == 0);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(35); val res$5 = 
  
  list filterNot(x => x%2 == 0);System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(35); val res$6 = 
  
  list partition(x => x%2 == 0);System.out.println("""res6: (List[Int], List[Int]) = """ + $show(res$6));$skip(35); val res$7 = 
  
  list takeWhile(x => x%2 != 0);System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(38); val res$8 = 
  
  
  list dropWhile(x => x%2 != 0);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(57); 
  
  
  
  val data = List("a", "a","a","b","c","c","a");System.out.println("""data  : List[String] = """ + $show(data ));$skip(244); 
  
  def pack[T](xs : List[T]) : List[List[T]] = xs match {
      case Nil => Nil
      case x :: xs1 =>
         val (first, rest) = xs span(y => y == x)
         println ("sss")
         println (first, rest)
         first :: pack(rest)
  };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(19); val res$9 = 
  
  
  pack(data);System.out.println("""res9: List[List[String]] = """ + $show(res$9))}
}
