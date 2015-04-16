object Week5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  println("Welcome to the Scala worksheet");$skip(97); 
  
  
  
  
  def removeAt[T] (n : Int, xs : List[T]) : List[T] = (xs take n) ::: (xs drop n+ 1);System.out.println("""removeAt: [T](n: Int, xs: List[T])List[T]""");$skip(41); 
  
  val list = List('a', 'b', 'c', 'd');System.out.println("""list  : List[Char] = """ + $show(list ));$skip(43); 
  
 
  
  var x = List('a', 'b', 'c', 'd');System.out.println("""x  : List[Char] = """ + $show(x ));$skip(14); val res$0 = 
  
  x take 3;System.out.println("""res0: List[Char] = """ + $show(res$0));$skip(11); val res$1 = 
  x drop 4;System.out.println("""res1: List[Char] = """ + $show(res$1));$skip(57); 
  
  var y = 0 :: 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 :: Nil;System.out.println("""y  : List[Int] = """ + $show(y ));$skip(14); val res$2 = 
  
  y take 5;System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(14); val res$3 = 
  
  y drop 5;System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(14); val res$4 = 
  
  y length;System.out.println("""res4: Int = """ + $show(res$4));$skip(27); 
  
  val s = "Hello World";System.out.println("""s  : String = """ + $show(s ));$skip(26); val res$5 = 
  s filter(c=> c.isUpper);System.out.println("""res5: String = """ + $show(res$5));$skip(25); val res$6 = 
  s map (c => c.toUpper);System.out.println("""res6: String = """ + $show(res$6));$skip(35); 
 
 var r : Range = 1 until 8  by 2;System.out.println("""r  : Range = """ + $show(r ));$skip(26); 
 var s1 : Range  = 1 to 5;System.out.println("""s1  : Range = """ + $show(s1 ))}
 
  
}
