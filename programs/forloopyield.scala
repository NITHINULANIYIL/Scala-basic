object forloopfilters {
	def main(args: Array[String]) {
		var a = 0;
		val numList = List(1,2,3,4,5,6,7,8,9,10);
		var retval=for{ a <- numList
		if a != 3; if a < 8 }yield a
		for (a <-retval){
			println( "Value of a: " + a );
			}
		}
	}

