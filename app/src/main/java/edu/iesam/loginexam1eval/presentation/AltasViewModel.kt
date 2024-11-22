package edu.iesam.loginexam1eval.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import edu.iesam.loginexam1eval.domain.GetUserUseCase
import edu.iesam.loginexam1eval.domain.User

class AltasViewModel(
    private val getUserUseCase: GetUserUseCase
) : ViewModel() {

    private val _uiState = MutableLiveData<String>()
    val uiState: LiveData<String> = _uiState

    private fun darAlta(userId: String): User{
        return getUserUseCase.invoke(userId)
    }
}