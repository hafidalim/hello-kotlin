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
        |Alamat : ---
        |Kecamatan : ---
        |Kabupaten : ---
    """.trimMargin()

    println(bigString)

    val firstName = "Hafid "
    val lastName = "Ali Mustaqim"
    val fullName = firstName + lastName
    val myDetails = "Halo nama saya $fullName"
    println(myDetails)

    val coordinates : Pair<Int, Int> = Pair(1,2)
    println(coordinates)

    //type inference
    val coorInfered = Pair(10,9)

    //to
    val coorWithTo = 10 to 8

    val x = coorWithTo.first
    val y = coorWithTo.second
    println(y)

    //Triple
    val coordinate3D = Triple(3,4,5)
    val (x1,y1,z1) = coordinate3D

    val tgl = Triple(10,2,1)
    val (month,_,years) = tgl

    val coordinateS = 2 to 3
    val (row, column) = coordinateS

    val date = Triple(15,8,2015)
    val day = date.first

    var name = "Joe"
    name += " Howard"

    val triple = Triple(100,1.5,10)
    val value = triple.second

    val number = 10
    val muliplier = 5
    val summary = "$number multiplied by $muliplier equals ${number*muliplier}"
    println(summary)

    val a = 4
    val b : Short = 100
    val c : Byte = 12

    val itung = a + b - c
    println(itung)



}