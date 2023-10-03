package com.example.lect1_3_demchenko_fit4_6

open class animal(private var name: String, var age: Int) {
    // Публічна функція для отримання імені тварини
    fun getName(): String {
        return name
    }

    // Публічна функція для встановлення імені тварини
    fun setName(newName: String) {
        name = newName
    }

    // Приватна функція, недоступна ззовні класу
    private fun privateFunction() {
        println("Це приватна функція")
    }
    open fun makeSound() {
        println("звук")
    }
    // Публічна функція, яка може бути викликана ззовні класу
    fun publicFunction() {
        println("Це публічна функція")
        // Викликаємо приватну функцію зсередини публічної функції
        privateFunction()
    }
}