package com.jordan.tracker_domain.model

sealed class MealType(val name: String) {
    object Breakfast: MealType("早餐")
    object Lunch: MealType("午餐")
    object Dinner: MealType("晚餐")
    object Snack: MealType("點心")

    companion object {
        fun fromString(name: String): MealType {
            return when (name) {
                "早餐" -> Breakfast
                "午餐" -> Lunch
                "晚餐" -> Dinner
                "點心" -> Snack
                else -> Breakfast
            }
        }
    }
}
