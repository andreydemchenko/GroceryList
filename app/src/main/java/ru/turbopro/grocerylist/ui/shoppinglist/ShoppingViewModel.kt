package ru.turbopro.grocerylist.ui.shoppinglist

import androidx.lifecycle.ViewModel
import ru.turbopro.grocerylist.data.db.entities.ShoppingItem
import ru.turbopro.grocerylist.data.repositories.ShoppingRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ShoppingViewModel(
    private val repository: ShoppingRepository
) : ViewModel() {

    fun upsert(item: ShoppingItem) =
        GlobalScope.launch {
            repository.upsert(item)
        }

    fun delete(item: ShoppingItem) = GlobalScope.launch {
        repository.delete(item)
    }

    fun getAllShoppingItems() = repository.getAllShoppingItems()
}
