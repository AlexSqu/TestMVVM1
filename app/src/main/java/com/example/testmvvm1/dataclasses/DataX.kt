package com.example.testmvvm1.dataclasses

data class DataX(
    val deliveryInfo: DeliveryInfo,
    val deliveryUnit: DeliveryUnitX,
    val minOrderCost: Int,
    val price: Price,
    val supplier_display_name: String,
    val supplier_id: String,
    val supplier_product_id: String,
    val uuid: String
)