package com.example.dessertclicker.ui

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DessertViewModel {
    private val _dessertUiState = MutableStateFlow(DessertViewModel())
    val dessertViewModel: StateFlow<DessertViewModel> = _dessertUiState.asStateFlow()


}