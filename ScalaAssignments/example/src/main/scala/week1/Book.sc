package week1

object Book {
  case class Book (title : String, authors : List[String])
	
	val books : List[Book] = List (
			Book(title = "Title 1", authors = List("a1", "a2")),
			Book(title = "Title 2", authors = List("b1", "b2")),
			Book(title = "Title 3", authors = List("ac1", "c2")),
			Book(title = "Title 4", authors = List("d1", "d2")),
			Book(title = "Title 1", authors = List("e1", "e2")),
			Book(title = "Title 6", authors = List("f1", "f2")),
			Book(title = "Title 2", authors = List("g1", "ag2")),
			Book(title = "Title 5", authors = List("h1", "h2")),
			Book(title = "Title 9", authors = List("i1", "i2")),
			Book(title = "Title 10", authors = List("j1", "j2", "j3","aj2"))
	)                                         //> books  : List[week1.Book.Book] = List(Book(Title 1,List(a1, a2)), Book(Title
                                                  //|  2,List(b1, b2)), Book(Title 3,List(ac1, c2)), Book(Title 4,List(d1, d2)), B
                                                  //| ook(Title 1,List(e1, e2)), Book(Title 6,List(f1, f2)), Book(Title 2,List(g1,
                                                  //|  ag2)), Book(Title 5,List(h1, h2)), Book(Title 9,List(i1, i2)), Book(Title 1
                                                  //| 0,List(j1, j2, j3, aj2)))
	
	for(b <- books; a <- b.authors if(a startsWith "a")) yield b.title
                                                  //> res0: List[String] = List(Title 1, Title 1, Title 3, Title 2, Title 10)
 
 
  books sortWith (_.title < _.title)              //> res1: List[week1.Book.Book] = List(Book(Title 1,List(a1, a2)), Book(Title 1,
                                                  //| List(e1, e2)), Book(Title 10,List(j1, j2, j3, aj2)), Book(Title 2,List(b1, b
                                                  //| 2)), Book(Title 2,List(g1, ag2)), Book(Title 3,List(ac1, c2)), Book(Title 4,
                                                  //| List(d1, d2)), Book(Title 5,List(h1, h2)), Book(Title 6,List(f1, f2)), Book(
                                                  //| Title 9,List(i1, i2)))
                                                  
  books groupBy(_.title)                          //> res2: scala.collection.immutable.Map[String,List[week1.Book.Book]] = Map(Tit
                                                  //| le 2 -> List(Book(Title 2,List(b1, b2)), Book(Title 2,List(g1, ag2))), Title
                                                  //|  1 -> List(Book(Title 1,List(a1, a2)), Book(Title 1,List(e1, e2))), Title 6 
                                                  //| -> List(Book(Title 6,List(f1, f2))), Title 9 -> List(Book(Title 9,List(i1, i
                                                  //| 2))), Title 4 -> List(Book(Title 4,List(d1, d2))), Title 5 -> List(Book(Titl
                                                  //| e 5,List(h1, h2))), Title 3 -> List(Book(Title 3,List(ac1, c2))), Title 10 -
                                                  //| > List(Book(Title 10,List(j1, j2, j3, aj2))))
}