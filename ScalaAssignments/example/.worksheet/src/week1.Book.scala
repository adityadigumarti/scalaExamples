package week1

object Book {
  case class Book (title : String, authors : List[String]);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(699); 
	
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
	);System.out.println("""books  : List[week1.Book.Book] = """ + $show(books ));$skip(70); val res$0 = 
	
	for(b <- books; a <- b.authors if(a startsWith "a")) yield b.title;System.out.println("""res0: List[String] = """ + $show(res$0));$skip(41); val res$1 = 
 
 
  books sortWith (_.title < _.title);System.out.println("""res1: List[week1.Book.Book] = """ + $show(res$1));$skip(76); val res$2 = 
                                                  
  books groupBy(_.title);System.out.println("""res2: scala.collection.immutable.Map[String,List[week1.Book.Book]] = """ + $show(res$2))}
}
