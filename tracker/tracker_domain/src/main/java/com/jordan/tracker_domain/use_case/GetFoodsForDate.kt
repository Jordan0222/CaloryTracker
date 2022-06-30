package com.jordan.tracker_domain.use_case

import com.jordan.tracker_domain.model.MealType
import com.jordan.tracker_domain.model.TrackableFood
import com.jordan.tracker_domain.model.TrackedFood
import com.jordan.tracker_domain.repository.TrackerRepository
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate
import kotlin.math.roundToInt

class GetFoodsForDate(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(date: LocalDate): Flow<List<TrackedFood>> {
        return repository.getFoodForDate(date)
    }
}