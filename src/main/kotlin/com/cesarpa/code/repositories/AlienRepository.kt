package com.cesarpa.code.repositories

import com.cesarpa.code.model.Alien
import org.springframework.data.repository.CrudRepository


interface AlienRepository : CrudRepository<Alien, Integer> {
}