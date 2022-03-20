package com.randyahx.core.domain.model

sealed class GoalType(val name: String) {
    object KeepWeight: GoalType("keep_weight")
    object GainWeight: GoalType("gain_weight")
    object LoseWeight: GoalType("lose_weight")

    companion object {
        fun fromString(name: String): GoalType {
            return when(name) {
                "keep_weight" -> KeepWeight
                "gain_weight" -> GainWeight
                "lose_weight" -> LoseWeight
                else -> KeepWeight
             }
        }
    }
}