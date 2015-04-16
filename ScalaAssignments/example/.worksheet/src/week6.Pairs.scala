package week6

object Pairs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(41); 
  def n = 7;System.out.println("""n: => Int""");$skip(60); 
  
  def isPrime(n : Int) = (2 until n) forall (n % _ != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(115); val res$0 = 
  
  ((1 until n) flatMap(i =>
  	(1 until i) map (j => (i, j))
  )) filter ((pair) => isPrime(pair._1 + pair._2));System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0))}
  
  
  
}
