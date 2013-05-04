/**
 * Created with IntelliJ IDEA.
 * User: apprentice
 * Date: 5/4/13
 * Time: 1:46 PM
 * To change this template use File | Settings | File Templates.
 */
object HelloWorld {
  def main(args: Array[String]) {
    println("Hello World")

    //
    loopSeveralTimes()
  }

  /**
   * Learn how for loop works
   */
  def loopSeveralTimes() {
    for (i <- 1 to 5) {
      println("printed from loop")
    }
  }
}
