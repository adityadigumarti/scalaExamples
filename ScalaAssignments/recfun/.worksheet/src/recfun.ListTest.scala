package recfun

object ListTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 
  def s = "0123456789";System.out.println("""s: => String""");$skip(31); 

	println(s.toList.splitAt(5));$skip(20); 
	
	val l = s.toList;System.out.println("""l  : List[Char] = """ + $show(l ));$skip(28); 
	
	for(x <- l)
		println(x)}
}
