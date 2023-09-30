package com.example.kmm_android_ios

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform