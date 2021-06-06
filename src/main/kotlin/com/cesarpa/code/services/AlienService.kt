package com.cesarpa.code.services

import com.cesarpa.code.model.Alien
import com.cesarpa.code.repositories.AlienRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AlienService(
    @Autowired
    var repo: AlienRepository
) {

    @RequestMapping("alien")
    fun getAlien(): MutableIterable<Alien> {
        var aliens = repo.findAll()
        return aliens
    }
}