// Code with <3

// Created by Cansu AKTAŞ
// yeksancansu@gmail.com
// 5.02.2019 - 21:22

fun main(args: Array<String>) {

    // Method 1:

    val max = 12

    for (i in 0..max step 2) {
        for (k in 0..(max - i) / 2) {
            print(" ")
        }

        for (j in 0..i) {
            print("*")
        }
        println("")
    }


    // Method 2:

    println(
        """
        |      *
        |     ***
        |    *****
        |   *******
        |  *********
        | ***********
        |*************
    """.trimMargin()
    )

}
