fun main (args:Array<String>){
    println("Enter age")
    var age = readLine()!!.toInt()
    if (age>= 18) {
        println("Admit to the club")
    }
    else {
        println("Under age")
    }
}