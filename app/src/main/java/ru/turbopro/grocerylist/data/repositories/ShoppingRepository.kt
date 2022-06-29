package ru.turbopro.grocerylist.data.repositories

import ru.turbopro.grocerylist.data.db.entities.ShoppingItem
import ru.turbopro.grocerylist.data.db.ShoppingDatabase

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}