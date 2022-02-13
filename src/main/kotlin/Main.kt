fun main(args: Array<String>) {
    var studentName = arrayOf("James Kamau", "Princess Cheruto", "Zipporah Kananu", "Oluoch Obado", "Alan Kemboi", "Christine Oure")
    var studentAge = 28
    var studentCountry = "Kenya"
    var studentWeight = 90
    println(studentWeight)
    var phoneNumber = "08009867"
    println(phoneNumber)

    if (studentAge == 29) {
        println("Alan Kemboi")
    }else if (studentWeight == 90) {
        println("Oluoch Obado")
    } else{
        println("Christine Oure")
    }
    if (studentAge == 90) {
        println(studentCountry)
    }else{
        println("is not Kenyan")
    }
}