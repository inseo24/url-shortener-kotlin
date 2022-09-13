package com.example.shortenerkotlin.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Url(
    @Id
    val hashValue: String,
    @Column
    val originalUrl: String
)
