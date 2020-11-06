package com.example.testmvvm1.dataclasses

data class DeliveryDays(
    val friday: Boolean,
    val friday_time: FridayTime,
    val monday: Boolean,
    val monday_time: MondayTime,
    val saturday: Boolean,
    val saturday_time: SaturdayTime,
    val sunday: Boolean,
    val sunday_time: SundayTime,
    val thursday: Boolean,
    val thursday_time: ThursdayTime,
    val tuesday: Boolean,
    val tuesday_time: TuesdayTime,
    val wednesday: Boolean,
    val wednesday_time: WednesdayTime
)