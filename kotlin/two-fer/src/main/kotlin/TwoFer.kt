fun twofer(name: String? = null): String {

    val result =
    if (name == null) "One for you, one for me."
       else "One for $name, one for me."
    
    return result 
}

fun main(){
    
val personName = twofer("Alice")
    println(personName)
    
    println(twofer(null))
    println(twofer())
}
