package com.back.domain.post.post.repository

import com.back.domain.post.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface PostRepository : JpaRepository<Post, Int> {

    @Query("SELECT p FROM Post p WHERE p.author.username = :username p.")
    fun findByUsernameAndPasswordAndNickname(username: String, password: String): List<Post>;

}
