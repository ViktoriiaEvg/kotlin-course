package org.example.lessons.lesson05.homework

fun main() {
    //task 1
    val baseIntensity: Double = 3.0
    val coefficient: Double? = 0.73
    val baseCoefficient = 0.5
    val resultIntensity = baseIntensity * (coefficient ?: baseCoefficient)

    //task 2
    val defaultCost: Double = 50.0
    val cost: Double? = 20.0 // но может быть null
    val deliveryCost = 5.0
    val insuranceCoefficient = 0.005
    // стоимость страховки
    val insuranceCost = (cost ?: defaultCost) * insuranceCoefficient
    val totalCost: Double = deliveryCost + insuranceCost

    //task 3
    val pressure: String? = "34.6" // но может быть null
    val attentionMessage = "Attention, pressure is lost"
    val pressureForLab = pressure ?: attentionMessage
}