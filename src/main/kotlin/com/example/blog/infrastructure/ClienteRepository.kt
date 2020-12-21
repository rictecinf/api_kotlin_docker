package com.example.blog.infrastructure

import com.example.blog.domain.Cliente
import org.springframework.data.repository.CrudRepository

interface ClienteRepository:CrudRepository<Cliente,Long> {

    fun findByLogin(login: String) = Cliente("ricardo","lima","fDSFSD","gdfgdf", 10L)
}