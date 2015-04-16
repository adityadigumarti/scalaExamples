package funsets

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class FunSetSuite extends FunSuite {


  /**
   * Link to the scaladoc - very clear and detailed tutorial of FunSuite
   *
   * http://doc.scalatest.org/1.9.1/index.html#org.scalatest.FunSuite
   *
   * Operators
   *  - test
   *  - ignore
   *  - pending
   */

  /**
   * Tests are written using the "test" operator and the "assert" method.
   */
  test("string take") {
    val message = "hello, world"
    assert(message.take(5) == "hello")
  }

  /**
   * For ScalaTest tests, there exists a special equality operator "===" that
   * can be used inside "assert". If the assertion fails, the two values will
   * be printed in the error message. Otherwise, when using "==", the test
   * error message will only say "assertion failed", without showing the values.
   *
   * Try it out! Change the values so that the assertion fails, and look at the
   * error message.
   */
  test("adding ints") {
    assert(1 + 2 === 3)
  }

  
  import FunSets._

  test("contains is implemented") {
    assert(contains(x => x == 100, 100))
  }
  
  test("union of two functions") {
    def unionF = union(x => x == 100 , x => x == 200)
    
    assert(contains(unionF, 100))
    assert(contains(unionF, 200))
    assert(contains(unionF, 300) == false)
  }
  
  /**
   * When writing tests, one would often like to re-use certain values for multiple
   * tests. For instance, we would like to create an Int-set and have multiple test
   * about it.
   * 
   * Instead of copy-pasting the code for creating the set into every test, we can
   * store it in the test class using a val:
   * 
   *   val s1 = singletonSet(1)
   * 
   * However, what happens if the method "singletonSet" has a bug and crashes? Then
   * the test methods are not even executed, because creating an instance of the
   * test class fails!
   * 
   * Therefore, we put the shared values into a separate trait (traits are like
   * abstract classes), and create an instance inside each test method.
   * 
   */

  trait TestSets {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
    
    
    val lessThan10 = (x : Int) => x < 10
    val greaterThan7 = (x : Int) => x > 7
    
    
    
  }

  /**
   * This test is currently disabled (by using "ignore") because the method
   * "singletonSet" is not yet implemented and the test would fail.
   * 
   * Once you finish your implementation of "singletonSet", exchange the
   * function "ignore" by "test".
   */
  test("singletonSet(1) contains 1") {
    
    /**
     * We create a new instance of the "TestSets" trait, this gives us access
     * to the values "s1" to "s3". 
     */
    new TestSets {
      /**
       * The string argument of "assert" is a message that is printed in case
       * the test fails. This helps identifying which assertion failed.
       */
      assert(contains(s1, 1), "Singleton")
      assert(contains(s2, 2), "Singleton")
      assert(contains(s3, 3), "Singleton")
      assert(!contains(s1, 2), "Singleton")
      assert(!contains(s2, 1), "Singleton")
      assert(!contains(s3, 4), "Singleton")
    }
  }

  test("union contains all elements") {
    new TestSets {
      val s = union(s1, s2)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(!contains(s, 3), "Union 3")
    }
  }
  
  test("intersect contains all elements") {
    new TestSets {
      val s = intersect(lessThan10, greaterThan7)
      assert(contains(s, 8), "Intersect 1")
      assert(contains(s, 9), "Intersect 2")
      assert(!contains(s, 10), "Intersect 3")
      assert(!contains(s, 7), "Intersect 4")
      assert(!contains(s, 2), "Intersect 5")
    }
  }
  
  
  test("Difference contains all elements of s not in t") {
    new TestSets {
      val s = diff(lessThan10, greaterThan7)
      assert(contains(s, 1), "diff 1")
      assert(contains(s, 2), "diff 2")
      assert(contains(s, 7), "diff 3")
      assert(!contains(s, 9), "diff 4")
      assert(!contains(s, 10), "diff 5")
      assert(!contains(s, 18), "diff 5")
    }
  }
  
  
  test("Filter Function") {
    new TestSets {
    	def x = FunSets.filter(lessThan10, _ > 5) 
    	
    	assert(contains(x, 6))
    	assert(!contains(x, 5))
    	assert(contains(x, 7))
    	assert(!contains(x, 10))
    	assert(!contains(x, 78))
    }
  }
  
  
  test("forall test") {
     new TestSets {
        val lessThan8 = (x : Int) => x < 8
        val greaterThan0 = (x : Int) => x > 0
        val s = intersect(greaterThan0, lessThan8)
        val k = (x : Int) => x == 2
        val f = diff(s, k)
        val a = (x : Int) => x == 1000
        val b = union(f, a)
        
    	assert(!forall( b, (x: Int) => x == 2 ), "incorrect forall" )
    	assert(forall( b, (x: Int) => x > -2 ), "Correct forall" )
     } 
     
  }
  
  test("exist test") {
     new TestSets {
       val s = (union(singletonSet(1),union(singletonSet(3), union(singletonSet(4),singletonSet(5)))))
       val s8 = union(s,union(singletonSet(7), singletonSet(1000)))
       
    	assert(!exists(s8,{_ == 2}))
    	assert(exists(s8,{_ == 1}))
    	assert(!exists(s8,{_ == 6}))
    	assert(!exists(s8,{_ == 9}))
    	assert(exists(s8,{_ == 4}))
       
      
     }
  }
     
     
   test("map test") {
     new TestSets {
       val s = (union(singletonSet(1),union(singletonSet(2), union(singletonSet(3),singletonSet(4)))))
       val s8 = union(s,union(singletonSet(5), singletonSet(6)))
       
        val myMap = map(s8, x => x * x)
       
    	assert(contains(myMap, 1))
        assert(!contains(myMap, 2))
        assert(contains(myMap, 4))
        assert(!contains(myMap, 3))
        assert(!contains(myMap, -3))
        assert(contains(myMap, 9))
   
     }
     
  }
  
  
}
