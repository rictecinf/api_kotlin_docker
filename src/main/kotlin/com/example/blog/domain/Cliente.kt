package com.example.blog.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Cliente(
        var login: String,
        var firstname: String,
        var lastname: String,
        var description: String? = null,
        @Id @GeneratedValue var id: Long? = null){

}
