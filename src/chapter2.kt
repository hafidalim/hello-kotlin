fun main() {
    val bilBulat : Int = 100
    val toDec = bilBulat.toDouble()
    val toChar = bilBulat.toChar()
    println(toDec)
    println(toChar)
    val tarif : Double = 20.5
    val jam : Int = 8
    val gaji : Double = tarif * jam
    println(gaji)

    val typeInference = 100

    val age1 = 42
    val age2 = 21

    val avg1  = (age1.toDouble()+age2.toDouble()) / 2
    val emot = 128512
    emot.toChar()
    println(emot)
    val nama = "Hafid"
    println("Nama saya adalah $nama")

    val bigString = """
        |Alamat : Kaliajir
        |Kecamatan : Purwanegara
        |Kabupaten : Banjarnegara
    """.trimMargin()

    println(bigString)

    val firstName = "Hafid"
    val lastName = "Ali Mustaqim"
    println("$firstName $lastName")
}