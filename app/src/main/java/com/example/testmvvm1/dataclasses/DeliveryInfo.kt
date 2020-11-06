package com.example.testmvvm1.dataclasses

data class DeliveryInfo(
    val deliveryDays: DeliveryDays,
    val deliveryPeriod: DeliveryPeriod,
    val deliveryPrice: Int,
    val minOrderCost: Int,
    val nearestDeliveryDate: String,
    val paymentInfo: PaymentInfo
)