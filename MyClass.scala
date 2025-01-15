```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    if (newAge < 0) throw new IllegalArgumentException("Age cannot be negative")
    _age = newAge
  }
}

object Main extends App {
  val person = new MyClass("John")
  person.age = 30
  println(person.age) // Output: 30

  try {
    person.age = -5  // This will throw an exception
  } catch {
    case e: IllegalArgumentException => println(e.getMessage) // Output: Age cannot be negative
  }
}
```