package week3

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