fun main(args: Array<String>) {
    salutePerson("Nyanchoka")
    modulus(74,13)
    addition(653,645,378,3768)
    interestingFact("Faith","dancing")



}

fun salutePerson(name:String){
    println("Hello "+name)
}
fun modulus(num1:Int, num2:Int){
    var modulus = num1%num2
    println(modulus)
}
fun addition(num1:Int,num2:Int,num3:Int,num4:Int): Int{
    var sum = num1+num2+num3+num4
    return sum
    println(sum)
}
fun interestingFact(name:String,Fact:String){
    println(name +Fact)
}