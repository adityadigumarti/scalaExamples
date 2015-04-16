package week2

object HigherOrderFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(216); 
  
  
  def sum(f : Int => Int) : (Int, Int) => Int = {
  	def sumF(a : Int, b : Int) : Int = {
        if(a > b) 0
        else f(a) + sumF(a + 1, b)
  	}
  	
  	sumF
  };System.out.println("""sum: (f: Int => Int)(Int, Int) => Int""");$skip(31); 
  
  
  def sumX = sum(x => x);System.out.println("""sumX: => (Int, Int) => Int""");$skip(17); val res$0 = 
  
  sumX(5, 10);System.out.println("""res0: Int = """ + $show(res$0));$skip(27); val res$1 = 
  
  
  sum(x => x)(5, 10);System.out.println("""res1: Int = """ + $show(res$1));$skip(122); 
  
  
  
  
  
  def product(f : Int => Int)(a : Int, b : Int) : Int =
  	if(a > b) 1
  	else f(a) * product(f)(a + 1, b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""")}
  	
  	
  
}
