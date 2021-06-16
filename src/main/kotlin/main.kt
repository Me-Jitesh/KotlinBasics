fun main() {

//    Variables in Kotlin - Kotlin Is Some time look like dynamic type but it is Static type
//    ctrl  + shift +   p = To See Data type

    println("*************************************************   Data  Types  **************************************************")

    var char = 'c'
    var string: String = "Hola"
    var int: Int = 10
    var long = 10L
    var short: Short = 10
    var byte: Byte = 127
    var float: Float = 10.0f
    var double: Double = 10.00
    var boolean: Boolean = true

    println("Character $char DataType ${char::class.simpleName}")
    println("String $string DataType ${string::class.simpleName}")
    println("Int $int DataType ${int::class.simpleName}")
    println("Long $long DataType ${long::class.simpleName}")
    println("Short $short DataType ${short::class.simpleName}")
    println("Byte $byte DataType ${byte::class.simpleName}")
    println("Float $float DataType ${float::class.simpleName}")
    println("Double $double DataType ${double::class.simpleName}")
    println("Boolean $boolean DataType ${boolean::class.simpleName}")

    println("*************************************************   Special Features  **************************************************")

    var forIntReadability = 10_000
    var forFloatReadability = 10_000.0f
    var forDoubleReadability = 1_00_000.00

//    var charInt:Int =char               //    Cannot Allowed In Kotlin Because Char Not Treated As ASCII here So Must Convert
    var charInt: Int = char.toInt()

    var rowString: String = """    Hola
    World   
    !!!     """

    println("For Double Readability $forIntReadability DataType ${forIntReadability::class.simpleName}")
    println("For Float Readability $forFloatReadability DataType ${forFloatReadability::class.simpleName}")
    println("For Double Readability $forDoubleReadability DataType ${forDoubleReadability::class.simpleName}")
    println("Char Assigned To Int $charInt DataType ${charInt::class.simpleName}")
    println("Row String $rowString DataType ${rowString::class.simpleName}")

}