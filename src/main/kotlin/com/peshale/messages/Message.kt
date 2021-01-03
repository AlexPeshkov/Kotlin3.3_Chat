package com.peshale.messages

import java.time.LocalDateTime

data class Message (
        val ownerId: Int,
        val text: String,
        val dateCreated: LocalDateTime,
        val isMissing: Boolean,
        val isDeleted: Boolean = false)
{

    enum class Incoming {
        Y,N
    }

}
