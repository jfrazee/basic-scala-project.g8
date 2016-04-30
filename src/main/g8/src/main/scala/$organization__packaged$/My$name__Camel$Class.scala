package $organization$

// Typesafe Config
import com.typesafe.config.ConfigFactory

class My$name;format="Camel"$Class {
  private[this] val className = this.getClass.getName

  private[this] lazy val config = ConfigFactory.load().getConfig(className)

  def hello(): String = {
    config.getString("message")
  }
}

object My$name;format="Camel"$Class {
  private val className = this.getClass.getName.dropRight(1)

  private lazy val config = ConfigFactory.load().getConfig(className)

  def main(args: Array[String]): Unit = {
    val hello = new My$name;format="Camel"$Class()
    println(hello.hello())
  }
}
