
object matrix{
	def main(args:Array[String]){
		var mymatrix:Array = new Array(3,3)
		for(i <- 0 to 2){
			for(j <- 0 to 2){
				mymatrix(i)(j) = j;
				}
			}
		for(i <- 0 to 2)
		{
			for(j <- 0 to 2){
				println(" "+ mymatrix(i)(j));
			}
		}
		println();
	}
}
