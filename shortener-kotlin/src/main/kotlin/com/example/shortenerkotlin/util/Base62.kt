package com.example.shortenerkotlin.util

import org.springframework.stereotype.Component
import java.math.BigInteger

const val BASE_FORMAT = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
const val BASE: Int = 62

@Component
class Base62 {
    fun encoding(hashValue: BigInteger): String {
        var value = hashValue
        if (value.compareTo(BigInteger.ZERO) == 0) {
            return BASE_FORMAT[0].toString()
        }

        val sb: StringBuffer = StringBuffer();

        while (hashValue > BigInteger.ZERO) {
            sb.append(BASE_FORMAT[hashValue.mod(BigInteger.valueOf(BASE.toLong())).toInt()])
            value = value.divide(BigInteger.valueOf(BASE.toLong()))
        }
        return sb.reverse().toString()
    }
}
