```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    myInt.printValue() // This works fine

    val myString = new MyClass("hello")
    myString.printValue() // This works fine

    //Problem starts here
    val myList = new MyClass(List(1, 2, 3))
    myList.printValue()
  }
}
```