package com.example.lect1_3_demchenko_fit4_6

class dog (name: String, age: Int) : animal(name, age) , ПодатиГолос {
    override fun makeSound() {
        голосГучний()
    }

    override fun голосГучний() {
        println("Гав-гав!")
    }

    override fun голосТихий() {
        println("Тихенько гавкає")
    }

    // Додатковий метод для собаки
    fun wagTail() {
        println("Собака махає хвостиком")
    }
}