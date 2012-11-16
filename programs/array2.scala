object array2{
	def main(args:Array[String]){
		var mylist = Array(1,2,3,4)
		var total = 0.00
		for( x <- 0 to (mylist.length-1))
		{
			total += mylist(x)
		}
		println(total)
	}
}
