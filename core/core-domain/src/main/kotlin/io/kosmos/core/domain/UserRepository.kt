package io.kosmos.core.domain

interface UserRepository {
    fun save(user: User): User
    fun findById(id: Long): User?
    fun findByName(name: String): User?
}