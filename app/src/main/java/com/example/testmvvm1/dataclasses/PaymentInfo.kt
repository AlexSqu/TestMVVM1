package com.example.testmvvm1.dataclasses

data class PaymentInfo(
    val accountingSystem: String,
    val defermentPeriod: Int,
    val isCache: Boolean,
    val isCacheless: Boolean,
    val isDefermentPayment: Boolean
)