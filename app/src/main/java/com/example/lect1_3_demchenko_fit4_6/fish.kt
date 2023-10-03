package com.example.lect1_3_demchenko_fit4_6

class fish (name: String, age: Int) : animal(name, age) {


    fun speed() : Int {

        var speed2 : Int
        speed2 = 0
        if (age > 15) {
            for (i in 1..5)
            {

                speed2 += 2
            }
        }
        else {
            var i = 1
            while (i <= 5)
            {
                speed2 += 1
            }
        }

    return speed2

    }
    // Додатковий метод для риб
    fun swim() {
        println("Риба пливе")
    }
}