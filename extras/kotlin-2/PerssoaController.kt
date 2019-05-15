package br.com.wswork.youtube.controller;

import br.com.wswork.youtube.entity.Pessoa
import br.com.wswork.youtube.repository.PessoaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

const val ENDPOINT_PATH = "/pessoa"

@RestController
class PessoaController  {

    @Autowired
    lateinit var repository: PessoaRepository

    @GetMapping(ENDPOINT_PATH)
    fun list(): List<Pessoa> {
        return repository.findAll()
    }

    @PostMapping(ENDPOINT_PATH)
    fun add (@RequestBody pessoa: Pessoa){
        repository.save(pessoa)
    }

    @DeleteMapping(ENDPOINT_PATH)
    fun delete(@RequestBody pessoa: Pessoa){
        repository.delete(pessoa)
    }

}