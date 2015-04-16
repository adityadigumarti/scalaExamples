package greeter

import List._

object Sheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 
  println("Welcome to the Scala worksheet");$skip(18); 
  
  
  val x = 5;System.out.println("""x  : Int = """ + $show(x ));$skip(32); 
  def increase(i : Int) = i + 1;System.out.println("""increase: (i: Int)Int""");$skip(14); val res$0 = 
  increase(x);System.out.println("""res0: Int = """ + $show(res$0));$skip(63); 
  
  def sum(numList : List[Int]) : Int = {
  	numList.max
 	};System.out.println("""sum: (numList: List[Int])Int""");$skip(31); val res$1 = 
  	
  	
  	sum(List(-1,-2,-3));System.out.println("""res1: Int = """ + $show(res$1))}
  
}
