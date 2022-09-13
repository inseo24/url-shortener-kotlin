package com.example.shortenerkotlin.repository

import com.example.shortenerkotlin.entity.Url
import org.springframework.data.jpa.repository.JpaRepository

interface UrlRepository : JpaRepository<Url, String>
