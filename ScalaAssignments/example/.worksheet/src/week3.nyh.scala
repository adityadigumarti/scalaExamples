package week3

object nyh {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(118); 
  def nth[T](n : Int, xs : List[T]): T =
  	if(n == 0) xs.head
  	else nth(n - 1, xs.tail);System.out.println("""nth: [T](n: Int, xs: week3.List[T])T""");$skip(69); 
  	
  	
  	val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : week3.Cons[Int] = """ + $show(list ));$skip(165); val res$0 = 
                                                  
                                                  
                                                  nth(1, list);System.out.println("""res0: Int = """ + $show(res$0))}
}
