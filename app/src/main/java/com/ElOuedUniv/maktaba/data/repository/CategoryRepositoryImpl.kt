package com.ElOuedUniv.maktaba.data.repository

import com.ElOuedUniv.maktaba.data.model.Category
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class CategoryRepositoryImpl @Inject constructor() : CategoryRepository {

    private val categories = listOf(
        Category(id = "1", name = "Programming", description = "Books about software development and coding"),
        Category(id = "2", name = "Algorithms", description = "Books about algorithms and data structures"),
        Category(id = "3", name = "Databases", description = "Books about database design and management"),
        Category(id = "4", name = "Mobile Development", description = "Books about Android and mobile app development"),
        Category(id = "5", name = "Artificial Intelligence", description = "Books about AI, machine learning, and data science")
    )

    override fun getAllCategories(): Flow<List<Category>> {
        return flowOf(categories)
    }

    override fun getCategoryById(id: String): Category? {
        return categories.find { it.id == id }
    }
}