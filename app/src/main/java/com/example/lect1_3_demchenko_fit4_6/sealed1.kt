package com.example.lect1_3_demchenko_fit4_6

sealed class sealed1 {
    data class Square(val side: Int) : sealed1()
    data class Rectangle(val width: Int, val height: Int) : sealed1()
    data class Circle(val radius: Int) : sealed1()
}
