object Test {

	case class Book (title : String, authors : List[String])
	
	val books : List[Book] = List (
			Book(title = "Title 1", authors = List("a1, a2")),
			Book(title = "Title 1", authors = List("b1, b2")),
			Book(title = "Title 1", authors = List("ac1, c2")),
			Book(title = "Title 1", authors = List("d1, d2")),
			Book(title = "Title 1", authors = List("e1, e2")),
			Book(title = "Title 1", authors = List("f1, f2")),
			Book(title = "Title 1", authors = List("ag1, g2")),
			Book(title = "Title 1", authors = List("h1, h2")),
			Book(title = "Title 1", authors = List("i1, i2")),
			Book(title = "Title 1", authors = List("aj1, j2"))
	)
	
	for(b <- books; a <- b.authors if(a startsWith "a")) yield b.title
}