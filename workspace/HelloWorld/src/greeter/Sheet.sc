package greeter

import List._

object Sheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  val x = 5                                       //> x  : Int = 5
  def increase(i : Int) = i + 1                   //> increase: (i: Int)Int
  increase(x)                                     //> res0: Int = 6
  
  def sum(numList : List[Int]) : Int = {
  	numList.max
 	}                                         //> sum: (numList: List[Int])Int
  	
  	
  	sum(List(-1,-2,-3))                       //> res1: Int = -1
  
}