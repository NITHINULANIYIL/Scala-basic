import Array._
object arrayconcat{
	def main(args:Array[String]){
	var mylist1 = Array(1,2,3,4)
	var mylist2 = Array(5,6,7,8)
	var mylist3 = concat(mylist1,mylist2)
	for(x <- mylist3)
	{
		println(x)
	}
	}
}
