
object arrayrange{
	def main(args:Array[String]){
	var mylist1 = range(10, 20, 2)
	var mylist2 = range(10, 20)
	for(x <- mylist1)
	{
		println(x)
	}
	for(y <- mylist2)
	{
		println(y)
	}
	}
}
