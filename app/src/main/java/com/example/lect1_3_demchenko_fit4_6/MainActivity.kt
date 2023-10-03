package com.example.lect1_3_demchenko_fit4_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // new branch dsffsdfdfgdfgdfg
        val ex1 = fish("tuna", 12)

        // Виклик методу класу
        val sp1 : Int
       sp1 =  ex1.speed()
       var k1 : Int = 5
        val figures = listOf(
            datac1(3, 4),
            datac1(2, 6),
            datac1(5, 7)
        )

        // Порахунок загальної суми полів area в циклі
        var totalArea = 0
        for (figure in figures) {
            totalArea += figure.area
        }

      //  println("Загальна площа усіх фігур: $totalArea")


        val shapes = listOf(
            sealed2.Rectangle(3, 5),
            sealed2.Oval(4, 6),
            sealed2.Line(10),
            sealed2.Rectangle(2, 4),
            sealed2.Line(7),
            sealed2.Oval(3, 3)
        )

        // Варіант 1: За допомогою фільтрації списку
        val rectanglesCount = shapes.filterIsInstance<sealed2.Rectangle>().size
        val ovalsCount = shapes.filterIsInstance<sealed2.Oval>().size
        val linesCount = shapes.filterIsInstance<sealed2.Line>().size

     //   println("Кількість Rectangle: $rectanglesCount")
     //   println("Кількість Oval: $ovalsCount")
     //   println("Кількість Line: $linesCount")

        // Варіант 2: З використанням when в циклі списку
        var rectanglesCountWhen = 0
        var ovalsCountWhen = 0
        var linesCountWhen = 0

        for (shape in shapes) {
            when (shape) {
                is sealed2.Rectangle -> rectanglesCountWhen++
                is sealed2.Oval -> ovalsCountWhen++
                is sealed2.Line -> linesCountWhen++
            }
        }

     //   println("Кількість Rectangle (з використанням when): $rectanglesCountWhen")
     //   println("Кількість Oval (з використанням when): $ovalsCountWhen")
     //   println("Кількість Line (з використанням when): $linesCountWhen")

    }




}


