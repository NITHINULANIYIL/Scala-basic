

object functionadd{
	def main(args:Array[String]){
		println("sum 3 and 5 is :", +add(3,5));
			}		
	def add( a:Int, b:Int): Int = {
		var sum:Int = 0
		sum =  a+b
		return sum
	}
}
