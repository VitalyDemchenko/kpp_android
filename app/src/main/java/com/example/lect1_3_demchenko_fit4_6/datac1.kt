package com.example.lect1_3_demchenko_fit4_6

data class datac1(var width: Int, var height: Int) {
    var area: Int = 0
        private set(value) {
            field = value
        }
        get() = width * height
}