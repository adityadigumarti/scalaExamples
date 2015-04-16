package week3

object week3 {
   val t1 = new NonEmpty(3, Empty, Empty)         //> t1  : week3.NonEmpty = {.3.}
   val t2 = t1 incl 4                             //> t2  : week3.IntSet = {.3{.4.}}
   val t3 = t2 incl 1                             //> t3  : week3.IntSet = {{.1.}3{.4.}}
   val t4 = t3 incl 10                            //> t4  : week3.IntSet = {{.1.}3{.4{.10.}}}
   
   val p1 = new NonEmpty(7, Empty, Empty)         //> p1  : week3.NonEmpty = {.7.}
   val p2 = p1 incl 5                             //> p2  : week3.IntSet = {{.5.}7.}
   val p3 = p2 incl 2                             //> p3  : week3.IntSet = {{{.2.}5.}7.}
   val p4 = p3 incl 11                            //> p4  : week3.IntSet = {{{.2.}5.}7{.11.}}
     
   val pt = p4 union t4                           //> pt  : week3.IntSet = {{.1{.2.}}3{.4{{.5{.7.}}10{.11.}}}}
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
 