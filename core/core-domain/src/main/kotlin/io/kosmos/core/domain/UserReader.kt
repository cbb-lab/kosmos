package io.kosmos.core.domain

class UserReader(
    private val userRepository: UserRepository,
) {
    fun read(id: Long) =
        userRepository.findById(id) ?: throw IllegalArgumentException("User not found id = $id")

    fun read(name: String) =
        userRepository.findByName(name) ?: throw IllegalArgumentException("User not found name = $name")
}