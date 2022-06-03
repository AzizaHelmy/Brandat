package com.example.brandat.ui.fragments.category

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {

    val positionMutable = MutableLiveData<List<String>>()

    fun setCategory(category: String, subCategory:String) {
        positionMutable.value = listOf(category,subCategory)
    }

}