package com.cesarpa.code.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Alien(
    @Id
    var id: Int? = null, var name: String? = null, var points: Int? = null

)