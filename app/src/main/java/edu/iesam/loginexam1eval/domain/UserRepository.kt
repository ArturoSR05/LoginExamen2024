package edu.iesam.loginexam1eval.domain

interface UserRepository {

     fun getUser(userId: String): User
}