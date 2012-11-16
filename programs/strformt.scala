object strformt{
	def main(args:Array[String])
	{
		var floatvar = 2.12121
		var intvar = 12
		var stringvar = "hello scala"
		var fs = ("The value of the float variable is " + " The value of the integer is" + "The string value is", floatvar, intvar, stringvar)
		println(fs)
	}
}
