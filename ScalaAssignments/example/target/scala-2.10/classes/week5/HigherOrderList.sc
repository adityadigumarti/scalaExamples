package week5

object HigherOrderList {
  
  
  def squareList(xs : List[Int]) : List[Int] = xs match {
        case Nil => List()
        case y :: ys => y * y :: squareList(ys)
  }                                               //> squareList: (xs: List[Int])List[Int]
  
  
  def squareListMap(xs : List[Int]) = xs map (y => y* y)
                                                  //> squareListMap: (xs: List[Int])List[Int]
  
  
  var list = List(1,2,3,4,5,6)                    //> list  : List[Int] = List(1, 2, 3, 4, 5, 6)
  
  
  def sum(xs : List[Int]) = (0 :: xs) reduceRight(_ + _)
                                                  //> sum: (xs: List[Int])Int
  def product(xs : List[Int]) = (1 :: xs) reduceLeft(_ * _)
                                                  //> product: (xs: List[Int])Int
  
  sum(list)                                       //> res0: Int = 21
  product(list)                                   //> res1: Int = 720
  
  squareList(list)                                //> res2: List[Int] = List(1, 4, 9, 16, 25, 36)
  squareListMap(list)                             //> res3: List[Int] = List(1, 4, 9, 16, 25, 36)
  
  
  list filter (x => x%2 == 0)                     //> res4: List[Int] = List(2, 4, 6)
  
  list filterNot(x => x%2 == 0)                   //> res5: List[Int] = List(1, 3, 5)
  
  list partition(x => x%2 == 0)                   //> res6: (List[Int], List[Int]) = (List(2, 4, 6),List(1, 3, 5))
  
  list takeWhile(x => x%2 != 0)                   //> res7: List[Int] = List(1)
  
  
  list dropWhile(x => x%2 != 0)                   //> res8: List[Int] = List(2, 3, 4, 5, 6)
  
  
  
  val data = List("a", "a","a","b","c","c","a")   //> data  : List[String] = List(a, a, a, b, c, c, a)
  
  def pack[T](xs : List[T]) : List[List[T]] = xs match {
      case Nil => Nil
      case x :: xs1 =>
         val (first, rest) = xs span(y => y == x)
         println ("sss")
         println (first, rest)
         first :: pack(rest)
  }                                               //> pack: [T](xs: List[T])List[List[T]]
  
  
  pack(data)                                      //> sss
                                                  //| (List(a, a, a),List(b, c, c, a))
                                                  //| sss
                                                  //| (List(b),List(c, c, a))
                                                  //| sss
                                                  //| (List(c, c),List(a))
                                                  //| sss
                                                  //| (List(a),List())
                                                  //| res9: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 
}