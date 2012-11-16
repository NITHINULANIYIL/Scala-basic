object pat{
	def main(args:Array[String]){
		println(matchtest(2))
	}
	def matchtest(x: Int):String = x match {
		case 1 => "one"
		case 2 => "two"
		case _ => "many"
	}
}
