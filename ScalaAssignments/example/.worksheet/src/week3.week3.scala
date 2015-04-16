package week3

object week3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
   val t1 = new NonEmpty(3, Empty, Empty);System.out.println("""t1  : week3.NonEmpty = """ + $show(t1 ));$skip(22); 
   val t2 = t1 incl 4;System.out.println("""t2  : week3.IntSet = """ + $show(t2 ));$skip(22); 
   val t3 = t2 incl 1;System.out.println("""t3  : week3.IntSet = """ + $show(t3 ));$skip(23); 
   val t4 = t3 incl 10;System.out.println("""t4  : week3.IntSet = """ + $show(t4 ));$skip(46); 
   
   val p1 = new NonEmpty(7, Empty, Empty);System.out.println("""p1  : week3.NonEmpty = """ + $show(p1 ));$skip(22); 
   val p2 = p1 incl 5;System.out.println("""p2  : week3.IntSet = """ + $show(p2 ));$skip(22); 
   val p3 = p2 incl 2;System.out.println("""p3  : week3.IntSet = """ + $show(p3 ));$skip(23); 
   val p4 = p3 incl 11;System.out.println("""p4  : week3.IntSet = """ + $show(p4 ));$skip(30); 
     
   val pt = p4 union t4;System.out.println("""pt  : week3.IntSet = """ + $show(pt ))}
}


 abstract class IntSet {
 		def incl(x : Int) : IntSet
 		def contains(x : Int) : Boolean
 		def union(other : IntSet) : IntSet
 }
 
 object Empty extends IntSet {
 	   def contains(x : Int) : Boolean = false
 	   def incl(x :Int) : IntSet = new NonEmpty(x, Empty, Empty)
 	   override def toString = "."
 	   def union(other : IntSet) : IntSet = other
 }
 
 
 class NonEmpty(elem : Int, left : IntSet, right : IntSet) extends IntSet {
     
     def contains(x : Int) : Boolean = {
        if(x < elem) left contains x
        else if (x > elem) right contains x
        else true
     }
     
     def incl(x : Int) : IntSet = {
        if(x < elem) new NonEmpty(elem, left incl x, right)
        else if(x > elem) new NonEmpty(elem, left, right incl x)
        else this
     }
     
     override def toString = "{" + left + elem + right + "}"
     
     def union (other : IntSet) : IntSet = ((left union right) union other) incl elem
 }
 