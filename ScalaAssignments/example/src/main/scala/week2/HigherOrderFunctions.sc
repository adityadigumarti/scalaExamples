package week2

object HigherOrderFunctions {
  
  
  def sum(f : Int => Int) : (Int, Int) => Int = {
  	def sumF(a : Int, b : Int) : Int = {
        if(a > b) 0
        else f(a) + sumF(a + 1, b)
  	}
  	
  	sumF
  }                                               //> sum: (f: Int => Int)(Int, Int) => Int
  
  
  def sumX = sum(x => x)                          //> sumX: => (Int, Int) => Int
  
  sumX(5, 10)                                     //> res0: Int = 45
  
  
  sum(x => x)(5, 10)                              //> res1: Int = 45
  
  
  
  
  
  def product(f : Int => Int)(a : Int, b : Int) : Int =
  	if(a > b) 1
  	else f(a) * product(f)(a + 1, b)          //> product: (f: Int => Int)(a: Int, b: Int)Int
  	
  	
  
}