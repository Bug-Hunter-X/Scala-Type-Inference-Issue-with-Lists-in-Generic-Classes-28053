```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    myInt.printValue()

    val myString = new MyClass("hello")
    myString.printValue()

    // Solution: Specify the type parameter explicitly
    val myList = new MyClass[List[Int]](List(1, 2, 3))
    myList.printValue() 

    //Alternative solution: using AnyVal to avoid the issue
    val myList2 = new MyClass[AnyVal](List(1,2,3))
    myList2.printValue()

  }
}
```