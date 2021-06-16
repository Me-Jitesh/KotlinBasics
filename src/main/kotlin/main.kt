fun main() {

//    Variables in Kotlin - Kotlin Is Some time look like dynamic type but it is Static type

    println("*************************************************   Mutable Variable **************************************************")

    var specifiedType: String = "Hola"
    var pseudoDynamic = "122"

    println("Specifying Type Explicitly $specifiedType Type Is : ${specifiedType::class.simpleName}")
    println(" Specifying Type Internally $pseudoDynamic Type Is : ${pseudoDynamic::class.simpleName}")

    //    This Is Allowed In var because It Is mutable So Value Can Be Change

    println("+++++++++++Values After Change ++++++++++++++++")

    specifiedType = "122"
    pseudoDynamic = "Hola"

    println("Specifying Type Explicitly $specifiedType Type Is : ${specifiedType::class.simpleName}")
    println(" Specifying Type Internally $pseudoDynamic Type Is : ${pseudoDynamic::class.simpleName}")

    println("*************************************************   Immutable Variable **************************************************")

    val a: Int = 10
    val b = 20

    println("Operation On Variables ${a + b}")
    println("Specifying Type Explicitly $a Type Is : ${a::class.simpleName}")
    println(" Specifying Type Internally $b Type Is : ${b::class.simpleName}")

//    This Is Not Allowed In val because It Is Immutable So Value Cannot Be Change
//    a=20
//    b=10

}