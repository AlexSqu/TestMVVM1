package com.example.testmvvm1.dataclasses

data class Data(
    val attributes: Attributes,
    val brand: Int,
    val brand_name: String,
    val category_ids: List<Int>,
    val deliveryUnit: DeliveryUnit,
    val favorite: Boolean,
    val has_case_sale: Boolean,
    val images: List<String>,
    val name: String,
    val offers: Offers,
    val price: Double,
    val seo_name: String,
    val uuid: String
)