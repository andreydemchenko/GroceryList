package ru.turbopro.grocerylist.ui.shoppinglist

import ru.turbopro.grocerylist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}