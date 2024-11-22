package edu.iesam.loginexam1eval.domain

class GetUserUseCase(private val userRepository: UserRepository) {

    fun invoke(userId: String): User {
       return userRepository.getUser(userId)
    }
}