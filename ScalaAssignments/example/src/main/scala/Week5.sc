object Week5 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  
  
  def removeAt[T] (n : Int, xs : List[T]) : List[T] = (xs take n) ::: (xs drop n+ 1)
                                                  //> removeAt: [T](n: Int, xs: List[T])List[T]
  
  val list = List('a', 'b', 'c', 'd')             //> list  : List[Char] = List(a, b, c, d)
  
 
  
  var x = List('a', 'b', 'c', 'd')                //> x  : List[Char] = List(a, b, c, d)
  
  x take 3                                        //> res0: List[Char] = List(a, b, c)
  x drop 4                                        //> res1: List[Char] = List()
  
  var y = 0 :: 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 :: Nil
                                                  //> y  : List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7)
  
  y take 5                                        //> res2: List[Int] = List(0, 1, 2, 3, 4)
  
  y drop 5                                        //> res3: List[Int] = List(5, 6, 7)
  
  y length                                        //> res4: Int = 8
  
  val s = "Hello World"                           //> s  : String = Hello World
  s filter(c=> c.isUpper)                         //> res5: String = HW
  s map (c => c.toUpper)                          //> res6: String = HELLO WORLD
 
 var r : Range = 1 until 8  by 2                  //> r  : Range = Range(1, 3, 5, 7)
 var s1 : Range  = 1 to 5                         //> s1  : Range = Range(1, 2, 3, 4, 5)
 
  
}