package week2

object Rational {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 

    
   val c = new Rational(1, 2);System.out.println("""c  : week2.Rational = """ + $show(c ));$skip(11); val res$0 = 
   c.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(11); val res$1 = 
   c.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(34); 
   
   def ex = new Rational(1,3);System.out.println("""ex: => week2.Rational""");$skip(35); 
      def why = new Rational(5, 7);System.out.println("""why: => week2.Rational""");$skip(35); 
      def zee = new Rational(3, 2);System.out.println("""zee: => week2.Rational""")}
      
      //val xx = ex.substract(why).substract(zee)
     // xx.substract(zee)
}


class Rational(x : Int, y : Int)  {
	
			private def gcd(a : Int, b : Int) : Int = if(b == 0) a else gcd(b, a % b)
			private val g = gcd(x, y)

   		def numer = x/g
   		def denom = y/g
   		
   		def add(that : Rational) : Rational =
       	new Rational ((numer * that.denom + denom * that.numer), denom * that.denom)
       	
      override def toString = numer + "/" + denom
      
      def neg : Rational= new Rational(-x, y)
      
      
	
   }
