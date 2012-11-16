import scala.util.matching.Regex
	
object reglr2 {
	def main(args: Array[String]) {
		val pattern = "Scala".r
		val str = "Scala is scalable and cool"
		println(pattern replaceFirstIn(str, "java"))
		}
	}
