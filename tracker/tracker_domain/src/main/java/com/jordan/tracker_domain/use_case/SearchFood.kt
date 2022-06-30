package com.jordan.tracker_domain.use_case

import com.jordan.tracker_domain.model.TrackableFood
import com.jordan.tracker_domain.repository.TrackerRepository

class SearchFood(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(
        query: String,
        page: Int = 1,
        pageSize: Int = 40
    ): Result<List<TrackableFood>> {
        if (query.isBlank()) {
            return Result.success(emptyList())
        }
        // trim: 把空白的部份去掉，" hello " -> "hello"
        return repository.searchFood(query.trim(), page, pageSize)
    }
}