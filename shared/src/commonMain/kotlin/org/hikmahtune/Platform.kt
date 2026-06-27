package org.hikmahtune

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform