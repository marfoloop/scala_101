package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyFlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    "Hello" shouldEqual "hello"
  }

  "The Hello object" should "say hello 2" in {
    "hello" shouldEqual "hello"
  }
}
