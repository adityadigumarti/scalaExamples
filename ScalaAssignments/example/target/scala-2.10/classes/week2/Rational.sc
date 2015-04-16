package week2

object Rational {

    
   val c = new Rational(1, 2)                     //> c  : week2.Rational = 1/2
   c.numer                                        //> res0: Int = 1
   c.denom                                        //> res1: Int = 2
   
   def ex = new Rational(1,3)                     //> ex: => week2.Rational
      def why = new Rational(5, 7)                //> why: => week2.Rational
      def zee = new Rational(3, 2)                //> zee: => week2.Rational
      
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