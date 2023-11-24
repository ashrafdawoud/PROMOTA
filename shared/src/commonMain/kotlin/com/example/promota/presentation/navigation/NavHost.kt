package com.example.promota.presentation.navigation

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

sealed class NavHost {
    object OpenDashboardScreen : NavHost()
    object OpenCategoryScreen : NavHost()
    object ProductsScreen : NavHost()
    object AddProductScreenRoute : NavHost()
    companion object {
        val navigationViewModel = NavigationViewModel()
    }
}

data class State(
    val screen: NavHost = NavHost.OpenDashboardScreen
)

class NavigationViewModel {
    private val _state: MutableStateFlow<State> = MutableStateFlow(State())
    val state: StateFlow<State> = _state
    private var stack: ArrayList<State> = arrayListOf()

    fun setState(state: State) {
        _state.value = state
        stack.add(state)
    }

    fun popUp(){
        stack.removeLast()
        _state.value = stack.last()
    }
}