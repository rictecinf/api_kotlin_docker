package com.example.blog.controller

import com.example.blog.domain.Cliente
import com.example.blog.infrastructure.ClienteRepository
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("cliente")
class HelloWorldController(private val clienteRepository: ClienteRepository) {

    @Value("\${ambiente.teste}")
    private lateinit  var ambiente:String

    @GetMapping
    fun teste(@RequestParam("login") login:String): Cliente {
        println("Passou aqui")
       val cliente =clienteRepository.findByLogin(login)
        return cliente
    }

    @GetMapping("/{id}")
    fun findClienteById(@PathVariable("id") id:Long) = clienteRepository.findById(id)

    @PostMapping
    fun salvar(@RequestBody cliente: Cliente) = clienteRepository.save(cliente)
}