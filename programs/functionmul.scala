

object functionmul{
	def mulint( a:Int, b:Int):Int = {
		var rslt:Int = 0
		rslt = a * b
		return rslt
		}

	def main(args:Array[String]){
		println("The product of 5 and 6 is", +mulint(5,6));
		}
	} 
